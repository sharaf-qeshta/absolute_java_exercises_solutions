package chapter_three;


/**
 * 7. An Armstrong number is an n-digit number that equals the sum of the nth power
 * of its digits. For example 153 is a three-digit number where the sum of the cubes
 * of the individual digits (13 + 53 + 33) equals the number itself (153).
 *  Write a program that takes as input the start and end numbers of an Armstrong
 * number range to be printed. Your program should prompt for new start and end
 * numbers until the user decides that she or he is through. Use variables of the type
 * integer to store the start and end numbers of the range.
 *
 * @author Sharaf Qeshta
 * */


import java.util.Scanner;

public class Exercise_03_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the start and end range respectively: ");
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            for (int i = start; i < end+1; i++) // (end+1) to include end
            {
                String stringI = i + "";
                int n = stringI.length();

                int digitSum = 0;
                for (int j = 0; j < n; j++){
                    int digit = Integer.parseInt(stringI.charAt(j) + "");
                    digitSum += Math.pow(digit, n);
                }

                if (digitSum == i)
                    System.out.println(i + " is an armstrong number");
            }

            System.out.print("\nDo You Want to Exit: ");
            String answer = scanner.next();

            if (answer.charAt(0) == 'y')
                System.exit(0);
        }
    }
}
