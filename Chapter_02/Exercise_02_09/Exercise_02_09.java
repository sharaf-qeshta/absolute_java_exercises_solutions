package chapter_two;

import java.util.Scanner;

/**
 * 9. (This is a better version of an exercise from Chapter 1.) Write a program that
 * reads in a line of text and then outputs that line of text with the first occurrence of
 * "hate" changed to "love". For example, a possible sample dialogue might be the
 * following:
 *  Enter a line of text.
 *  I hate you.
 *  I have rephrased that line to read:
 *  I love you.
 *  You can assume that the word "hate" occurs in the input. If the word "hate"
 * occurs more than once in the line, your program should replace only the first
 * occurrence of "hate".
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_02_09
{
    private static final double SWEETENER_RATE = 0.001;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text.");
        String phrase = scanner.nextLine();

        phrase = phrase.replaceFirst("hate", "love");

        System.out.println("I have rephrased that line to read: ");
        System.out.println(phrase);
    }
}
