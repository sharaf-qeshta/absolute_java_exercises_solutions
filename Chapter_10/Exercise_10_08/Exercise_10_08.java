package chapter_ten;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 8. Create a file WordBuff.txt that contains the following list of words: MADAM,
 * DAD, RISK, JAVA, MALAYALAM, RACECAR, RADAR, ROTOR, REFER,
 * SEDES, SOLOS, COURSE, STATS, TOROT, TENET, MACHINE, VIRTUAL,
 * STUDENT, PULLUP, PROGRAMME, and CORE. Write a program that reads
 * each word from the file and outputs the number of palindromes in the file.
 *
 * @author Sharaf Qeshta */


public class Exercise_10_08
{
    public static void main(String[] args)
    {
        int palindromeCount = 0;
        try (Scanner scanner = new Scanner(new File("src/chapter_ten/WordBuff.txt")))
        {
            while (scanner.hasNext())
            {
                if (isPalindrome(scanner.nextLine().trim()))
                    palindromeCount++;
            }
        }
        catch (IOException ignored) {}

        /* The Number of Palindromes in WordBuff.txt is 13 words! */
        System.out.println("The Number of Palindromes in WordBuff.txt is " + palindromeCount + " words!");
    }

    public static boolean isPalindrome(String word)
    {
        for (int i = 0, j = word.length()-1;
             i < word.length(); i++, j--)
        {
            if (word.charAt(i) != word.charAt(j))
                return false;
        }
        return true;
    }
}
