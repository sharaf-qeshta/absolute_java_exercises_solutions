package chapter_three;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 13. The file words.txt on the book’s website contains 87,314 words from the English
 * language. Write a program that reads through this file and finds the longest word
 * that is a palindrome.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_03_13
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("src/chapter_three/words.txt"));

        String longestPalindrome = "";
        while (scanner.hasNext())
        {
            String word = scanner.nextLine();

            String reverse = "";
            for (int i = word.length()-1; i >= 0; i--)
                reverse += word.charAt(i);


            if (word.equals(reverse)
                    && reverse.length() > longestPalindrome.length())
                longestPalindrome = reverse;
        }

        System.out.println("The longest Palindrome is " + longestPalindrome);
    }
}
