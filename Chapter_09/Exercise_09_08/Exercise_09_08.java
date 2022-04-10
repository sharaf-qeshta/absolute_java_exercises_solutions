package chapter_nine;

import java.util.Arrays;

/**
 * 8. Study the class java.util.Arrays from the Oracle documentation located at
 * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html. The sort method
 * throws an IllegalArgumentException and an OutOfBoundsException. Write
 * a short Java test program that sorts an array of integers and outputs
 * the array elements in sorted order. Your program should catch both of the exceptions listed
 * above. Modify your program to test that the exceptions are properly caught.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_09_08
{
    public static void main(String[] args)
    {
       int[] integers = {5, 8, 1, 3, 7, 10, 4, 2, 0, -10, 12};

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers)); // [-10, 0, 1, 2, 3, 4, 5, 7, 8, 10, 12]

        // let`s catch IllegalArgumentException

        /*
        * as listed in the docs if fromIndex > toIndex
        * it will throw IllegalArgumentException
        * @throws IllegalArgumentException if {@code fromIndex > toIndex}
        * */
        try {
            Arrays.sort(integers, 6, 5);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage()); // fromIndex(6) > toIndex(5)
        }


        // catching ArrayIndexOutOfBoundsException
        /*
        * snapshot from the documentation
        * @throws ArrayIndexOutOfBoundsException
                if {@code fromIndex < 0} or {@code toIndex > a.length}
        * */

        try {
            Arrays.sort(integers, 100, 120);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage()); // Array index out of range: 120
        }
    }
}
