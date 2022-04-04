package chapter_two;

import java.util.Scanner;

/**
 * 5. Grade point average (GPA) in a 4-point scale is calculated by using the following formula:
 * GPA = Q
 * Percentage
 * 100 R 3 4
 *  Write a program that takes as input the percentage from a user. The program
 * should then output the user’s GPA on the screen. The format of the output should
 * be as follows, assuming the user’s percentage is 85:
 * (85/100) * 4 = 3
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_02_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter percentage: ");
        int percentage = scanner.nextInt();

        double gpa = (percentage / 100.0) * 4;

        System.out.println("GPA is: " + Math.round(gpa));
    }
}
