package chapter_five;


import Finance.Money;
import MyMath.Rational;

/**
 * 11. Do Programming Project 5 Part One and Programming Project 6 Part One. For
 * this Programming Project, put your Money class into a package named Finance,
 * and put your Rational class into a package named MyMath. Your main method
 * should be in a separate package of your choice. Your test code for both classes
 * should be in the main method.
 *
 * @author Sharaf Qeshta*/

public class Exercise_05_11
{
    public static void main(String[] args)
    {
        // money test
        Money money1 = new Money(100, 20);
        Money money2 = new Money(80, 90);

        System.out.println(money1); // Dollars: $100, Cents: 20
        System.out.println(money2); // Dollars: $80, Cents: 90

        System.out.println(money1.equals(money2)); // false
        System.out.println(Money.add(money1, money2)); // Dollars: $181, Cents: 10
        System.out.println(Money.subtract(money1, money2)); // Dollars: $20, Cents: 0
        System.out.println(money1.add(money2)); // 181.1
        System.out.println(money1.subtract(money2)); // 19.3


        // Rational test
        Rational r1 = new Rational(5, 6);
        Rational r2 = new Rational(7, 5);

        System.out.println(r1.equals(r2)); // false
        System.out.println(Rational.add(r1, r2)); // 67/30
        System.out.println(Rational.subtract(r1, r2)); // -17/30
        System.out.println(Rational.multiply(r1, r2)); // 35/30
        System.out.println(Rational.divide(r1, r2)); // 25/42

        System.out.println();

        System.out.println(r1.add(r2)); // 67/30
        System.out.println(r1.subtract(r2)); // -17/30
        System.out.println(r1.multiply(r2)); // 35/30
        System.out.println(r1.divide(r2)); // 25/42
    }
}
