package chapter_two;

import java.util.Scanner;

/**
 * 7. Write a program that determines the change to be dispensed from a vending
 * machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
 * increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
 * dollar bill to pay for the item. For example, a possible sample dialogue might be
 * the following:
 *  Enter price of item
 *  (from 25 cents to a dollar, in 5-cent increments):
 *  45
 *  You bought an item for 45 cents and gave me a dollar,
 *  so your change is
 *  2 quarters,
 *  0 dimes, and
 *  1 nickels.
 *
 *  @author Sharaf Qeshta
 *  */


public class Exercise_02_07
{
    private static final double SWEETENER_RATE = 0.001;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price of item\n" +
                " (from 25 cents to a dollar, in 5-cent increments): ");
        int cents = scanner.nextInt();

        System.out.println("You bought an item for " +  cents  +" cents and gave me a dollar,\n" +
                " so your change is");

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("cents: " + cents);


    }
}
