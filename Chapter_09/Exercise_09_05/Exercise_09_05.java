package chapter_nine;


import java.util.Scanner;

/**
 * 5. Write a program that converts dates from numerical month/day/year format to
 * normal “month day, year” format (for example, 12/25/2000 corresponds to December
 * 25, 2000). You will define three exception classes, one called MonthException,
 * another called DayException, and a third called YearException. If the user enters
 * anything other than a legal month number (integers from 1 to 12), your program
 * will throw and catch a MonthException and ask the user to reenter the month.
 * Similarly, if the user enters anything other than a valid day number (integers from 1 to
 * either 28, 29, 30, or 31, depending on the month and year), then your program will
 * throw and catch a DayException and ask the user to reenter the day. If the user enters
 * a year that is not in the range 1000 to 3000 (inclusive), then your program will throw
 * and catch a YearException and ask the user to reenter the year. (There is nothing
 * very special about the numbers 1000 and 3000 other than giving a good range of likely
 * dates.) See Self-Test Exercise 19 in Chapter 4 for details on leap years.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_09_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        DateConverter converter = new DateConverter();

        // read the year
        boolean pass = false;
        while (!pass)
        {
            pass = true;
            try
            {
                System.out.print("\nEnter Year: ");
                int year = scanner.nextInt();
                converter.setYear(year);
            }
            catch (YearException yx){
                yx.printStackTrace();
                pass = false;
            }
        }

        // read the month
        pass = false;
        while (!pass)
        {
            pass = true;
            try
            {
                System.out.print("\nEnter Month: ");
                int month = scanner.nextInt();
                converter.setMonth(month);
            }
            catch (MonthException mx){
                mx.printStackTrace();
                pass = false;
            }
        }

        // read the day
        pass = false;
        while (!pass)
        {
            pass = true;
            try
            {
                System.out.print("\nEnter Day: ");
                int day = scanner.nextInt();
                converter.setDay(day);
            }
            catch (DayException dx)
            {
                dx.printStackTrace();
                pass = false;
            }
        }

        // print the result
        System.out.println(converter); // December, 25, 2000
    }
}
