package chapter_eleven;

import java.util.Locale;
import java.util.Scanner;

/**
 * 1. A savings account typically accrues savings using compound interest. If you deposit
 * $1,000 with a 10% interest rate per year, then after one year you have a total of
 * $1,100. If you leave this money in the account for another year at 10% interest,
 * then after two years the total will be $1,210. After three years, you would have
 * $1,331, and so on.
 * Write a program that inputs the amount of money to deposit, an interest rate per
 * year, and the number of years the money will accrue compound interest. Write a
 * recursive function that calculates the amount of money that will be in the savings
 * account using the input information.
 * To verify your function, the amount should be equal to P(1 + i)n, where P is the
 * amount initially saved, i is the interest rate per year, and n is the number of years.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_11_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter The Initial Amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter Years: ");
        int years = scanner.nextInt();

        System.out.print("Enter Interest Rate: ");
        double rate = scanner.nextDouble();

        System.out.println("After " + years + " Years You Will Have $"
                + calculateInterest(amount, years, rate));
    }

    public static double calculateInterest(double amount, int years, double rate)
    {
        if (years == 0)
            return amount;
        else
        {
            amount += amount * rate;
            return calculateInterest(amount, years-1, rate);
        }
    }
}
