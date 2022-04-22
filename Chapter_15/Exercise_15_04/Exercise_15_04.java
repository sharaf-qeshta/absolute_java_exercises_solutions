package chapter_fifteen;

/**
 * 4. In reference to the previous two problems, again modify the program to make use
 * of the LinkedList class to implement a double-ended queue. In a double-ended
 * queue, insertion and deletion can be carried out at both the ends. Add methods
 * to add and remove elements in this double-ended queue.
 *
 * @author Sharaf Qeshta */


public class Exercise_15_04
{
    public static void main(String[] args)
    {
        IntegerStack integers = new IntegerStack();
        integers.addLast(1);
        integers.addLast(2);
        integers.addLast(3);
        integers.addLast(4);
        integers.addLast(5);

        /* [1, 2, 3, 4, 5] */
        System.out.println(integers);

        System.out.println(integers.removeLast()); // 5
        System.out.println(integers.removeLast()); // 4
        System.out.println(integers.removeLast()); // 3
        System.out.println(integers.removeLast()); // 2
        System.out.println(integers.removeLast()); // 1
    }
}
