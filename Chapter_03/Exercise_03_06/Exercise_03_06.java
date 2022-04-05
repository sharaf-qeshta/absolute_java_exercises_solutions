package chapter_three;


/**
 * 6. The Fibonacci numbers Fn are defined as follows: F0 is 1, F1 is 1, and
 *  Fi+2 = Fi + Fi+1
 *  i = 0, 1, 2, . . . . In other words, each number is the sum of the previous two numbers.
 *  The first few Fibonacci numbers are 1, 1, 2, 3, 5, and 8. One place where these
 * numbers occur is as certain population growth rates. If a population has no deaths,
 * then the series shows the size of the population after each time period. It takes an
 * organism two time periods to mature to reproducing age, and then the organism
 * reproduces once every time period. The formula applies most straightforwardly to
 * asexual reproduction at a rate of one offspring per time period. In any event, the
 * green crud population grows at this rate and has a time period of five days. Hence, if
 * a green crud population starts out as 10 pounds of crud, then in 5 days, there is still
 * 10 pounds of crud; in 10 days, there is 20 pounds of crud; in 15 days, 30 pounds;
 * in 20 days, 50 pounds; and so forth. Write a program that takes both the initial size
 * of a green crud population (in pounds) and a number of days as input and outputs
 * the number of pounds of green crud after that many days. Assume that the population
 * size is the same for four days and then increases every fifth day. Your program
 * should allow the user to repeat this calculation as often as desired.
 *
 * @author Sharaf Qeshta
 * */


import java.io.*;
import java.util.Scanner;

public class Exercise_03_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("enter the population of green crud in pounds: ");
            double pounds = scanner.nextDouble();

            System.out.print("after how many days: ");
            int days = scanner.nextInt();

            if (days < 0 || pounds < 0)
                System.exit(0);

            double fib1 = 0, fib2 = pounds; // after 10 days
            double population = 0;

            for (int i = 1; i < days+1; i++){
                if (i % 5 == 0){
                    population = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = population;
                }
            }

            System.out.println(population + " pounds");
        }
    }
}
