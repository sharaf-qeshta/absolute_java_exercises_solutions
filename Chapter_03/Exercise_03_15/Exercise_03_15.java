package chapter_three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 15. This problem is based on a “Nifty Assignment” by Steve Wolfman (http://nifty.
 * stanford.edu/2006/wolfman-pretid). Consider lists of numbers from real-life data
 * sources—for example, a list containing the number of students enrolled in different
 * course sections, the number of comments posted for different Facebook status updates,
 * the number of books in different library holdings, the number of votes per
 * precinct, etc. It might seem like the leading digit of each number in the list could
 * be 1–9 with an equally likely probability. However, Benford’s Law states that the
 * leading digit is 1 about 30% of the time and drops with larger digits. The leading
 * digit is 9 only about 5% of the time.
 *  Write a program that tests Benford’s Law. Collect a list of at least 100 numbers
 * from some real-life data source and enter them into a text file. Your program
 * should loop through the list of numbers and count how many times 1 is the first
 * digit, 2 is the first digit, etc. For each digit, output the percentage it appears as
 * the first digit.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_03_15
{
    public static int one = 0;
    public static int two = 0;
    public static int three = 0;
    public static int four = 0;
    public static int five = 0;
    public static int six = 0;
    public static int seven = 0;
    public static int eight = 0;
    public static int nine = 0;
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/chapter_three/numbers.txt");
        Scanner scanner = new Scanner(file);

        int length = 0;
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            int firstDigit = Integer.parseInt(line.charAt(0) + "");
            increment(firstDigit);
            length++;
        }

        System.out.println("probability of one: " + ((100 * one) / length) + "%"); // 20%
        System.out.println("probability of two: " + ((100 * two) / length) + "%"); // 6%
        System.out.println("probability of three: " + ((100 * three) / length) + "%"); // 6%
        System.out.println("probability of four: " + ((100 * four) / length) + "%"); // 12%
        System.out.println("probability of five: " + ((100 * five) / length) + "%"); // 18%
        System.out.println("probability of six: " + ((100 * six) / length) + "%"); // 10%
        System.out.println("probability of seven: " + ((100 * seven) / length) + "%"); // 8%
        System.out.println("probability of eight: " + ((100 * eight) / length) + "%"); // 10%
        System.out.println("probability of nine: " + ((100 * nine) / length) + "%"); // 10%

    }


    public static void increment(int i)
    {
        switch (i)
        {
            case 1 : one++; break;
            case 2 : two++; break;
            case 3 : three++; break;
            case 4 : four++; break;
            case 5 : five++; break;
            case 6 : six++; break;
            case 7 : seven++; break;
            case 8 : eight++; break;
            case 9 : nine++; break;
        }
    }
}
