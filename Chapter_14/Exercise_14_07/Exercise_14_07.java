package chapter_fourteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 7. Programming Project 6.13 implemented a simple trivia game using an array of
 * Trivia objects. Redo this project but use an ArrayList of Trivia objects instead
 * of an array. The run-time behavior should remain identical to before.
 *
 * @author Sharaf Qeshta */


public class Exercise_14_07
{
    private static final Trivia[] trivia_ = {
            new Trivia("What is The Capital Of USA? ", "Washington", 1),
            new Trivia("What is The Capital of California? ", "Sacramento", 2),
            new Trivia("In which Year The Civil War End? ", "1865", 3),
            new Trivia("How is The President Of The US During WW2? ", "Franklin Roosevelt", 3),
            new Trivia("What is The Highest Mountain In America? ", "Denali", 4)};

    private static final ArrayList<Trivia> trivia = new ArrayList<>(Arrays.asList(trivia_));


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        for (Trivia question: trivia)
        {
            System.out.print(question.getQuestion());
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(question.getAnswer()))
            {
                totalScore += question.getScore();
                System.out.println("You Got It!!");
            }
            else
                System.out.println("Wrong :[ the correct answer is " + question.getAnswer());
        }

        scanner.close();
        System.out.println("Your Final Scores is: " + totalScore);
    }

}
