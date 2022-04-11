package chapter_ten;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.Scanner;

/**
 * 10. Write a program that reads grades of type double of eight students that the user
 * provides. The grades lie between 0 and 10. These grades should be written to a
 * binary file and read from it. The program outputs the highest and lowest grades
 * achieved by students on the screen. The file contains nothing but numbers of type
 * double written to the file with writeDouble.
 *
 * @author Sharaf Qeshta */


public class Exercise_10_10
{
    private static final String filePath = "src/chapter_ten/grades.dat";
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double[] grades = new double[10];
        System.out.println("Enter 10 Grades Line By Line ");
        for (int i = 0; i < grades.length; i++)
        {
            double value = scanner.nextDouble();
            grades[i] = value;
        }

        fill(grades);

        /*
        * The Highest Grade is : 10.0
        * The Lowest Grade is : 1.8
        * */
        printMaxAndMin();
    }

    public static void fill(double[] grades)
    {
        try (RandomAccessFile file = new RandomAccessFile(new File(filePath), "rw"))
        {
            for (int i = 0; i < grades.length; i++)
                file.writeDouble(grades[i]);
        }
        catch (IOException ignored) {}
    }

    public static void printMaxAndMin()
    {
        double max = 0, min = 0;
        try (RandomAccessFile file = new RandomAccessFile(new File(filePath), "r"))
        {
            max = file.readDouble(); min = max;
            while (true)
            {
                double number = file.readDouble();
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            }
        }
        catch (IOException ignored) {}

        System.out.println("The Highest Grade is : " + max);
        System.out.println("The Lowest Grade is : " + min);
    }


}
