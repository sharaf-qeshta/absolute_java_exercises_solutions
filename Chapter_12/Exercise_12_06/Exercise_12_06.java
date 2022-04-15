package chapter_twelve;


import java.util.Arrays;

/**
 * 6. Recode the QuickSort class implementation by adding two efficiency
 * improvements to the method sort: (1) Eliminate the calls to join, because it accomplishes
 * nothing. (2) Add code for the special case of an array of exactly two elements and
 * make the general case apply to arrays of three or more elements.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_12_06
{
    public static void main(String[] args)
    {
        double[] a = {1.2, 5.3, 7.4, 2.5, 9.3, 15.25, 4.23};
        QuickSort.sort(a, 0, a.length-1);
        /* [1.2, 2.5, 4.23, 5.3, 7.4, 9.3, 15.25] */
        System.out.println(Arrays.toString(a));

        double[] a2 = {5.3, 1.2};
        QuickSort.sort(a2, 0, a2.length-1);
        /* [1.2, 5.3] */
        System.out.println(Arrays.toString(a2));
    }
}
