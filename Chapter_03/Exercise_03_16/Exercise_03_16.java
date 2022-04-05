package chapter_three;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 16. Suppose a text file contains the following verse from the Bible:
 *  Let us fix our eyes on Jesus, the author and perfecter of our faith, who for the joy set
 * before him endured the cross, scorning its shame, and sat down at the right hand of the
 * throne of God.
 *  Write a program that takes one of the five vowels (a, e, i, o, and u) as input from
 * the user and checks each word of the text file to determine whether or not it starts
 * with that vowel. Then, it should also display those words on the screen, one word
 * per line
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_03_16
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a vowel to search in: ");
        char vowel = input.next().charAt(0);
        input.close();

        Scanner scanner = new Scanner(new File("src/chapter_three/bibbleVerse.txt"));
        while (scanner.hasNext())
        {
            String word = scanner.next();
            if (word.charAt(0) == vowel)
                System.out.println(word);
        }
    }
}
