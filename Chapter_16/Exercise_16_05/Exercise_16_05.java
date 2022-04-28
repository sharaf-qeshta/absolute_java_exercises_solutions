package chapter_sixteen;


import java.io.File;
import java.util.*;

/**
 * 5. Repeat the previous problem except create your own class, Name, that is added to a
 * HashMap instead of a HashSet. The Name class should have three private variables,
 * a String to store the name, an integer to store the number of namings for girls,
 * and an integer to store the number of namings for boys. Use the first name as the
 * key to the HashMap. The value to store is the Name object. Instead of ignoring the
 * number of namings, as in the previous project, store the number in the Name class.
 * Make the ArrayList a list of Name objects; each time you find a common name,
 * add the entire Name object to the list. Your program should then iterate through
 * the ArrayList and output each common name, along with the number of boy and
 * girl namings.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_16_05
{
    public static final String FILE_PATH = "src/chapter_sixteen/names.txt";
    public static final HashMap<String, Name> NAMES = new HashMap<>();
    public static final ArrayList<Name> COMMON_NAMES = new ArrayList<>();
    public static void main(String[] args)
    {
        // read girls names
        try (Scanner reader = new Scanner(new File(FILE_PATH)))
        {
                while (reader.hasNext())
                {
                    StringTokenizer tokenizer = new StringTokenizer(reader.nextLine());
                    tokenizer.nextToken();
                    tokenizer.nextToken();
                    int boyNamesCount = Integer.parseInt(tokenizer.nextToken());
                    String nameString = tokenizer.nextToken();
                    int girlNamesCount = Integer.parseInt(tokenizer.nextToken());
                    Name name = new Name(nameString, girlNamesCount, boyNamesCount);
                    NAMES.put(nameString, name);
                }

        }
        catch (Exception exception)
        {
            System.out.println("File Not Exist!!");
        }

        // read boys names
        try (Scanner reader = new Scanner(new File(FILE_PATH)))
        {
            while (reader.hasNext())
            {
                StringTokenizer tokenizer = new StringTokenizer(reader.nextLine());
                tokenizer.nextToken();
                String name = tokenizer.nextToken();
                if(NAMES.containsKey(name))
                    COMMON_NAMES.add(NAMES.get(name));
            }

        }
        catch (Exception exception)
        {
            System.out.println("File Not Exist!!");
        }

        System.out.println("We Have " + COMMON_NAMES.size() + " Common Names: ");
        for (Name name: COMMON_NAMES)
            System.out.println(name);

        /*
        * We Have 66 Common Names:
        * Name{name='Ryan', girlsCount=598, boysCount=508}
        * Name{name='Tyler', girlsCount=456, boysCount=358}
        * Name{name='Dylan', girlsCount=572, boysCount=492}
        * Name{name='Christian', girlsCount=299, boysCount=213}
        * ...
        * Name{name='Jadyn', girlsCount=1179, boysCount=1184}
        * Name{name='Kennedy', girlsCount=2772, boysCount=3297}
        * Name{name='Campbell', girlsCount=260, boysCount=183}
        * Name{name='Kasey', girlsCount=531, boysCount=437}
        * * */
    }
}
