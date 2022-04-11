package chapter_ten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 2. Write a program that will count the total occurrences of the number ‘10’ in a text
 * file of strings representing numbers of type int and will show the value of the
 * count on the screen once the whole file is read. The file contains the following
 * numbers separated by space.
 * 10 4 7 8 10 34 11 10 15 6 10
 *
 * @author Sharaf Qeshta */

public class Exercise_10_02
{
    public static void main(String[] args)
    {
        int tenCount = 0;
        try (Scanner reader = new Scanner(new File("src/chapter_ten/numbers.txt")))
        {
            while (reader.hasNext())
            {
                if (reader.next().equals("10"))
                    tenCount++;
            }
        }
        catch (IOException ignored) {}

        /* Ten 10 Occurred 4 times in numbers.txt */
        System.out.println("Ten 10 Occurred " + tenCount + " times in numbers.txt");
    }
}
