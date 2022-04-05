package chapter_three;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1. (This is a version of Programming Project 2.1 from Chapter 2.) The Babylonian
 * algorithm to compute the square root of a positive number n is as follows:
 *  1. Make a guess at the answer (you can pick n/2 as your initial guess).
 *  2. Compute r = n / guess.
 *  3. Set guess = (guess +r) / 2.
 *  4. Go back to step 2 until the last two guess values are within 1% of each other.
 *  Write a program that inputs a double for n, iterates through the Babylonian algorithm
 *  until the guess is within 1% of the previous guess and outputs the answer
 * as a double to two decimal places. Your answer should be accurate even for large
 * values of n.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_03_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = scanner.nextInt();

        double guess = n/2.0;
        double previousGuess;
        boolean iterate = true;

        while (iterate)
        {
            previousGuess = guess;
            double r = n/guess;
            guess = (guess+r) / 2;

            if (previousGuess-guess <= previousGuess/100)
                iterate = false;
        }

        DecimalFormat format = new DecimalFormat(".00");
        System.out.println("the square root of " + n + " is " + format.format(guess));
    }
}
