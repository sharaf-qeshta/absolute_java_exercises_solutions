package chapter_eleven;



/**
 * 6. The formula for calculating the exponentiation of a number x with exponent m is:
 * ExpResult = xm
 * Write a recursive method named expEvaluate with the following header:
 * public long expEvaluate(int x, int m)
 * The method should accept the value of x and m with the following conditions:
 * a. Value of x should be in the range 0 < x <=10
 * b. Value of m should be in the range 0 <= m <=10
 * The method should return the exponent. Also, write the main method to
 * implement the program.
 *
 * @author Sharaf Qeshta */

public class Exercise_11_06
{
    public static void main(String[] args)
    {
        System.out.println(expEvaluate(2, 3)); // 8
        System.out.println(expEvaluate(2, 4)); // 16
        System.out.println(expEvaluate(2, 5)); // 32
        System.out.println(expEvaluate(2, 6)); // 64
        System.out.println(expEvaluate(2, 7)); // 128
        System.out.println(expEvaluate(5, 2)); // 25
        System.out.println(expEvaluate(6, 2)); // 36
        System.out.println(expEvaluate(3, 3)); // 27
        System.out.println(expEvaluate(7, 2)); // 49
        System.out.println(expEvaluate(2, 8)); // 256
        System.out.println(expEvaluate(2, 9)); // 512
        System.out.println(expEvaluate(2, 11)); // -9223372036854775808 (invalid)
    }

    public static long expEvaluate(int x, int m)
    {
        if (x < 0 || x > 10 || m < 0 || m > 10)
            return Long.MIN_VALUE;
        if (m == 1)
            return x;
        if (m <= 0)
            return 1;
        return expEvaluate(x, m-1) * x;
    }



}
