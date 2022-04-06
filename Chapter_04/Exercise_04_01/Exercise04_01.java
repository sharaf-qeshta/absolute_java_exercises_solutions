package chapter_four;

/**
 * 1. Write a program that outputs a certain coded language. The program should print
 * 26 code words, each comprising one letter and one digit, for example, A0, B1, C2,
 * D3, and so on.
 *  Your program should not use 26 output statements!
 *  Design your program with a class named PrintCodeword whose constructor takes an
 * initial value for the starting value of the letter, for example D, and also an integer
 * parameter that is the starting value of the number, for example 5. In this case, the series of
 * codewords will be D5, E6, F7, and so on. There will always be a total of 26 codewords.
 * If the value of letter reaches Z, it will then automatically move to A. Similarly, if the
 * value of digit reaches 9, then it should also move automatically to 0 as shown below.
 *  D5
 *  E6
 *  F7
 *  G8
 *  .
 *  .
 *  .
 *  .
 *  X5
 *  Y6
 *  Z7
 *  A8
 *  B9
 *  C0
 *  Design your program with a public method called print_Code that outputs all the
 * code words. Provide initial values of letters and digits from the main method class
 * during object creation.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise04_01
{
    public static void main(String[] args)
    {
        PrintCodeword.getInstance().setCharacter('D');
        PrintCodeword.getInstance().setDigit(5);
        PrintCodeword.getInstance().printCode();
    }
}
