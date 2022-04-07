package chapter_six;

import java.util.Scanner;

/**
 * 14. Traditional password entry schemes are susceptible to “shoulder surfing” in which
 * an attacker watches an unsuspecting user enter his or her password or PIN number
 * and uses it later to gain access to the account. One way to combat this problem
 * is with a randomized challenge-response system. In these systems, the user enters
 * different information every time based on a secret in response to a randomly generated
 * challenge. Consider the following scheme in which the password consists of a
 * five-digit PIN number (00000 to 99999). Each digit is assigned a random number
 * that is 1, 2, or 3. The user enters the random numbers that correspond to their PIN
 * instead of their actual PIN numbers.
 *  For example, consider an actual PIN number of 12345. To authenticate it, the user
 * would be presented with a screen such as the following:
 *  PIN: 0 1 2 3 4 5 6 7 8 9
 *  NUM: 3 2 3 1 1 3 2 2 1 3
 *  The user would enter 23113 instead of 12345. This does not divulge the password
 * even if an attacker intercepts the entry because 23113 could correspond to other
 * PIN numbers, such as 69440 or 70439. The next time the user logs in, a different
 * sequence of random numbers would be generated, such as the following:
 *  PIN: 0 1 2 3 4 5 6 7 8 9
 *  NUM: 1 1 2 3 1 2 2 3 3 3
 *  Your program should simulate the authentication process. Store an actual PIN
 * number in your program. The program should use an array to assign random
 * numbers to the digits from 0 to 9. Output the random digits to the screen, input
 * the response from the user, and output whether or not the user’s response correctly
 * matches the PIN number
 *
 * @author Sharaf Qeshta
 * */



public class Exercise_06_14
{
    private static final String actualPIN = "12345";

    private static final int[] digits = new int[9];
    private static final int[] displayDigit = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args)
    {
        fill();
        Scanner scanner = new Scanner(System.in);

        printArray(displayDigit, "PIN");
        printArray(digits, "NUM");

        System.out.print("Enter Password: ");
        String password = scanner.next();

        if (password.equals(getExpectedInput()))
            System.out.println("Permission Granted");
        else
            System.out.println("Wrong Password!!");
    }

    public static void printArray(int[] array, String title)
    {
        System.out.print(title + ": ");
        for (int i = 0; i < array.length; i++)
            System.out.print(" " + array[i] + " ");
        System.out.println();
    }

    // this function will be executed for every login request
    public static void fill()
    {
        for (int i = 0; i < digits.length; i++)
            digits[i] = (int) (Math.random() * 10 % 3) + 1;
    }

    public static String getExpectedInput()
    {
        String expectedInput = "";
        for (int i = 0; i < actualPIN.length(); i++)
        {
            int digit = Integer.parseInt(actualPIN.charAt(i)  + "");
            expectedInput += digits[getIndex(digit)];
        }
        return expectedInput;
    }

    public static int getIndex(int i)
    {
        for (int j = 0; j < displayDigit.length; j++)
        {
            if (displayDigit[j] == i)
                return j;
        }
        return -1;
    }

}
