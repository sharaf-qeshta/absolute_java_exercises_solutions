package chapter_twelve;


import java.util.Arrays;

/**
 * 8. Redo the QuickSort class to have the modifications given for Programming
 * Projects 12.6 and 12.7.
 *
 * @author Sharaf Qeshta */


public class Exercise_12_08
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
