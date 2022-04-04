package chapter_two;

import java.util.Scanner;

/**
 * 8. Write a program that reads in a string containing three words separated by commas
 * and then outputs that string with each word in a different line.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_02_08
{
    private static final double SWEETENER_RATE = 0.001;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        System.out.print("enter three words separated by comma: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        scanner.close();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);


    }
}
