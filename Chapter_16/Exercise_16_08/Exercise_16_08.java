package chapter_sixteen;

import java.io.File;
import java.text.DecimalFormat;
import java.util.*;

/**
 * 8. You have collected a file of faculty where each faculty member is rated 1 (lowest)
 * to 5 (highest). The first line of the file is a number that identifies how many rating
 * entries are in the file. Each rating then consists of two lines: the unique ID of the
 * faculty followed by the numeric rating from 1 to 5. Here is a sample rating file with
 * three unique faculty IDs and six ratings:
 * 8
 * Eve_8640
 * 5
 * Kate_6721
 * 5
 * Eve_8640
 * 3
 * Rex_5432
 * 4
 * Eve_8640
 * 1
 * Kate_6721
 * 2
 * Rex_5432
 * 2
 * Kate_6721
 * 1
 *  Write a program that reads a file in this format, calculates the average rating for
 * each faculty member, and outputs the average along with the number of reviews.
 * Here is the desired output for the sample data:
 * Eve_8640: 3 reviews, average of 3.0 / 5
 * Kate_6721: 3 reviews, average of 2.6 / 5
 * Rex_5432: 2 reviews, average of 3.0 / 5
 *  Use an ArrayList to calculate the output. Your map(s) should index from a string
 * representing each faculty member’s name to integers that store the number of
 * reviews for the faculty ID and the sum of the ratings for the faculty memb
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_16_08
{
    public static final HashMap<String, Integer> RATINGS_SUM = new HashMap<>();
    public static final HashMap<String, Integer> RATINGS_COUNT = new HashMap<>();
    public static final String FILE_PATH = "src/chapter_sixteen/ratings.txt";
    public static void main(String[] args)
    {
        /*
        * Kate_6721 : 3 reviews, average of 2.7 / 5
        * Rex_5432 : 2 reviews, average of 3.0 / 5
        * Eve_8640 : 3 reviews, average of 3.0 / 5
        * */
        readData();
        RATINGS_SUM.forEach((k, v) ->
        {
            DecimalFormat df = new DecimalFormat("0.0");
            System.out.println(k + " : " + RATINGS_COUNT.get(k) +  " reviews, average of "
                    + df.format((v+0.0) /(RATINGS_COUNT.get(k))) + " / 5");
        });
    }

    public static void readData()
    {
        try (Scanner scanner = new Scanner(new File(FILE_PATH)))
        {
            scanner.nextLine();
            while (scanner.hasNext())
            {
                String id = scanner.nextLine().trim();
                int rating = Integer.parseInt(scanner.nextLine());
                if (!RATINGS_SUM.containsKey(id))
                {
                    RATINGS_SUM.put(id, rating);
                    RATINGS_COUNT.put(id, 1);
                }
                else
                {
                    RATINGS_SUM.put(id, RATINGS_SUM.get(id) + rating);
                    RATINGS_COUNT.put(id, RATINGS_COUNT.get(id) + 1);
                }
            }
        }
        catch (Exception ignored){}
    }
}
