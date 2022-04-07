package chapter_six;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 16. Programming Project 3.15 asked you to explore Benford’s Law. An easier way to
 * write the program is to use an array to store the digit counts. That is, count[0]
 * might store the number of times 0 is the first digit (if that is possible in your data
 * set), count[1] might store the number of times 1 is the first digit, and so forth.
 * Redo Programming Project 3.15 using arrays.
 * Write a program that tests Benford’s Law. Collect a list of at least 100 numbers
 * from some real-life data source and enter them into a text file. Your program
 * should use an array to store the digit counts. That is, count[0] might store the
 * number of times 0 is the first digit (if that is possible in your data set), count[1]
 * might store the number of times 1 is the first digit, and so forth. For each digit,
 * output the percentage it appears as the first digit.
 *
 * @author Sharaf Qeshta */



public class Exercise_06_16
{
    private static final int[] occurrences = new int[10];

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/chapter_six/numbers.txt");
        Scanner scanner = new Scanner(file);

        int length = 0;
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            int firstDigit = Integer.parseInt(line.charAt(0) + "");
            occurrences[firstDigit]++;
            length++;
        }

        for (int i = 0; i < occurrences.length; i++)
            System.out.println("probability of " + i + " is : "
                    + ((100 * occurrences[i]) / length) + "%");
    }

}
