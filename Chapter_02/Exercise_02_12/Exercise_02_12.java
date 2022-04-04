package chapter_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 12. (This is a variant of an exercise from Chapter 1.) Create a text file that contains the
 * text "I hate programming!" Write a program that reads in this line of text from
 * the file and then the text with the first occurrence of "hate" changed to "love". In
 * this case, the program would output "I love programming!" Your program should
 * work with any line of text that contains the word "hate", not just the example given
 * in this problem. If the word "hate" occurs more than once in the line, your program
 * should replace only the first occurrence of "hate".
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_02_12
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/chapter_two/test.txt"));

        while (scanner.hasNext()){
            String newLine = scanner.nextLine().replaceFirst("hate", "love");
            System.out.println(newLine);
        }
    }
}
