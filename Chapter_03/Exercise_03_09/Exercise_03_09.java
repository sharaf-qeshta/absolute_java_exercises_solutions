package chapter_three;


/**
 * 9. Write a program that calculates the total grade for N classroom exercises as a percentage.
 * Use the DecimalFormat class to output the value as a percent. The user
 * should input the value for N followed by each of the N scores and totals. Calculate
 * the overall percentage (sum of the total points earned divided by the total points
 * possible) and output it using the DecimalFormat class. Sample input and output
 * are shown below.
 *  How many exercises to input?
 *  3
 *  Score received for exercise 1:
 *  10
 *  Total points possible for exercise 1:
 *  10
 *  Score received for exercise 2:
 *  7
 *  Total points possible for exercise 2:
 *  12
 *  Score received for exercise 3:
 *  5
 *  Total points possible for exercise 3:
 *  8
 *  Your total is 22 out of 30, or 73.33%.
 *
 *
 *  @author Sharaf Qeshta
 *  */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_03_09
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many exercises to input? ");
        int exercises = scanner.nextInt();

        int scores = 0, totalScores = 0;

        for (int i = 1; i < exercises+1; i++)
        {
            System.out.print("Score received for exercise " + i + ": ");
            int score = scanner.nextInt();

            System.out.print("Total points possible for exercise " + i + ": ");
            int total = scanner.nextInt();

            scores += score; totalScores += total;
        }

        DecimalFormat df = new DecimalFormat("00.00");
        String percent = df.format((scores * 1.0)/totalScores * 100.0);

        System.out.println("Your total is " + scores + " out of " + totalScores
                   + ", or " + percent + "%");

    }
}
