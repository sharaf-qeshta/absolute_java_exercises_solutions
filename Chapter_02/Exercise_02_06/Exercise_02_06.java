package chapter_two;

import java.util.Scanner;

/**
 * 6. (This is a better version of an exercise from Chapter 1.) A government research lab
 * has concluded that an artificial sweetener commonly used in diet soda pop causes
 * death in laboratory mice. A friend of yours is desperate to lose weight but cannot
 * give up soda pop. Your friend wants to know how much diet soda pop it is possible
 * to drink without dying as a result. Write a program to supply the answer. The
 * input to the program is the amount of artificial sweetener needed to kill a mouse,
 * the weight of the mouse, and the desired weight of the dieter. Assume that diet
 * soda contains 1/10th of 1% artificial sweetener. Use a named constant for this
 * fraction. You may want to express the percent as the double value 0.001.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_02_06
{
    private static final double SWEETENER_RATE = 0.001;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the amount of artificial sweetener needed to kill a mouse: ");
        double sodaKilledTheMouse = scanner.nextDouble();

        System.out.print("enter the weight of the mouse: ");
        double mouseWeight = scanner.nextDouble();

        System.out.print("enter the desired weight: ");
        double desiredWeight = scanner.nextDouble();

        double ratio = sodaKilledTheMouse/mouseWeight;
        double sodaPopToDie = (ratio * desiredWeight) * 10;

        System.out.println("you should drink less than " + sodaPopToDie);

    }
}
