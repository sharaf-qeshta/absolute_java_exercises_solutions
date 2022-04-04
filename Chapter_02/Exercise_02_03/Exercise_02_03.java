package chapter_two;

import java.util.Scanner;

/**
 * 3. Write a program that reads in two numbers typed on the keyboard and divides
 * the first number by the second number. The program should output the dividend,
 * divisor, quotient, and remainder on the screen.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_02_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter two numbers: ");
        int x = scanner.nextInt(), y = scanner.nextInt();

        System.out.println("dividend: " + x);
        System.out.println("divisor: " + y);
        System.out.println("quotient: " + (x / y));
        System.out.println("remainder: " + (x % y));

    }
}
