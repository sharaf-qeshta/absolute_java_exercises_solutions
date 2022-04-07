package chapter_six;

/**
 * 19. Some word games require the player to find words that can be formed using
 * the letters of another word. For example, given the word SWIMMING, other words that
 * can be formed using the letters include SWIM, WIN, WING, SING, MIMING,
 * etc. Write a program that lets the user enter a word and then output all the words
 * contained in the file words.txt that can be formed from the letters of the entered
 * word. One algorithm to do this is to compare the letter histograms for each word.
 * Create an array that counts up the number of each letter in the entered word (e.g.,
 * one S, one W, two I, two M, etc.) and then creates a similar array for the current
 * word read from the file. The two arrays can be compared to see if the word from
 * the file could be created out of the letters from the entered word.
 *
 * @author Sharaf Qeshta
 * */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** if found on the internet contains 600,000 words we can use it here */
public class Exercise_06_19
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/chapter_six/words.txt");
        Scanner fileScanner = new Scanner(file);

        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("Enter A Word: ");
        String word = keyboardScanner.next();
        keyboardScanner.close();

        while (fileScanner.hasNext())
        {
            String word_ = fileScanner.next();

            if (contains(word, word_))
            {
                System.out.println("You Can Form " + word_ + " From " + word);
            }
        }

    }

    public static boolean contains(String word, String subWord)
    {
        for (int i = 0; i < subWord.length(); i++)
        {
            if (!word.contains(subWord.charAt(i) + ""))
                return false;
        }
        return true;
    }

}
