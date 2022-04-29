package chapter_sixteen;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class SpellChecker
{
    private static final String FILE_PATH = "src/chapter_sixteen/words.txt";
    private static final HashSet<String> words = new HashSet<>();

    private static void getData()
    {
        try (Scanner scanner = new Scanner(new File(FILE_PATH)))
        {
            while (scanner.hasNext())
                words.add(scanner.nextLine().trim());
        }
        catch (Exception ignored) {}
    }

    public static void printMisspelledWords(String filePath)
    {
        getData();
        try (Scanner scanner = new Scanner(new File(filePath)))
        {
            while (scanner.hasNext())
            {
                String word = scanner.next().trim().toLowerCase();
                if (!words.contains(word))
                    System.out.println(word);
            }
        }
        catch (Exception exception)
        {
            System.out.println("File " + filePath + " Not Exist!");
        }
    }
}
