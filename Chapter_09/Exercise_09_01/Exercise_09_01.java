package chapter_nine;

import java.util.Scanner;

/**
 * 1. Write a program that calculates the average of N integers. The program should
 * prompt the user to enter the value for N and then afterward must enter all N
 * numbers. If the user enters a nonpositive value for N, then an exception should be
 * thrown (and caught) with the message “N must be positive.” If there is any
 * exception as the user is entering the N numbers, an error message should be displayed,
 * and the user prompted to enter the number again.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_09_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean valid = false;
        int n = 0;
        while (!valid)
        {
            System.out.print("\nEnter N: ");
            n = scanner.nextInt();

            if (n < 0)
            {
                try {
                    throw new Exception("N must be positive.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else
                valid = true;
        }

        int total = 0;
        for (int i = 0; i < n; i++)
        {
            scanner.nextLine();
            try {
                System.out.print("Enter Number " + (i+1) + ": ");
                int integer = scanner.nextInt();
                total += integer;
            }catch (Exception e){
                System.out.println("Invalid Input");
                i--;
            }
        }

        System.out.println("The Average is " + (total / n));
    }
}
