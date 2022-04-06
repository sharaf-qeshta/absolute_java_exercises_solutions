package chapter_four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 15. The goal of this Programming Project is to extend Programming Project 14 to find
 * the customer from the CSV file who made ratings that are most similar to ratings
 * input from the keyboard. First, do Programming Project 14. Then modify your
 * solution so that it asks the user to input ratings for the first four products before
 * the program reads from the file. The program should then predict whether or
 * not the user will like the final product by outputting the rating made by the most
 * similar customer. Use the formula | Au – Ac| + | Bu – Bc| + | Cu – Cc| + | Du – Dc|
 * to compute the similarity, where Au is the rating for product A made by the user
 * at the keyboard and Ac is the rating for product A made by a customer from the
 * file. A lower total indicates greater similarity. For example, if the user inputs 1 for
 * product A, 1 for product B, 3 for product C, and 2 for product D, then with the
 * values from Programming Project 14, the similarity to the customer in the first row
 * is |1 – 3| + |1 – 0| + |3 – 5| + |2 – 1| = 6, while the similarity to the customer in the
 * second row is |1 – 1| + |1 – 1| + |3 – 4| + |2 – 2| = 1. The customer in the second
 * row has the greatest similarity, so the program would output that the prediction
 * for product E is 1, which is the second customer’s rating for product E.
 *
 * @author Sharaf Qeshta*/


public class Exercise_04_15
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Ratings fro Product A: ");
        int a = scanner.nextInt();

        System.out.print("Enter Ratings fro Product B: ");
        int b = scanner.nextInt();

        System.out.print("Enter Ratings fro Product C: ");
        int c = scanner.nextInt();

        System.out.print("Enter Ratings fro Product D: ");
        int d = scanner.nextInt();

        scanner.close();

        File file = new File("src/chapter_four/ratings.txt");
        Scanner fileScanner = new Scanner(file);

        int c1Similarity =0, c2Similarity = 0, c3Similarity = 0;
        int e = 0;
        int counter = 1;

        while (fileScanner.hasNext())
        {
            String line = fileScanner.nextLine();
            if (line.startsWith("A"))
                continue;
            StringTokenizer st = new StringTokenizer(line, ",");

            int r1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int r3 = Integer.parseInt(st.nextToken());
            int r4 = Integer.parseInt(st.nextToken());
            int r5 = Integer.parseInt(st.nextToken());

            // | Au – Ac| + | Bu – Bc| + | Cu – Cc| + | Du – Dc|
            int similarity = Math.abs(a - r1) + Math.abs(b - r2) + Math.abs(c - r3) + Math.abs(d - r4);

            if (counter == 1){
                c1Similarity = similarity;
                e = r5;
            }
            else if (counter == 2){
                c2Similarity = similarity;
                if (c2Similarity < c1Similarity)
                    e = r5;
            }
            else if (counter == 3){
                c3Similarity = similarity;
                if (c3Similarity < c1Similarity && c3Similarity < c2Similarity)
                    e = r5;
            }
            counter++;
        }
        fileScanner.close();

        System.out.println("You Will Probably Choose " + e + " To Rate Product E!");

    }

}
