package chapter_nine;

import java.util.Locale;
import java.util.Scanner;

/**
 * 6. Write a program that can serve as a simple calculator. This calculator keeps track of
 * a single number (of type double) that is called result and that starts out as 0.0.
 * Each cycle allows the user to repeatedly add, subtract, multiply, or divide by a second
 * number. The result of one of these operations becomes the new value of result.
 * The calculation ends when the user enters the letter R for “result” (either in upper- or
 * lowercase). The user is allowed to do another calculation from the beginning as often
 * as desired.
 *  The input format is shown in the following sample dialogue. If the user enters any
 * operator symbol other than +, −, *, or /, then an UnknownOperatorException
 * is thrown and the user is asked to reenter that line of input. Defining the class
 * UnknownOperatorException is part of this project.
 * Calculator is on.
 *  result = 0.0
 *  +5
 *  result + 5.0 = 5.0
 *  new result = 5.0
 * * 2.2
 *  result * 2.2 = 11.0
 *  updated result = 11.0
 *  % 10
 *  % is an unknown operation.
 *  Reenter, your last line:
 *  * 0.1
 *  result * 0.1 = 1.1
 *  updated result = 1.1
 *  r
 *  Final result = 1.1
 *  Again? (y/n)
 * yes
 *  result = 0.0
 *  +10
 *  result + 10.0 = 10.0
 *  new result = 10.0
 *  /2
 *  result / 2.0 = 5.0
 *  updated result = 5.0
 *  r
 *  Final result = 5.0
 *  Again? (y/n)
 *  N
 *  End of Program
 *
 *  @author Sharaf Qeshta */


public class Exercise_09_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double result = 0;
        boolean firstTime = true;

        System.out.println("Calculator is on.");
        System.out.println("result = " + result);
        while (true)
        {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("r"))
            {
                System.out.println("Final result = " + result);
                System.out.println("Again? (y/n)");
                String answer = scanner.nextLine();
                if (answer.startsWith("y"))
                {
                    result = 0;
                    System.out.println("result = " + result);
                    firstTime = true;
                    continue;
                }
                else
                    break;
            }

            try
            {
                result = evaluate(input, result);
                System.out.println("result " + input + " = " + result);
                System.out.println(((firstTime)? "new " : "updated ") + "result = " + result);
                firstTime = false;
            }
            catch (UnknownOperatorException ex)
            {
                System.out.println(ex.getMessage());
                System.out.println("Reenter, your last line: ");
            }
        }

        System.out.println("End of Program");
    }


    public static double evaluate(String input, double result) throws UnknownOperatorException
    {
        char operator = input.charAt(0);
        double number = Double.parseDouble(input.substring(1));

        switch (operator)
        {
            case '+' : result += number; return result;
            case '-' : result -= number; return result;
            case '*' : result *= number; return result;
            case '/' : result /= number; return result;
            default: throw new UnknownOperatorException(operator + "");
        }
    }
}
