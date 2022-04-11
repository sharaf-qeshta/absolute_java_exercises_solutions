package chapter_ten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 4. Write a program that takes its input from a text file of strings representing numbers
 * of type double. The program outputs to the screen the average and standard
 * deviation of the numbers in the file. The file contains nothing but strings representing
 * numbers of type double, one per line. The standard deviation of a list of numbers
 * n1, n2, n3, and so forth is defined as the square root of the average of the following
 * numbers:
 * (n1 - a)
 * 2, (n2 - a)
 * 2, (n3 - a)
 * 2, and so forth.
 *  The number a is the average of the numbers n1, n2, n3, and so forth. Hint: Write
 * your program so that it first reads the entire file and computes the average of all the
 * numbers, then closes the file, and then reopens the file and computes the standard
 * deviation. You will find it helpful to first do Programming Project 10.3 and then
 * modify that program in order to obtain the program for this project.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_10_04
{
    private static double[] numbers = new double[1000];
    public static void main(String[] args)
    {
        double total = 0;
        int count = 0;
        try (Scanner reader = new Scanner(new File("src/chapter_ten/numbers.txt")))
        {
            while (reader.hasNext())
            {
                double number = reader.nextDouble();
                total += number;
                numbers[count++] = number;

                // change the array size
                if (count >= (numbers.length-1))
                {
                    double[] temp = new double[(int) (numbers.length*1.5)];
                    for (int i = 0; i < numbers.length; i++)
                        temp[i] = numbers[i];
                    numbers = temp;
                }
            }
        }
        catch (IOException ignored) {}

        double average = total/count;

        /*
         5804.351037918402, 1295.0131879184023, 448449.4822587518, 6540.974553751735,
         1287.1083037517355, 4800.03593858507, 6445.888629585068, 6281.559768751735,
         5542.250342918403, 35.239558751736055, 4574.667950418402, 4082.544402126736,
          */

        for (int i = 0; i < count; i++)
        {
            System.out.print((Math.pow(numbers[i] - average, 2)) + ", ");
        }
    }
}
