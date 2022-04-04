package chapter_two;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 14. From Programming Project 10 in Chapter 1, scientists estimate that roughly 10
 * grams of caffeine consumed at one time is a lethal overdose. Write two programs
 * to compute how many drinks it takes to kill a person.
 * The first program should input the name of the drink and the number of
 * milligrams of caffeine in the drink. It should then output the drink name and the
 * number of drinks it takes to kill a person. For example, if the user enters “coffee”
 * and “160”, then the program should output “It will take approximately 62.5
 * drinks of coffee to kill a person from caffeine.”
 * The second program should perform the same calculation as the first program,
 * but read the name of the drink and the number of milligrams of caffeine in the
 * drink from a file named drink.txt and output the answer to the console.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_02_14_01
{
    public static final int LETHAL_OVERDOSE = 10; // grams
    public static void main(String[] args)
    {
        int mgToKillPerson = LETHAL_OVERDOSE * 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the drink name: ");
        String drinkName = scanner.next();

        System.out.print("enter the amount of caffeine in the drink: ");
        double caffeinePerDrink = scanner.nextDouble();

        double numberOfDrinks = mgToKillPerson/caffeinePerDrink;
        DecimalFormat df = new DecimalFormat(".0");

        System.out.println("It will take approximately " + df.format(numberOfDrinks)
                + " drinks of " + drinkName + " to kill a person from caffeine.");
    }



}



