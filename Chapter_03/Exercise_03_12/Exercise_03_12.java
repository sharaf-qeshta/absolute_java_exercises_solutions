package chapter_three;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 12. Redo or do for the first time Programming Project 2.13 from Chapter 2, but this
 * time use a loop to read the names from the file. Your program should also handle
 * an arbitrary number of entries in the file instead of handling only three entries.
 * To do this, your program must check to see if there is still data left to read (i.e., it
 * has reached the end of the file). The appropriate methods to read from a file are
 * described in Section 2.3.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_03_12
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("src/chapter_three/test.txt"));

        while (scanner.hasNext())
        {
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
