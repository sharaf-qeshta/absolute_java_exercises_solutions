package chapter_sixteen;

import java.util.*;

/**
 * 6. In a fairyland, the beautiful daughter Laura of the King Charles decided to marry.
 * To help her choose from the many suitors she decided on the following procedure.
 * First, all of the suitors would be lined up one after the other and assigned numbers.
 * The first suitor would be number 1, the second number 2, and so on up to the last
 * suitor, number n. For our implementation let’s consider the value of n to be 56.
 * Starting from the first suitor, she would then count five suitors down the line and
 * the fifth suitor would be eliminated from winning her hand and removed from the
 * line. Laura would then continue, counting five more suitors, and eliminating every
 * fifth suitor. When she reaches the end of the line, she would reverse direction and
 * work her way back to the beginning. Similarly on reaching the first person in line,
 * she would reverse direction and make her way to the end of the line.
 *  For example, if there were five suitors, then the elimination process would
 * proceed as follows:
 *  12345 Initial list of suitors; start counting from 1.
 *  1234 Suitor 5 eliminated; bounce from end back to 1 and keep counting.
 *
 *  234 Suitor 1 eliminated; continue counting back from 2.
 *  24 Next, Suitor 3 is eliminated; the counting is continued.
 *  2 Suitor 4 is eliminated; 2 is the lucky winner.
 *  Write a program that uses an ArrayList or Vector to determine which position
 * you should stand in to marry Laura if there are n suitors. Your program should
 * use the Listiterator interface to traverse the list of suitors and remove a suitor.
 * Be sure that you iterate references the proper object while bouncing back to the
 * beginning of the list of suitors. The suitor at the start of the list should only be
 * counted once when Laura reverses the count.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_16_06
{
    public static void main(String[] args)
    {
        /*
        * 12345	 Suitor 5 Eliminated
        * 1234	 Suitor 1 Eliminated
        * 234	 Suitor 3 Eliminated
        * 24	 Suitor 4 Eliminated
        * The Luckiest Suitor is 2
        * */
        System.out.println("The Luckiest Suitor is " + getTheLuckySuitor(5));

        System.out.println();

        /*
        * 12345678910	 Suitor 5 Eliminated
        * 1234678910	 Suitor 10 Eliminated
        * 12346789	 Suitor 6 Eliminated
        * 1234789	 Suitor 2 Eliminated
        * 134789	 Suitor 9 Eliminated
        * 13478	 Suitor 8 Eliminated
        * 1347	 Suitor 1 Eliminated
        * 347	 Suitor 4 Eliminated
        * 37	 Suitor 7 Eliminated
        * The Luckiest Suitor is 3
        * */
        System.out.println("The Luckiest Suitor is " + getTheLuckySuitor(10));
    }

    public static int getTheLuckySuitor(int suitors)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < suitors+1; i++)
            list.add(i);

        int i = 0;
        Iterator<Integer> iterator = getIterator(list, 0);
        int currentValue = 0;
        while (iterator.hasNext())
        {
            if (i == 5)
            {
                printValues(list);
                System.out.println("\t Suitor " + currentValue + " Eliminated");
                int index = list.indexOf(currentValue);
                list.remove(index);
                i = 0;
                iterator = getIterator(list, index);
            }
            else
            {
                currentValue = iterator.next();
                i++;
            }
        }
        return list.get(0);
    }


    public static void printValues(ArrayList<Integer> list)
    {
        for (int x: list)
            System.out.print(x);
    }


    public static Iterator<Integer> getIterator(ArrayList<Integer> list, int seek)
    {
        return new Iterator<>()
        {
            int index = seek;

            @Override
            public boolean hasNext()
            {
                return list.size() != 1;
            }

            @Override
            public Integer next()
            {
                index = (index >= list.size()) ? 0 : index;
                return list.get(index++);
            }
        };
    }
}
