package chapter_six;

import java.util.Scanner;

/**
 * 11. Write a program to assign passengers seats in an airplane. Assume a small airplane
 * with seat numberings as follows:
 *  1 A B C D
 *  2 A B C D
 *  3 A B C D
 *  4 A B C D
 *  5 A B C D
 *  6 A B C D
 *  7 A B C D
 *  The program should display the seat pattern, with an 'X' marking the seats already
 * assigned. For example, after seats 1A, 2B, and 4C are taken, the display should look
 * like the following:
 *  1 X B C D
 *  2 A X C D
 *  3 A B C D
 *  4 A B X D
 *  5 A B C D
 *  6 A B C D
 *  7 A B C D
 *  After displaying the seats available, the program should prompt for the seat desired,
 * the user can type in a seat, and then the display of available seats should be updated.
 * This continues until all seats are filled or until the user signals that the program
 * should end. If the user types in a seat that is already assigned, the program should
 * say that that seat is occupied and ask for another choice.
 *
 * @author Sharaf Qeshta */



public class Exercise_06_11
{
    private static Ticket[][] tickets = new Ticket[7][4];
    public static void main(String[] args)
    {
        fill();
        printTickets();

        Scanner scanner = new Scanner(System.in);

        while (!isFull())
        {
            System.out.println("Enter Q to Exit!");

            System.out.print("Enter Ticket id ex... 1A 2B: ");
            String ticketID = scanner.next();

            if (ticketID.equalsIgnoreCase("q"))
                break;

            take(ticketID);
            printTickets();
        }
        scanner.close();
        printTickets();
    }


    public static boolean isFull()
    {
        for (int i = 0; i < tickets.length; i++)
        {
            for (int j = 0; j < tickets[i].length; j++)
            {
                 if (!tickets[i][j].isTaken())
                     return false;
            }
        }
        return true;
    }


    public static void take(String id)
    {
        for (int i = 0; i < tickets.length; i++)
        {
            for (int j = 0; j < tickets[i].length; j++)
            {
                 if (tickets[i][j].getId()
                         .equals(id.toUpperCase()))
                 {
                     if (tickets[i][j].isTaken())
                         System.out.print("Ticket " + id + " is Taken :(");
                     else
                         tickets[i][j].setTaken(true);
                     return;
                 }
            }
        }
        System.out.print("Ticket " + id + " is Not Exist :(");
    }

    public static void fill()
    {
        for (int i = 0; i < tickets.length; i++)
        {
            for (int j = 0; j < tickets[i].length; j++)
            {
                tickets[i][j] = new Ticket((i+1) + "" + (char) (65+j) + "");
            }
        }
    }

    public static void printTickets()
    {
        System.out.println();
        for (int i = 0; i < tickets.length; i++)
        {
            System.out.print((i+1) + " ");
            for (int j = 0; j < tickets[i].length; j++)
            {
                if (tickets[i][j].isTaken())
                {
                    System.out.print(" X ");
                }
                else
                {
                    System.out.print(" " + (char) (65+j) + " ");
                }
            }
            System.out.println();
        }
    }
}
