package chapter_fifteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 9. Displays 15.34 and 15.35 provide the beginnings of a spell-checker. Refine the
 * program to make it more useful. The modified program should read in a text file, parse
 * each word, see if it is in the hash table, and, if not, output the line number and
 * word of the potentially misspelled word. Discard any punctuation in the original
 * text file. Use the words.txt file as the basis for the hash table dictionary. This file
 * can be found on the book’s website. The file contains 87,314 words in the English
 * language. Test your spell-checker on a short text document.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_09
{
    public static void main(String[] args)
    {
        /*
        * classe is Misspelled at line 20
        * Sharaf is Misspelled at line 20
        * Qeshta is Misspelled at line 20
        * classe is Misspelled at line 21
        * Sharaf is Misspelled at line 21
        * Qeshta is Misspelled at line 21
        * classe is Misspelled at line 22
        * Sharaf is Misspelled at line 22
        * Qeshta is Misspelled at line 22
        * * */
        HashTable table = HashTable.getInstance("src/chapter_fifteen/words.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Path: ");
        String filePath = scanner.nextLine();

        try (Scanner reader = new Scanner(new File(filePath)))
        {
            int i = 0;
            while (reader.hasNext())
            {
                i++;
                String[] words = reader.nextLine().trim().split("[\\s\\p{Punct}]+");
                for (String word: words)
                {
                    if (!table.contains(word.toLowerCase()))
                        System.out.println(word + " is Misspelled at line " + i);
                }
            }
        }
        catch (IOException exception)
        {
            System.out.println("File Not Exist !!");
        }
    }
}
