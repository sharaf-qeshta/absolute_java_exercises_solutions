package chapter_fifteen;

import java.util.Scanner;

/**
 * 2. A record contains data as well as reference to the next record. We should be
 * able to insert or remove data within the data records. Create a class named as
 * WordLinkedList that uses the LinkedList class discussed in this chapter to contain
 * lists of words. Create a menu-driven program that allows a user to choose from the
 * following list of operations:
 *  1. Insert word in the beginning
 *  2. Insert word at a given position
 *  3. Delete word from the beginning
 *  4. Delete word from a given position
 *  5. Display complete list
 *  6. Search a specific word
 *  7. Exit
 *
 * @author Sharaf Qeshta
 *  */


public class Exercise_15_02
{
    private static final Scanner scanner = new Scanner(System.in);
    private static final WordLinkedList words = new WordLinkedList();
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("1. Insert word in the beginning");
            System.out.println("2. Insert word at a given position");
            System.out.println("3. Delete word from the beginning");
            System.out.println("4. Delete word from a given position");
            System.out.println("5. Display complete list");
            System.out.println("6. Search a specific word");
            System.out.println("7. Exit");

            System.out.print("\nEnter Choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1 -> firstOption();
                case 2 -> secondOption();
                case 3 -> thirdOption();
                case 4 -> fourthOption();
                case 5 -> fifthOption();
                case 6 -> sixthOption();
                case 7 -> System.exit(0);
                default -> System.out.println("Invalid Input");
            }
        }
    }

    /** 1. Insert word in the beginning */
    public static void firstOption()
    {
        System.out.println();
        System.out.print("Enter A word To Insert: ");
        String word = scanner.next();
        words.insert(word);
        System.out.println(word + " Inserted at Index 0");
        System.out.println();
    }

    /** 2. Insert word at a given position */
    public static void secondOption()
    {
        System.out.println();
        System.out.print("Enter A word To Insert: ");
        String word = scanner.next();
        System.out.print("Enter " + word + " Position: ");
        int index = scanner.nextInt();
        words.insert(word, index);
        System.out.println(word + " Inserted at Index " + index);
        System.out.println();
    }

    /** 3. Delete word from the beginning */
    public static void thirdOption()
    {
        System.out.println();
        System.out.println(words.delete() + " Deleted!!");
        System.out.println();
    }

    /** 4. Delete word from a given position */
    public static void fourthOption()
    {
        System.out.println();
        System.out.print("Enter Word Position: ");
        int index = scanner.nextInt();

        System.out.println(words.delete(index) + " Deleted!!");
        System.out.println();
    }

    /** 5. Display complete list */
    public static void fifthOption()
    {
        System.out.println();
        words.displayCompleteList();
        System.out.println();
    }

    /** 6. Search a specific word */
    public static void sixthOption()
    {
        System.out.println();
        System.out.print("Enter A word To Search For : ");
        String word = scanner.next();
        int result = words.search(word);
        if (result == -1)
            System.out.println(word + " Not Found !!");
        else
            System.out.println(word + " Found At index " + result);
        System.out.println();
    }
}
