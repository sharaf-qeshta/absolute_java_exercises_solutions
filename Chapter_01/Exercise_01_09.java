package chapter_one;

/**
 * 9. A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5
 * feet of height and 5 pounds for each additional inch. Write a program with a variable
 * for the height of a person in feet and another variable for the additional inches. Assume
 * the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall
 * would be represented with a variable that stores the number 6 and another variable that
 * stores the number 3. Based on these values, calculate and output the ideal body weight
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_01_09
{
    public static double IDEAL_WEIGHT;
    public static final double RATIO_FOR_FIRST_5_FEET = 110 / 5.0;
    public static final double RATIO_FOR_EVERY_INCH_AFTER_5_FEET = 5.0;
    public static void main(String[] args)
    {
        int feet = 6;
        int inches = 3;

        // calculation
        IDEAL_WEIGHT += (feet / 5) * RATIO_FOR_FIRST_5_FEET;
        IDEAL_WEIGHT += (((feet % 5.0) * 12) + inches) * RATIO_FOR_EVERY_INCH_AFTER_5_FEET;
        System.out.println(IDEAL_WEIGHT);

    }
}

