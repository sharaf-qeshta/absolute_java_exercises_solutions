package chapter_nineteen;

import java.util.Scanner;

/**
 * 9. The program in Display 19.12 creates a database with the Names table
 * from Display 19.10. Modify this program so it also creates the Titles and
 * BooksAuthors tables with identical data entries as shown in Display 19.10.
 * Next, create a separate program that prompts the user to input the name of an
 * author and then outputs all book titles written by that author.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_19_09
{
    public static void main(String[] args)
    {
        /*
        * sample runs
        *
        * Enter a name of an author: Simmons, Dan
        * Simmons, Dan wrote:
        * Endymion
        * The Rise of Endymion
        *
        * Enter a name of an author: Adams, Douglas
        * Adams, Douglas wrote:
        * The Hitchhikers Guide to the Galaxy
        *
        * Enter a name of an author: Stephenson, Neal
        * Stephenson, Neal wrote:
        * Snow Crash
        * */

        Database.createTables();
        Database.insertData();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter a name of an author: ");
            String author = scanner.nextLine();
            Database.printResult(author);
        }
    }
}
