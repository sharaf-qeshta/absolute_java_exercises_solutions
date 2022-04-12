package chapter_ten;

import java.util.Scanner;


/**
 * 13. Programming Projects 6.12 and 6.13 asked you to write a program to play a simple
 * trivia game consisting of five questions. The questions, answers, and point values
 * were hardcoded into array(s). This programming project involves moving the trivia
 * questions into one or more binary files instead, and then loading the trivia
 * questions into memory when the program starts.
 *  First, write a program that allows an administrator to manage the questions for the
 * trivia game. When the program is run, it should check to see if a data file exists. If
 * the data file exists, then the trivia questions should be loaded from the data file into
 * array(s) in memory. If the data file does not exist, start the program with no trivia
 * questions in memory. The program should then present a menu that allows the
 * administrator to list all trivia items (question, answer, and value) in the database,
 * add a new trivia item, or delete an existing trivia item. Upon exiting the program,
 * the trivia data in memory should be stored to one or more binary files using the
 * writeObject method.
 *  Second, modify either solution to Programming Project 6.12 or 6.13 to read
 * in the trivia data from the binary file created by the administrator’s program.
 * Note that the game is no longer limited to five questions, since an arbitrary
 * number of trivia items may be created by the administrator’s program and
 * stored in the binary file(s).
 *
 * @author Sharaf Qeshta */


public class Exercise_10_13
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Trivia[] trivia = Admin.retrieveAllTrivia();
        int totalScore = 0;

        int i;
        for (i = 0; i < trivia.length && trivia[i] != null; i++)
        {

            System.out.print(trivia[i].getQuestion() + ": ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(trivia[i].getAnswer()))
            {
                totalScore += trivia[i].getScore();
                System.out.println("You Got It!!");
            }
            else
                System.out.println("Wrong :[ the correct answer is " + trivia[i].getAnswer());
        }

        if (i == 0) // there`s no questions
            Admin.main(new String[] {}); // go to admin panel
        scanner.close();
        System.out.println("Your Final Scores is: " + totalScore);
    }

}
