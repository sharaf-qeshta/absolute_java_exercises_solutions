package chapter_six;

import java.util.Scanner;

/**
 * 13. Modify Programming Project 12 to use a single array instead of three arrays. This
 * can be accomplished by creating a Trivia object that encapsulates the question,
 * answer, and point value for a particular trivia question. Next, create a single array
 * of five Trivia objects instead of three separate arrays for the question, answer,
 * and point values. This change will make your game more scalable if there were
 * ever additional properties to add to a Trivia object (you would not need to add
 * another array for each property). Although the program has internally changed to
 * a single array of objects, the execution of the program should be identical to before.
 *
 * @author Sharaf Qeshta
 * */



public class Exercise_06_13
{
    private static final Trivia[] trivia = {
            new Trivia("What is The Capital Of USA? ", "Washington", 1),
            new Trivia("What is The Capital of California? ", "Sacramento", 2),
            new Trivia("In which Year The Civil War End? ", "1865", 3),
            new Trivia("How is The President Of The US During WW2? ", "Franklin Roosevelt", 3),
            new Trivia("What is The Highest Mountain In America? ", "Denali", 4)};


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        for (int i = 0; i < trivia.length; i++)
        {
            System.out.print(trivia[i].getQuestion());
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(trivia[i].getAnswer()))
            {
                totalScore += trivia[i].getScore();
                System.out.println("You Got It!!");
            }
            else
                System.out.println("Wrong :[ the correct answer is " + trivia[i].getAnswer());
        }

        scanner.close();
        System.out.println("Your Final Scores is: " + totalScore);
    }

}
