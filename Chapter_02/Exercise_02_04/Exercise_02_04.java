package chapter_two;

/**
 * 4. John travels a distance of 55 miles at an average speed of 15 miles per hour. Write
 * a program to calculate the total number of hours John takes to cover this distance.
 * The program should print the total time taken in hours and minutes. Use the following
 * formula for calculations.
 * Time = Distance
 * Speed
 *
 * @author Sharaf Qeshta*/

public class Exercise_02_04
{
    public static void main(String[] args)
    {
        double distance = 55, speed = 15, time = distance/speed;

        int hours = (int) (time / 1);
        int minutes = (int) (time % 1 * 60);

        System.out.println("John needs " + hours + ":" + minutes + " to reach his distance");
    }
}
