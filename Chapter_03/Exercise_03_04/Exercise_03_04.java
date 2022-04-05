package chapter_three;


/**
 * 4. It is difficult to make a budget that spans several years, because prices are not stable.
 * If your company needs 200 pencils per year, you cannot simply use this year’s price
 * as the cost of pencils two years from now. Because of inflation, the cost is likely to
 * be higher than it is today. Write a program to gauge the expected cost of an item in
 * a specified number of years. The program asks for the cost of the item, the number
 * of years from now that the item will be purchased, and the rate of inflation. The
 * program then outputs the estimated cost of the item after the specified period.
 * Have the user enter the inflation rate as a percentage, such as 5.6 (percent). Your
 * program should then convert the percent to a fraction, such as 0.056 and should
 * use a loop to estimate the price adjusted for inflation
 *
 * @author Sharaf Qeshta
 * */


import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_04
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the Price of Item: ");
        double price = scanner.nextDouble();

        System.out.print("After N Years n = ");
        int years = scanner.nextInt();

        System.out.print("Enter the Inflation Rate: ");
        double rate = scanner.nextDouble()/100;

        for (int i = 0; i < years; i++)
            price += price * rate;

        System.out.println("The Price After" + years + " Years Will Become " + price);
    }
}
