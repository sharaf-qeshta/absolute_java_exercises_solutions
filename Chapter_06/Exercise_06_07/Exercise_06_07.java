package chapter_six;

import java.util.Scanner;

/**
 * 7. An array can be used to store large integers one digit at a time.
 *  For example, the integer 1234 could be stored in the array a by setting a[0] to 1,
 * a[1] to 2, a[2] to 3, and a[3] to 4. However, for this exercise you might find it
 * more useful to store the digits backward; that is, place 4 in a[0], 3 in a[1], 2 in
 * a[2], and 1 in a[3]. In this exercise, write a program that reads in 2 positive
 * integers that are 20 or fewer digits in length and then outputs the sum of the 2
 * numbers. Your program will read the digits as values of type char so that the number
 * 1234 is read as the four characters '1', '2', '3', and '4'. After they are read into
 * the program, the characters are changed to values of type int. The digits should
 * be read into a partially filled array; you might find it useful to reverse the order
 * of the elements in the array after the array is filled with data from the keyboard.
 * (Whether or not you reverse the order of the elements in the array is up to you. It
 * can be done either way, and each way has its advantages and disadvantages.) Your
 * program should perform the addition by implementing the usual paper-and-pencil
 * addition algorithm. The result of the addition should be stored in an array of size
 * 20, and the result should then be written to the screen. If the result of the addition
 * is an integer with more than the maximum number of digits (that is, more than
 * 20 digits), then your program should issue a message saying that it has encountered
 * “integer overflow.” You should be able to change the maximum length of the
 * integers by changing only one named constant. Include a loop that allows the user to
 * continue to do more additions until the user says the program should end.
 *
 * @author Sharaf Qeshta
 * */



public class Exercise_06_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter Q in any field To Exit!!");
            System.out.print("Enter Number 1: ");
            String num1 = scanner.next();

            System.out.print("Enter Number 2: ");
            String num2 = scanner.next();

            if (num1.equals("Q") || num2.equals("Q"))
                System.exit(0);

            if (num1.length() > 20 || num2.length() > 20)
            {
                System.out.println("Fatal Error: integer overflow ");
                continue;
            }

            int[] result = sum(num1, num2);

            System.out.print("\n" + num1 + " + " + num2 + " = ");
            boolean start = false;
            for (int i = result.length-1; i > -1; i--)
            {
                if (result[i] != 0 && !start)
                    start = true;
                if (start)
                    System.out.print(result[i]);
            }

            System.out.println();
        }
    }

    public static int[] sum(String num1, String num2)
    {
        char[] arr1 = reverse(num1.toCharArray());
        char[] arr2 = reverse(num2.toCharArray());
        int[] result = new int[num1.length() + num2.length()];

        char[] bigger = (arr1.length >= arr2.length)? arr1 : arr2;
        int sumIndex = 0;
        int next = 0;
        for (int i = 0; i < bigger.length ; i++)
        {
            int sum;
            if (i < arr1.length && i < arr2.length)
                sum = Integer.parseInt(arr1[i] + "") +  Integer.parseInt(arr2[i] + "") + next;
            else
                sum = Integer.parseInt(bigger[i] + "") + next;

            if (i == bigger.length-1)
            {
                result[sumIndex++] = sum;
            }
            else{
                result[sumIndex++] = sum % 10;
                next = sum / 10;
            }
        }

        if (getSize(result) > 20)
        {
            System.out.println("Fatal Error: integer overflow ");
            System.exit(-1);
        }
        return result;
    }


    public static char[] reverse(char[] array)
    {
        char[] out = new char[array.length];
        int index = 0;
        for (int i = array.length-1; i > -1; i--)
            out[i] = array[index++];
        return out;
    }


    public static int getSize(int[] array)
    {
        int size = 0;
        boolean start = false;
        for (int i = array.length-1; i > -1; i--)
        {
            if (array[i] != 0 && !start)
                start = true;

            if (start)
                size++;
        }
        return size;
    }

}
