package chapter_six;

import java.util.Scanner;

/**
 * 6. Write a program that reads numbers from the keyboard into an array of type
 * int[]. You may assume that there will be 50 or fewer entries in the array. Your
 * program allows any number of numbers to be entered, up to 50. The output is to
 * be a two-column list. The first column is a list of the distinct array elements; the
 * second column is the count of the number of occurrences of each element. The list
 * should be sorted on entries in the first column, largest to smallest.
 *  For the array
 *  –12 3 –12 4 1 1 –12 1 –1 1 2 3 4 2 3 –12
 *  the output should be
 *  N Count
 *  4 2
 *  3 3
 *  2 2
 *  1 4
 *  –1 1
 *  –12 4
 *
 *
 *  @author Sharaf Qeshta*/



public class Exercise_06_06
{
    private static final int[] arr = new int[50];


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Array Elements: ");
        String elements = scanner.nextLine();

        scanner.close();
        scanner = new Scanner(elements);

        for (int i = 0; i < 50 && scanner.hasNext(); i++)
        {
            int n = scanner.nextInt();
            arr[i] = n;
        }

        int[] output = new int[arr.length];
        int[] count = new int[arr.length];

        int index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
                break;
            int idx1 = isIn(output, arr[i]);
            if (idx1 > -1)
            {
                count[idx1] += 1;
            }
            else
            {
                output[index] = arr[i];
                count[index++] = 1;
            }
        }

        sort(output, count);

        System.out.println("N\tCount");
        for (int i = 0; i < output.length; i++)
        {
            if (output[i] == 0)
                break;
            System.out.println(output[i] + "\t" + count[i]);
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


    public static void sort(int[] array, int[] count)
    {
        for (int i = 0; i < array.length; i++)
        {
            int max = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] == 0)
                    continue;
                if (array[max] < array[j])
                    max = j;
            }
            int temp = array[max];
            int temp2 = count[max];

            array[max] = array[i];
            count[max] = count[i];

            array[i] = temp;
            count[i] = temp2;
        }
    }
}
