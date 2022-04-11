package chapter_ten;

import java.io.*;
import java.util.Scanner;

/**
 * 6. Write a program that gives and takes advice on program writing. The program
 * starts by writing a piece of advice to the screen and asking the user to type in a
 * different piece of advice. The program then ends. The next person to run the program
 * receives the advice given by the person who last ran the program. The advice is
 * kept in a text file and the content of the file changes after each run of the program.
 * You can use your editor to enter the initial piece of advice in the file so that the
 * first person who runs the program receives some advice. Allow the user to type in
 * advice of any length so that it can be any number of lines long. The user is told to
 * end his or her advice by pressing the Return key two times. Your program can then
 * test to see that it has reached the end of the input by checking to see when it reads
 * two consecutive occurrences of the character '\n'.
 *
 * @author Sharaf Qeshta */


public class Exercise_10_06
{
    public static final String filePath = "src/chapter_ten/advice.txt";

    public static void main(String[] args)
    {
        String advice = "";

        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNext())
                advice += scanner.nextLine() + "\n";
        }
        catch (IOException ignored) {}

        System.out.println("The Current Advice is : " + advice);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter A new Advice: ");
        keyboard.useDelimiter("\n\n");
        String advice_ = keyboard.next();

        try (PrintWriter writer = new PrintWriter(file))
        {
            writer.write(advice_);
        }
        catch (IOException ignored) {}

        System.out.println("Your Advice Recorded Bye :]");
    }
}
