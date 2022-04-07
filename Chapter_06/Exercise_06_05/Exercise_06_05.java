package chapter_six;

import java.util.Scanner;

/**
 * 5. Write a program that takes as input a set of 15 numbers from the keyboard into an
 * array of type int[]. Create another array that will also read 15 other numbers of
 * type int into it. Now merge the elements of these two arrays into one. The output
 * is to be a two-column list. The first column is a list of the distinct array elements;
 * the second column is the count of the number of occurrences of each element.
 *  For example, if the elements of the first array are:
 *  –22, 3, –22, 4, 1, 1, –22, 1, –1, 1, 2, 3, 4, 2, –22
 *  And the elements of second array are:
 *  –1, 1, 2, 3, 4, 2, –22, –22, 3, –22, 4, 1, 1, –22, 1
 *  Then output should be
 *  N Count
 *  –22 8
 *  –1 2
 *  1 8
 *  2 4
 *  3 4
 *  4 4
 *
 *  @author Sharaf Qeshta*/



public class Exercise_06_05
{
    private static final int[] arr1 = new int[15];
    private static final int[] arr2 = new int[15];

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Array 15 Elements: ");

        for (int i = 0; i < 15; i++)
        {
            int n = scanner.nextInt();
            arr1[i] = n;
        }


        System.out.print("Enter the Second Array 15 Elements: ");

        for (int i = 0; i < 15; i++)
        {
            int n = scanner.nextInt();
            arr2[i] = n;
        }

        // merge the two arrays
        int[] merged = new int[arr1.length + arr2.length];
        int[] count = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < 15; i++)
        {
            int idx1 = isIn(merged, arr1[i]);
            if (idx1 > -1)
            {
                count[idx1] += 1;
            }
            else
            {
                merged[index] = arr1[i];
                count[index++] = 1;
            }

            int idx2 = isIn(merged, arr2[i]);
            if (idx2 > -1)
            {
                count[idx2] += 1;
            }
            else
            {
                merged[index] = arr2[i];
                count[index++] = 1;
            }
        }

        System.out.println("N\tCount");
        for (int i = 0; i < merged.length; i++)
        {
            if (count[i] == 0 && merged[i] == 0)
                break;
            System.out.println(merged[i] + "\t" + count[i]);
        }
    }


    public static int isIn(int[] array, int element)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == element) return i;
        }
        return -1;
    }
}
