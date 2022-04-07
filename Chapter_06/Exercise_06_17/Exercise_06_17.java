package chapter_six;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 17. Programming Project 4.14 asked you to read in a CSV file of product ratings. The
 * file was limited to exactly five products. Redo Programming Project 4.14, except
 * calculate the name of each product and how many products are in the file based
 * on the header line. Then read the CSV file and translate the data into a 2D array
 * that stores all of the ratings. Finally, output the average rating for each product.
 *
 * @author Sharaf Qeshta */



public class Exercise_06_17
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/chapter_six/ratings.txt");
        Scanner fileScanner = new Scanner(file);

        int[][] productsRatings = new int[100][2];

        while (fileScanner.hasNext())
        {
            String line = fileScanner.nextLine();
            if (line.startsWith("A"))
            {
                StringTokenizer st = new StringTokenizer(line, ",");
                productsRatings = new int[st.countTokens()][2];
                continue;
            }

            StringTokenizer st = new StringTokenizer(line, ",");
            int index = 0;
            while (st.hasMoreTokens())
            {
                int r = Integer.parseInt(st.nextToken());
                productsRatings[index][0] += r;
                if (r != 0)
                    productsRatings[index][1] += 1;
                index++;
            }
        }

        // 2.0, 1.0, 4.66666666667, 1.33333333, 2.0
        for (int i = 0; i < productsRatings.length; i++)
            System.out.println("The Average Rating for Product " + i + ": "
                    + (productsRatings[i][0] * 1.0 / productsRatings[i][1]));
    }

}
