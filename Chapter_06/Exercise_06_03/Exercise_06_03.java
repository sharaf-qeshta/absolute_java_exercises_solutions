package chapter_six;

import java.util.Locale;
import java.util.Scanner;

/**
 * 3. Write a program to calculate the average salary of an employee in a company.
 * The program should read the monthly salary and overtime hours of an employee
 * for each of the previous 12 months. The program should then print out a nicely
 * formatted table showing the salary for each of the previous 12 months including
 * salary for overtime hours. It should also show how much above or below average
 * the total salary was for each month. The output should correctly label the months.
 * There are a variety of ways to deal with the month names. One straightforward
 * method is to code the months as integers and then do a conversion to a string for
 * the month name before doing the output. The month input can be handled in any
 * manner you wish so long as it is relatively easy and pleasant for the user.
 *  The salary for the overtime hours is calculated as per the following rates:
 *  a. If salary is above $10,000, then the rate per overtime hour is $25.
 *  b. If salary is greater than $5,000 and below $10,000, then the rate per overtime
 * hour is $20.
 *  c. If salary is greater than $2,000 and below $5,000, then the rate per overtime
 * hour is $15.
 *  If salary is below $2,000, then the rate per overtime hour is $10.
 *
 * @author Sharaf Qeshta
 *  */


public class Exercise_06_03
{
    private static double[] salaries = new double[12];
    private static int[] overtimeHours = new int[12];
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < 12; i++)
        {
            String month =  getMonth(i+1);

            System.out.print("Enter " + month + " Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Enter " + month + " Overtime Hours: ");
            int overtime = scanner.nextInt();

            salaries[i] = salary;
            overtimeHours[i] = overtime;
        }
        printSummaryTable();
    }


    public static void printSummaryTable()
    {
        double average = getAverage(salaries);
        double total = 0;

        for (int i = 0; i < 12; i++)
        {
            String month = getMonth(i+1);
            int hourlyRate = getHourRate(salaries[i]);
            double finalSalary = salaries[i] + (hourlyRate * overtimeHours[i]);

            System.out.println("\n" + month + " Salary is $" + salaries[i]
            + ", and Overtime Hours is " + overtimeHours[i]
                    + " for rate $" + hourlyRate + " Per Hour, So the final salary for "
                    + month + " is $" + finalSalary + " and it`s "
                    + ((finalSalary < average)? "Below": "Above") + " The Average\n");

            total += finalSalary;
        }

        System.out.println("\n\n\nThe Final Salary For This Year Is $" + total);
    }


    public static String getMonth(int index)
    {
        return switch (index) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Wrong Index";
        };
    }

    public static double getAverage(double[] array)
    {
        double total = 0;
        for (double v : array) total += v;
        return total / array.length;
    }


    public static int getHourRate(double salary)
    {
        if (salary > 10000)
            return 25;
        if (salary > 5000)
            return 20;
        if (salary > 2000)
            return 15;
        return 10;
    }
}
