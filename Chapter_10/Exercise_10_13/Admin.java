package chapter_ten;

import java.io.*;
import java.util.Scanner;

public class Admin
{
    public static final String filePath = "src/chapter_ten/trivia.dat";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        while (true)
        {
            System.out.println("1.Delete A Trivia");
            System.out.println("2.Add A Trivia");
            System.out.println("3.Display All Trivia");
            System.out.println("4.Exit");
            System.out.println("5.Go to Game Menu");

            System.out.print("\nEnter A Choice: ");
            int choice = scanner.nextInt();
            handleChoice(choice);

            if (choice == 5)
                break; // once a question added the he cannot back here from the game panel
        }
    }


    public static void handleChoice(int choice)
    {
        switch (choice)
        {
            case 1: deleteOption();break;
            case 2: addOption();break;
            case 3: print(retrieveAllTrivia());break;
            case 4: System.exit(0);
            case 5: Exercise_10_13.main(new String[] {}); // go to game menu
            default:
                System.out.println("Wrong Choice!!");
        }
    }




    public static void deleteOption()
    {
        System.out.print("\n\nEnter Trivia ID: ");
        String id = scanner.next();
        delete(id);
    }


    public static void addOption()
    {
        System.out.println("Enter Trivia ID: ");
        String id = scanner.next();

        scanner.nextLine();

        System.out.println("Enter Question: ");
        String question = scanner.nextLine();

        System.out.println("Enter Answer: ");
        String answer = scanner.nextLine();

        System.out.print("Enter points: ");
        int points = scanner.nextInt();

        addTrivia(new Trivia(id, question, answer, points));
        System.out.println();
    }

    public static void addTrivia(Trivia trivia)
    {
        Trivia[] records = retrieveAllTrivia();
        for (int i = 0; i < records.length; i++)
        {

            if (records[i] == null)
            {
                records[i] = trivia;
                writeAll(records);
                System.out.println(trivia.getId() + " Added Successfully");
                return;
            }
            if (records[i].getId().equals(trivia.getId()))
            {
                System.out.println(trivia.getId() + " Is Already Exist");
                return;
            }
        }
        System.out.println(trivia.getQuestion());
    }

    public static void print(Trivia[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != null)
                System.out.println((i+1) + ". " + array[i]);
        }
    }

    public static boolean delete(String triviaID)
    {

        Trivia[] records = retrieveAllTrivia();
        boolean found = false;
        for (int i = 0; i < records.length
                && records[i] != null; i++)
        {
            if (records[i].getId().equals(triviaID))
            {
                records[i] = null;
                found = true;
                System.out.println(triviaID + " Deleted Successfully!!");
                break;
            }

        }
        if (found)
            writeAll(records);
        return found;
    }

    public static void writeAll(Trivia[] array)
    {
        try (ObjectOutputStream obj =
                     new ObjectOutputStream(new FileOutputStream(new File(filePath))))
        {
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] != null)
                    obj.writeObject(array[i]);
            }
        }
        catch (IOException ignored) {}
    }

    public static Trivia[] retrieveAllTrivia()
    {
        Trivia[] trivias = new Trivia[1000]; // will be changed in the code
        int index = 0;
        try (ObjectInputStream obj =
                     new ObjectInputStream(new FileInputStream(new File(filePath))))
        {
            while (true)
            {
                Trivia trivia_ = (Trivia) obj.readObject();
                trivias[index++] = trivia_;
                if (index > trivias.length-1)
                {
                    // change the array size
                    Trivia[] temp = new Trivia[trivias.length*2];
                    for (int i = 0; i < trivias.length; i++)
                        temp[i] = trivias[i];
                    trivias = temp;
                }
            }
        }
        catch (IOException | ClassNotFoundException ignored) {}
        return trivias;
    }
}
