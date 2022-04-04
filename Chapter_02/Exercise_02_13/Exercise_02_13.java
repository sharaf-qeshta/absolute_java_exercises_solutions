package chapter_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 13. (This is an extension of an exercise from Chapter 1.) A simple rule to estimate your
 * ideal body weight is to allow 110 pounds for the first 5 feet of height and 5 pounds
 * for each additional inch. Create the following text in a text file. It contains the names
 * and heights in feet and inches of Tom Atto (6’3”), Eaton Wright (5’5”), and Cary
 * Oki (5’11”):
 *  Tom Atto
 *  6
 *  3
 *  Eaton Wright
 *  5
 *  5
 *  Cary Oki
 *  5
 *  11
 *  Write a program that reads the data in the file and outputs the full name and ideal
 * body weight for each person. In the next chapter, you will learn about loops, which
 * allow for a more efficient way to solve this problem.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_02_13
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/chapter_two/test.txt"));

        while (scanner.hasNext()){
            String name = scanner.nextLine();
            int feet = Integer.parseInt(scanner.nextLine());
            int inches = Integer.parseInt(scanner.nextLine());

            double idealWeight = (feet/5.0) * 110;
            inches += (feet % 5) *  12;
            idealWeight += inches * 5;

            System.out.println(name + ": " + idealWeight + " pounds");

        }
    }
}
