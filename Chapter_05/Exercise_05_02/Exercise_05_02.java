package chapter_five;

/**
 * 2. Define a class called Fraction. This class is used to represent a ratio of two integers.
 * Include mutator methods that allow the user to set the numerator and the
 * denominator. Also include a method that displays the fraction on the screen as a
 * ratio (e.g., 5>9). This method does not need to reduce the fraction to lowest terms.
 *  Include an additional method, equals, that takes as input another Fraction and
 * returns true if the two fractions are identical and false if they are not. This
 * method should treat the fractions reduced to lowest terms; that is, if one fraction
 * is 20>60 and the other is 1>3, then the method should return true.
 *  Embed your class in a test program that allows the user to create a fraction. Then
 * the program should loop repeatedly until the user decides to quit. Inside the body
 * of the loop, the program should allow the user to enter a target fraction into an
 * anonymous object and learn whether the fractions are identical.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_05_02
{
    public static void main(String[] args)
    {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(20, 60);

        System.out.println(fraction1.equals(fraction2)); // true
        fraction1.displayFraction(); // 1/3
        fraction2.displayFraction(); // 20/60
    }
}
