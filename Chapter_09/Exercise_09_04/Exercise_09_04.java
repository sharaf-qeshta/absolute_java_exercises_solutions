package chapter_nine;


/**
 * 4. (This is a version of an exercise from Chapter 5) Programming Project 5.2 from
 * Chapter 5 asked you to create a class named Fraction. This class is used to
 * represent a ratio of two integers. It should include mutator functions that allow
 * the user to set the numerator and the denominator along with a method that
 * displays the fraction on the screen as a ratio (e.g., 5/9). Modify the class so that
 * it throws the exception DenominatorIsZeroException if the denominator is set
 * to zero. Do not forget to account for the constructors! You will have to create the
 * DenominatorIsZeroException class and it should be derived from Exception.
 *  Write a main method that tests the new Fraction class, attempts to set the
 * denominator to zero, and catches the DenominatorIsZeroException exception.
 *
 * @author Sharaf Qeshta */

public class Exercise_09_04
{
    public static void main(String[] args)
    {
        Fraction fraction = new Fraction();
        fraction.setNumerator(10); // fine

        /*
        * chapter_nine.DenominatorIsZeroException: You Cannot Divide By Zero
	    * at chapter_nine.Fraction.setDenominator(Fraction.java:67)
	    * at chapter_nine.Exercise_09_03.main(Exercise_09_04.java:26)*/
        try {
            fraction.setDenominator(0);
        }catch (DenominatorIsZeroException ex){
            ex.printStackTrace();
        }
    }
}
