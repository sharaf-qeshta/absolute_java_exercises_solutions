package chapter_fifteen;

import java.util.Iterator;

/**
 * 7. Add a remove method and an iterator for the Set class in Display 15.37. Write a
 * suitable test program.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_07
{
    public static void main(String[] args)
    {
        Set<Integer> set = new Set<>();

        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);

        /* 13 12 11 10 */
        Iterator<Integer> iterator = set.setIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        /* 13 12 11 10 */
        set.output();

        set.remove(10);
        /* 11 12 13 */
        set.output();
        set.remove(11);
        /* 13 12 */
        set.output();
        set.remove(12);
        /* 13 */
        set.output();
        set.remove(13);

    }
}
