package chapter_fifteen;

import java.util.ArrayList;

/**
 * 1. In an ancient land, the beautiful princess Eve had many suitors. She decided on the
 * following procedure to determine which suitor she would marry. First, all of the
 * suitors would be lined up one after the other and assigned numbers. The first suitor would
 * be number 1, the second number 2, and so on up to the last suitor, number n. Starting
 * at the suitor in the first position, she would then count three suitors down the line
 * (because of the three letters in her name), and the third suitor would be eliminated
 * from winning her hand and removed from the line. Eve would then continue,
 * counting three more suitors, and eliminate every third suitor. When she reached the end of
 * the line, she would continue counting from the beginning.
 * For example, if there were six suitors, the elimination process would proceed
 * as follows:
 * 123456 Initial list of suitors; start counting from 1.
 * 12456 Suitor 3 eliminated; continue counting from 4.
 * 1245 Suitor 6 eliminated; continue counting from 1.
 * 125 Suitor 4 eliminated; continue counting from 5.
 * 15 Suitor 2 eliminated; continue counting from 5.
 * 1 Suitor 5 eliminated; 1 is the lucky winner.
 *  Write a program that creates a circular linked list of nodes to determine which
 *  position you should stand in to marry the princess if there are n suitors. Your program
 * should simulate the elimination process by deleting the node that corresponds to
 * the suitor that is eliminated for each step in the process.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_01
{
    public static void main(String[] args)
    {
        /*
        * 123456 Suitor 3 Eliminated
        * 12456	 Suitor 6 Eliminated
        * 1245	 Suitor 4 Eliminated
        * 125	 Suitor 2 Eliminated
        * 15	 Suitor 5 Eliminated
        * The Luckiest Suitor is 1
        * */
        System.out.println("The Luckiest Suitor is " + getTheLuckySuitor(6));

        /*
        * 12345678910	 Suitor 3 Eliminated
        * 1245678910	 Suitor 6 Eliminated
        * 124578910	 Suitor 9 Eliminated
        * 12457810	 Suitor 2 Eliminated
        * 1457810	 Suitor 7 Eliminated
        * 145810	 Suitor 1 Eliminated
        * 45810	         Suitor 8 Eliminated
        * 4510	         Suitor 5 Eliminated
        * 410	         Suitor 10 Eliminated
        * The Luckiest Suitor is 4
        * */
        System.out.println("The Luckiest Suitor is " + getTheLuckySuitor(10));

        /*
        * 1234	 Suitor 3 Eliminated
        * 124	 Suitor 2 Eliminated
        * 14	 Suitor 4 Eliminated
        * The Luckiest Suitor is 1
        * */
        System.out.println("The Luckiest Suitor is " + getTheLuckySuitor(4));
    }

    public static int getTheLuckySuitor(int suitors)
    {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        for (int i = 1; i < suitors+1; i++)
            list.add(i);

        int i = 0;
        int index = 0;
        while (list.getList().size() != 1)
        {
            if (i == 2)
            {
                printValues(list.getList());
                System.out.println("\t Suitor " + list.getList().get(index).getValue() + " Eliminated");
                list.remove(index);
                i = 0;
            }
            else
            {
                try
                {
                    index = list.getList().get(index).getNextIndex();
                }
                catch (Exception ex)
                {
                    index = list.getList().get(0).getNextIndex();
                }
                i++;
            }
        }
        return list.getList().get(0).getValue();
    }


    public static void printValues(ArrayList<Node<Integer>> list)
    {
        for (Node<Integer> x: list)
            System.out.print(x.getValue());
    }
}
