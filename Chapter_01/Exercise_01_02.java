package chapter_one;


/**
 * The video game machines at your local arcade output coupons according to
 * how well you play the game. You can redeem 10 coupons for a candy bar or 3
 * coupons for a gumball. You prefer candy bars to gumballs. Write a program that
 * defines a variable initially assigned to the number of coupons you win. Next,
 * the program should output how many candy bars and gumballs you can get if
 * you spend all of your coupons on candy bars first, and any remaining coupons
 * on gumballs
 *
 * @author Sharaf Qeshta*/

public class Exercise_01_02
{
    public static void main(String[] args)
    {
        int coupons = 25;

        int candyBars = coupons / 10;
        int gumballs = (coupons % 10) / 3;

        System.out.println("if you spend " + coupons + " coupons you will get.");
        System.out.println("candy bars: "+ candyBars);
        System.out.println("gumballs: " + gumballs);

    }
}