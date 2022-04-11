package chapter_ten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 1. The text files boynames.txt and girlnames.txt, which are included in the
 * source code for this book text, contain a list of the 1,000 most popular boy and
 * girl names in the United States for the year 2003 as compiled by the Social Security
 * Administration.
 *  These are blank-delimited files, where the most popular name is listed first, the
 * second most popular name is listed second, and so on, to the 1,000th most popular
 * name, which is listed last. Each line consists of the first name followed by a blank
 * space and then the number of registered births using that name in the year. For
 * example, the girlnames.txt file begins with
 * Emily 25494
 * Emma 22532
 * Madison 19986
 *  This indicates that Emily was the most popular name with 25,494 registered
 * namings, Emma was the second most popular with 22,532, and Madison was the
 * third most popular with 19,986.
 *  Write a program that reads both the girl and boy files into memory using arrays.
 * Then, allow the user to input a name. The program should search through both
 * arrays. If there is a match, then it should output the popularity ranking and the
 * number of namings. The program should also indicate if there is no match.
 *  For example, if the user enters the name “Justice,” then the program should output
 * Justice is ranked 456 in popularity among girls with 655 namings.
 * Justice is ranked 401 in popularity among boys with 653 namings.
 *  If the user enters the name “Walter,” then the program should output
 * Walter is not ranked among the top 1000 girl names.
 * Walter is ranked 356 in popularity among boys with 775 namings.
 *
 * @author Sharaf Qeshta */

public class Exercise_10_01
{
    private static final String[] boys = new String[1000];
    private static final int[] boyNamesCount = new int[1000];

    private static final String[] girls = new String[1000];
    private static final int[] girlNamesCount = new int[1000];

    public static void main(String[] args)
    {
        try (Scanner reader = new Scanner(new File("src/chapter_ten/names.txt")))
        {
            int counter = 0;
            while (reader.hasNext())
            {
                StringTokenizer st = new StringTokenizer(reader.nextLine());
                st.nextToken();

                boys[counter] = st.nextToken();
                boyNamesCount[counter] = Integer.parseInt(st.nextToken());
                girls[counter] = st.nextToken();
                girlNamesCount[counter++] = Integer.parseInt(st.nextToken());

            }
        }
        catch (IOException ignored) {}

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter A Name: ");
        String name = keyboard.next();
        search(name);
    }


    public static void search(String name)
    {
        boolean found = false;
        for (int i = 0; i < girls.length; i++)
        {
            if (girls[i].equals(name))
            {
                System.out.println(name + " is ranked " + (i+1)
                        + " in popularity among girls with " +  girlNamesCount[i]  + " namings.");
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println(name + " is not ranked among the top 1000 girl names.");


        found = false;
        for (int i = 0; i < boys.length; i++)
        {
            if (boys[i].equals(name))
            {
                System.out.println(name + " is ranked " + (i+1)
                        + " in popularity among boys with " +  boyNamesCount[i]  + " namings.");
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println(name + " is not ranked among the top 1000 boy names.");
    }

}
