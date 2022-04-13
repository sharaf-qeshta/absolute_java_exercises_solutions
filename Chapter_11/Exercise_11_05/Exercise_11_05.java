package chapter_eleven;


import java.util.Scanner;

/**
 * 5. Write a recursive method definition to implement a method named findNumber
 * that has two parameters: the first is an array of integers, and the second is the
 * number to search. This parameter should receive from the user a list of n integer
 * values. This method should search the number using a binary search. For example,
 * if the user enters the values (23 34 45 65 78 90 98) the output should be Number
 * found in array or Number not found in array. Also, write the main method
 * to implement the program.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_11_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter Element " + (i+1) + ": ");
            int element = scanner.nextInt();
            array[i] = element;
        }

        System.out.print("Enter A Number To Search: ");
        int n = scanner.nextInt();

        System.out.println(findNumber(array, n));
    }


    public static String findNumber(int[] array, int n)
    {
        if (array.length == 0)
            return n + " not found in array";

        int index = array.length/2;
        if (n == array[index])
            return n + " found in array";
        else
        {
            int[] temp = new int[index];
            if (n > array[index]) // go right
            {
                int x = 0;
                for (int i = index+1; i < array.length; i++)
                    temp[x++] = array[i];
            }
            else // go left
            {
                for (int i = 0; i < index; i++)
                    temp[i] = array[i];
            }
            return findNumber(temp, n);
        }
    }

}
