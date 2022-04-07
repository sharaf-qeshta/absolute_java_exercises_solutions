package chapter_six;


import java.util.Scanner;

/**
 * 20. Write a program that manages a list of up to 10 players and their high scores in the
 * computer’s memory (not on disk for this Programming Project). Use two arrays
 * to manage the list. One array should store the players’ names, and the other array
 * should store the players’ high scores. Use the index of the arrays to correlate the
 * names with the scores. Your program should support the following features:
 * a. Add a new player and score (up to 10 players).
 * b. Print all the players’ names and their scores to the screen.
 * c. Allow the user to enter a player’s name and output that player’s score or a
 * message if that player’s name has not been entered.
 * d. Allow the user to enter a player’s name and remove the player from the list.
 *  Create a menu system that allows the user to select which option to invoke.
 *
 * @author Sharaf Qeshta
 *  */


public class Exercise_06_20
{
    private static final String[] names = new String[10];
    private static final int[] scores = new int[10];
    private static int available = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        while (true)
        {
            printList();
            System.out.print("Enter A Choice: ");
            int choice = scanner.nextInt();
            handleChoice(choice);

        }

    }

    public static void printList()
    {
        System.out.println("1.Add New Player");
        System.out.println("2.Get Description");
        System.out.println("3.Search a Player");
        System.out.println("4.Delete a Player");
        System.out.println("5.Exit");
    }


    public static void handleChoice(int choice)
    {
        switch (choice)
        {
            case 1: addPlayer(); break;
            case 2: printDescription(); break;
            case 3: searchPlayer(); break;
            case 4: deletePlayer(); break;
            case 5: System.exit(0);
            default:
                System.out.println("Wrong Choice");
        }
    }


    public static void addPlayer()
    {
        System.out.println();
        System.out.print("Enter Player Name: ");
        String playerName = scanner.next();

        System.out.print("Enter Player Score: ");
        int score = scanner.nextInt();

        if (available > 9)
        {
            System.out.println("Exceed The Limit 10 You Can`t Add New Player");
            return;
        }

        names[available] = playerName;
        scores[available++] = score;
        System.out.println();
    }

    public static void printDescription()
    {
        System.out.println();
        for (int i = 0; i < names.length && names[i] != null; i++)
            System.out.println("Name: " + names[i] + ", Scores: " + scores[i]);
        System.out.println();
    }

    public static void searchPlayer()
    {
        System.out.println();
        System.out.print("Enter Player Name: ");
        String name = scanner.next();

        int index = getPlayerIndex(name);

        if (index == -1)
            System.out.println("Player " + name + " Does`nt Exist !!");
        else
            System.out.println("Player " + name + " Scores is " + scores[index]);
        System.out.println();
    }

    public static int getPlayerIndex(String player)
    {
        for (int i = 0; i < names.length && names[i] != null; i++)
        {
            if (player.equals(names[i]))
                return i;
        }
        return -1;
    }


    public static void deletePlayer()
    {
        System.out.println();
        System.out.print("Enter Player Name: ");
        String name = scanner.next();

        int index = getPlayerIndex(name);

        if (index == -1)
            System.out.println("Player " + name + " Does`nt Exist !!");
        else
        {
            names[index] = null;
            scores[index] = 0;
            trim(index);
        }
        System.out.println();
    }

    public static void trim(int index)
    {
        for (int i = index; i < names.length-1 && names[i+1] != null; i++)
        {
            names[index] = names[i+1];
            scores[index] = scores[i+1];
        }
        available--;
    }
}
