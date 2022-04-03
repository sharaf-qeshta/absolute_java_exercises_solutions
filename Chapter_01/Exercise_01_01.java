package chapter_one;


/**
 * Body Mass Index (BMI) helps in specifying the weight category a person
 * belongs to, depending on their body weight. BMI is estimated using the following formula:
 *  BMI = Weight in kilograms
 * (Height in meters)2
 *  Write a program that calculates and outputs the BMI. Assume various input values
 * wherever required.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_01_01
{
    public static void main(String[] args)
    {
        int weight = 70; double height = 1.82;

        System.out.println("BMI: " + (weight / (height * height)));
    }
}