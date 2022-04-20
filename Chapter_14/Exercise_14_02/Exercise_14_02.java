package chapter_fourteen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2. Write a program that uses an ArrayList of parameter type Dictionary to store a
 * database of words. The Dictionary class should store the term and its synonyms.
 * Add appropriate accessor and mutator methods.
 *  Your database program should present a menu that allows the user to add a term,
 * delete a term, display all terms, search for a specific term, or search for a specific
 * term and give the user the option to delete it. The search should find any term
 * where any instance variable contains a target search string. For example, if “Legacy”
 * is the search target, then the term should be displayed or deleted. Use the
 * "foreach" loop to iterate through the ArrayList. The program should also check if
 * the user inputs only text and should prompt the user for “Invalid Input” if the
 * input is other than text.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_14_02
{
    private static final ArrayList<Dictionary> words = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("1. Add Term");
            System.out.println("2. Delete Term");
            System.out.println("3. Display All Terms");
            System.out.println("4. Exit");

            try
            {
                System.out.print("\nEnter Choice: ");
                int choice = scanner.nextInt();
                switch (choice)
                {
                    case 1 -> addTerm();
                    case 2 -> deleteTerm();
                    case 3 -> displayAllTerms();
                    case 4 -> System.exit(0);
                    default -> throw new Exception();
                }
            }
            catch (Exception exception)
            {
                System.out.println("Invalid Input");
                scanner.nextLine();
            }
        }
    }

    /* add a term */
    public static void addTerm()
    {
        System.out.println();
        System.out.print("Enter The Word: ");
        String word = scanner.next();

        System.out.print("Enter it`s Synonyms: ");
        String synonyms = scanner.next();

        Dictionary dictionary = new Dictionary(word, synonyms);
        if (words.contains(dictionary))
            System.out.println("Sorry the word " + word + " is Already Exist!");
        else
        {
            words.add(dictionary);
            System.out.println("Word " + word + " Added Successfully!!" );
        }

        System.out.println();
    }

    /* delete a term */
    public static void deleteTerm()
    {
        System.out.println();
        System.out.print("Enter The Word: ");
        String word = scanner.next();

        boolean deleted = false;
        for (Dictionary x: words)
        {
            if (x.getWord().equals(word) || x.getSynonyms().equals(word))
            {
                words.remove(x);
                System.out.println("Deleted Successfully!!");
                deleted = true;
            }
        }

        if (!deleted)
            System.out.println("Word " + word + " Not Found");
        System.out.println();
    }

    /* display all terms */
    public static void displayAllTerms()
    {
        System.out.println();
        for (int i = 0; i < words.size(); i++)
            System.out.println((i+1) + ". " + words.get(i));
        System.out.println();
    }
}
