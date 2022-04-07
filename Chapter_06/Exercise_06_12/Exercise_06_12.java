package chapter_six;

import java.util.Scanner;

/**
 * 12. Write a program that plays a simple trivia game. The game should have five questions.
 * Each question has a corresponding answer and point value between 1 and
 * 3 based on the difficulty of the question. Implement the game using three arrays.
 * An array of type String should be used for the questions. Another array of type
 * String should be used to store the answers. An array of type int should be used
 * for the point values. All three arrays should be declared to be of size 5.
 *  The index into the three arrays can be used to tie the question, answer, and point
 * value together. For example, the item at index 0 for each array would correspond
 * to question 1, answer 1, and the point value for question 1. The item at index 1
 * for each array would correspond to question 2, answer 2, and the point value for
 * question 2, and so forth. Manually hardcode the five questions, answers and point
 * values into your program using trivia of your choice.
 *  Your program should ask the player each question one at a time and allow the
 * player to enter an answer. If the player’s answer matches the actual answer, the
 * player wins the number of points for that question. If the player’s answer is incorrect,
 * the player wins no points for the question. Your program should show the
 * correct answer if the player is incorrect. After the player has answered all five questions,
 * the game is over, and your program should display the player’s total sc
 *
 * @author Sharaf Qeshta
 * */



public class Exercise_06_12
{
    private static final String[] questions = {"What is The Capital Of USA? ",
    "What is The Capital of California? ", "In which Year The Civil War End? ",
    "How is The President Of The US During WW2? ", "What is The Highest Mountain In America? "};
    private static final String[] answers = {"Washington", "Sacramento", "1865", "Franklin Roosevelt", "Denali"};

    private static final int[] scores = {1, 2, 3, 3, 4};


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        for (int i = 0; i < questions.length; i++)
        {
            System.out.print(questions[i]);
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(answers[i]))
            {
                totalScore += scores[i];
                System.out.println("You Got It!!");
            }
            else
                System.out.println("Wrong :[ the correct answer is " + answers[i]);
        }

        scanner.close();
        System.out.println("Your Final Scores is: " + totalScore);
    }

}
