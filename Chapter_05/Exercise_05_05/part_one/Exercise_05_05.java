package chapter_five;

/**
 * 5. Part One: Define a class named Money whose objects represent amounts of U.S.
 * money. The class should have two instance variables of type int for the dollars and
 * cents in the amount of money. Include a constructor with two parameters of type
 * int for the dollars and cents, one with one constructor of type int for an amount of
 * dollars with zero cents and a no-argument constructor. Include the methods add and
 * minus for addition and subtraction of amounts of money. These methods should be
 * static methods, should each have two parameters of type Money, and return a value
 * of type Money. Include a reasonable set of accessor and mutator methods as well as
 * the methods equals and toString. Write a test program for your class.
 *  Part Two: Add a second version of the methods for addition and subtraction.
 * These methods should have the same names as the static version but should use a
 * calling object and a single argument. For example, this version of the add method
 * (for addition) has a calling object and one argument. So m1.add(m2) returns the
 * result of adding the Money objects m1 and m2. Note that your class should have all
 * these methods; for example, there should be two methods named add.
 *  Alternate Part Two: Add a second version of the methods for addition and subtraction.
 *  These methods should have the same names as the static version but should
 * use a calling object and a single argument. The methods should be void methods.
 * The result should be given as the changed value of the calling object. For example,
 * this version of the add method (for addition) has a calling object and one argument.
 * Therefore,
 *  m1.add(m2);
 *  changes the values of the instance variables of m1 so they represent the result of
 * adding m2 to the original version of m1. Note that your class should have all these
 * methods; for example, there should be two methods named add.
 *  (If you want to do both Part Two and Alternate Part Two, they must be two
 * classes. You cannot include the methods from both Part Two and Alternate Part
 * Two in a single class. Do you know why?)
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_05_05
{
    public static void main(String[] args)
    {
        Money money1 = new Money(100, 20);
        Money money2 = new Money(80, 90);

        System.out.println(money1); // Dollars: $100, Cents: 20
        System.out.println(money2); // Dollars: $80, Cents: 90

        System.out.println(money1.equals(money2)); // false
        System.out.println(Money.add(money1, money2)); // Dollars: $181, Cents: 10
        System.out.println(Money.subtract(money1, money2)); // Dollars: $20, Cents: 0
    }
}
