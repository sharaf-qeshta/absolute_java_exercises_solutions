package chapter_two;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * 11. Write a program that calculates the total grade for three classroom exercises as a
 * percentage. Use the DecimalFormat class to output the value as a percent. The
 * scores should be summarized in a table. Input the assignment information in this
 * order: name of assignment (may include spaces), points earned (integer), and total
 * points possible (integer). The percentage is the sum of the total points earned divided
 * by the total points possible. Sample input and output are shown as follows:
 *  Name of exercise 1:
 *  Group Project
 *  Score received for exercise 1:
 *  10
 *  Total points possible for exercise 1:
 *  10
 *  Name of exercise 2:
 *  Homework
 *  Score received for exercise 2:
 *  7
 *  Total points possible for exercise 2:
 *  12
 *  Name of exercise 3:
 *  Presentation
 *  Score received for exercise 3:
 *  5
 *  Total points possible for exercise 3:
 *  8
 * Exercise Score Total Possible
 * Group Project 10 10
 * Homework 7 12
 * Presentation 5 8
 * Total 22 30
 *  Your total is 22 out of 30, or 73.33%.
 *
 *  @author Sharaf Qeshta
 *  */


public class Exercise_02_11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Name of exercise 1: ");
        String exercise1Name = scanner.nextLine();

        System.out.println("Score received for exercise 1: ");
        int exercise1Score = scanner.nextInt();

        System.out.println("Total points possible for exercise 1: ");
        int exercise1PossiblePoints = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Name of exercise 2: ");
        String exercise2Name = scanner.nextLine();

        System.out.println("Score received for exercise 2: ");
        int exercise2Score = scanner.nextInt();

        System.out.println("Total points possible for exercise 2: ");
        int exercise2PossiblePoints = scanner.nextInt();

        scanner.nextLine();



        System.out.println("Name of exercise 3: ");
        String exercise3Name = scanner.nextLine();

        System.out.println("Score received for exercise 3: ");
        int exercise3Score = scanner.nextInt();

        System.out.println("Total points possible for exercise 3: ");
        int exercise3PossiblePoints = scanner.nextInt();

        System.out.println();

        System.out.print("Exercise            ");
        System.out.print("Score               ");
        System.out.print("Total Possible      \n");

        System.out.print(exercise1Name + "    ");
        System.out.print(exercise1Score + "   ");
        System.out.print(exercise1PossiblePoints + "     \n");

        System.out.print(exercise2Name + "    ");
        System.out.print(exercise2Score + "   ");
        System.out.print(exercise2PossiblePoints + "     \n");

        System.out.print(exercise3Name + "    ");
        System.out.print(exercise3Score + "   ");
        System.out.print(exercise3PossiblePoints + "     \n");


        double totalGained = exercise1Score + exercise2Score + exercise3Score + 0.0;
        double totalPossible = exercise3PossiblePoints +
                exercise2PossiblePoints + exercise1PossiblePoints + 0.0;

        System.out.print("total               ");
        System.out.print(totalGained + "        ");
        System.out.print(totalPossible + "         \n");

        DecimalFormat df = new DecimalFormat(".00");

        System.out.println("Your total is " + totalGained + " out of "
                + totalPossible + ", or "
                + df.format((totalGained/totalPossible) * 100) + "%");




    }
}
