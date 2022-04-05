package chapter_three;

import java.util.Scanner;

/**
 * 2. A designer is trying to create a new pattern of five stripes using three colors. These
 * colors and their codes are mentioned in the table below.
 * Color Character Code
 * Red R
 * Green G
 * Blue B
 *  The designer has to keep in mind that no two adjacent stripes are of the same color.
 * For example, RRGBR is an invalid pattern, but RGBRB is valid.
 *  Write a program that accepts a sequence of five colors as input from the designer to
 * form the pattern. At each selection the designer makes, the program should check if
 * the input is from among the available set of colors. Also, the program should check
 * that adjacent colors are not the same. At the end, the program should display the
 * final stripe pattern created.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_03_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String pattern = "";

        String previousChar, currentChar = "";

        for (int i = 0; i < 5; i++)
        {
            System.out.print("enter a color: ");
            previousChar = currentChar;
            currentChar = scanner.next();

            if (!(currentChar.equals("R")
                    || currentChar.equals("G")
                    || currentChar.equals("B")))
            {
                System.out.println("Invalid Input :[");
                i--;
                continue;
            }

            if (previousChar.equals(currentChar))
            {
                System.out.println("Invalid Input :[");
                i--;
            }else {
                pattern += currentChar;
            }
        }

        System.out.println("Your Pattern is " + pattern);

    }
}
