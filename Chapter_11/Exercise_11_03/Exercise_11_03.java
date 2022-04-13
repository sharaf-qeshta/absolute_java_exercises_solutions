package chapter_eleven;


/**
 * 3. Consider a frame of bowling pins shown below, where each * represents a pin:
 *  *
 *  * *
 *  * * *
 * * * * *
 * * * * * *
 * There are 5 rows and a total of 15 pins.
 * If we had only the top 4 rows, then there would be a total of 10 pins.
 * If we had only the top three rows, then there would be a total of six pins.
 * If we had only the top two rows, then there would be a total of three pins.
 * If we had only the top row, then there would be a total of one pin.
 *
 * Write a recursive function that takes as input the number of rows n and outputs
 * the total number of pins that would exist in a pyramid with n rows. Your program
 * should allow for values of n that are larger than 5.
 *
 * @author Sharaf Qeshta */

public class Exercise_11_03
{
    public static void main(String[] args)
    {
        System.out.println(pinsCount(1)); // 1
        System.out.println(pinsCount(2)); // 3
        System.out.println(pinsCount(3)); // 6
        System.out.println(pinsCount(4)); // 10
        System.out.println(pinsCount(5)); // 15
        System.out.println(pinsCount(6)); // 21
    }


    public static int pinsCount(int rows)
    {
        if (rows < 1)
            return 0;
        if (rows == 1)
            return 1;
        return pinsCount(rows-1) + rows;
    }

}
