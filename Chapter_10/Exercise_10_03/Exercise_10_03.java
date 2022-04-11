package chapter_ten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 3. Write a program that takes its input from a text file of strings representing numbers
 * of type double and outputs the average of the numbers in the file to the screen. The
 * file contains nothing but strings representing numbers of type double, one per line
 *
 * @author Sharaf Qeshta */


public class Exercise_10_03
{
    public static void main(String[] args)
    {
        double total = 0;
        int count = 0;
        try (Scanner reader = new Scanner(new File("src/chapter_ten/numbers.txt")))
        {
            while (reader.hasNext())
            {
                total += reader.nextDouble();
                count++;
            }
        }
        catch (IOException ignored) {}

        /* The Average is 81.43629166666666 */
        System.out.println("The Average is " + (total/count));
    }
}
