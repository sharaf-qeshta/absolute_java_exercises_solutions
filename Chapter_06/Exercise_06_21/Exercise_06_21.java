package chapter_six;


import java.util.Scanner;

/**
 * 21. Redo Programming Project 6.20 but this time create a class named Player that
 * stores a player’s name and the player’s high score. The class should have suitable
 * constructors, accessors, and mutators. Next create a single array of type Player
 * that stores the players’ names and scores. Implement the same features as in
 * Programming Project 6.20 using the single array rather than multiple arrays.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_06_21
{
    private static final Player[] players = new Player[10];
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

        players[available++] = new Player(playerName, score);
        System.out.println();
    }

    public static void printDescription()
    {
        System.out.println();
        for (int i = 0; i < players.length && players[i] != null; i++)
            System.out.println("Name: " + players[i].getName() + ", Scores: " + players[i].getScores());
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
            System.out.println("Player " + name + " Scores is " + players[index].getScores());
        System.out.println();
    }

    public static int getPlayerIndex(String player)
    {
        for (int i = 0; i < players.length && players[i] != null; i++)
        {
            if (player.equals(players[i].getName()))
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
            players[index] = null;
            trim(index);
        }
        System.out.println();
    }

    public static void trim(int index)
    {
        for (int i = index; i < players.length-1 && players[i+1] != null; i++)
            players[index] = players[i+1];
        available--;
    }
}
