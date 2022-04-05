package chapter_three;


/**
 * 3. Weight is defined as the gravitational force acting on the mass of a body. The
 * weight of a body with a mass of 1kg on Earth can be calculated with the formula
 * given below. The weight is expressed in Newtons (N).
 * Weight on earth = (1 kg) * (9.81 m/s2) = 9.81 N
 *  The weight of the same body in N can be calculated with another formula:
 * Weight on moon = ((1 kg) * (9.81 m/s2)) / 6 = 1.64 N
 *  Write a program that takes as input the mass of a car in kilograms and then prompts
 * the user to choose to calculate the car’s weight in Newtons either on Earth or on
 * the Moon. The program should allow the user to enter new values and output the
 * car’s weight on Earth or on the Moon till the user decides to exit. Use the double
 * data type to store the mass.
 *
 * @author Sharaf Qeshta
 * */


import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_03
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true)
        {
            System.out.print("Enter the Weight in Kilogram: ");
            double weight = scanner.nextDouble();

            System.out.print("on Moon or Earth M/E: ");
            char choice = scanner.next().charAt(0);

            System.out.println((choice == 'E')? weight * 9.81 + "Newton" : weight * 9.81 / 6  + " Newton");

            System.out.print("Type Q/C to Exit or Continue: ");
            char exit = scanner.next().charAt(0);
            if (exit == 'Q') break;

        }
    }
}
