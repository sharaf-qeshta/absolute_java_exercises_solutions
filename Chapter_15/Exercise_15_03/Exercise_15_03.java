package chapter_fifteen;

/**
 * 3. Extend the previous problem to create a list that will act as a stack. A stack is a data
 * structure that follows the last-in first-out order for the addition and deletion of
 * elements. This list will contain the following items of integer type values. Modify the
 * method implemented in the previous problem for addition of an item in the stack
 * to create a push method. Also, modify the remove method for deleting items from
 * the stack to create a pop method. Do remember that the elements are inserted or
 * deleted from only one end of the stack.
 *
 * @author Sharaf Qeshta */


public class Exercise_15_03
{
    public static void main(String[] args)
    {
        IntegerStack integers = new IntegerStack();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        integers.push(5);

        /* [5, 4, 3, 2, 1] */
        System.out.println(integers); // last-in first-out

        System.out.println(integers.pop()); // 5
        System.out.println(integers.pop()); // 4
        System.out.println(integers.pop()); // 3
        System.out.println(integers.pop()); // 2
        System.out.println(integers.pop()); // 1
    }
}
