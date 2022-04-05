package chapter_three;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 14. The file words.txt on the book’s website contains 87,314 words from the English
 * language. Write a program that reads through this file and finds the word that
 * has the most consecutive vowels. For example, the word "bedouin" has three
 * consecutive vowels.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_03_14
{
    private static final String VOWELS = "AEIOUaeiou";
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("src/chapter_three/words.txt"));

        String word = "";
        int consecutiveVowelsCount = 0;

        while (scanner.hasNext())
        {
            String input = scanner.nextLine();

            int tempVowelsCount = 0;
            for (int i = input.length()-1; i >= 0; i--){
                if (VOWELS.contains(input.charAt(i) + ""))
                {
                    tempVowelsCount++;
                }else {
                    if (tempVowelsCount > consecutiveVowelsCount){
                        word = input;
                        consecutiveVowelsCount = tempVowelsCount;
                    }
                    tempVowelsCount = 0;
                }
            }

        }
        System.out.println("The longest Palindrome is " + word);
        System.out.println(consecutiveVowelsCount);
    }
}
