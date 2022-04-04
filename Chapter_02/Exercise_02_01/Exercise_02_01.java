package chapter_two;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1. The Babylonian algorithm to compute the square root of a positive number n is as
 * follows:
 *  1. Make a guess at the answer (you can pick n/2 as your initial guess).
 *  2. Compute r = n / guess
 *  3. Set guess = (guess +r)/ 2
 *  4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
 * 2 and 3, the closer guess will become to the square root of n.
 *  Write a program that inputs a double for n, iterates through the Babylonian algorithm
 *  five times, and outputs the answer as a double to two decimal places. Your
 * answer will be most accurate for small values of n.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_02_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = scanner.nextInt();

        double guess = n/2.0;

        for (int i = 0; i < 5; i++)
        {
            double r = n/guess;
            guess = (guess+r) / 2;
        }

        DecimalFormat format = new DecimalFormat(".00");
        System.out.println("the square root of " + n + " is " + format.format(guess));

    }
}
