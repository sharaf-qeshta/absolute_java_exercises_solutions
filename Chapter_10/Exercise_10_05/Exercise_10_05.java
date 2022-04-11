package chapter_ten;

import java.io.*;
import java.util.Scanner;

/**
 * 5. Write a program that edits a text file to display each complete sentence with a
 * period at the end in a separate line. Your program should work as follows: Create
 * a temporary file, copy from the source file to a temporary file and perform the
 * required operation. Copy the contents of the temporary file back into the source
 * file. Use a method (or methods) in the class File to remove the temporary file.
 * You will also want to use the class File for other things in your program. The
 * temporary file should have a name that is different from all existing files so that
 * the existing files are not affected (except for the file being edited). Your program
 * will ask the user for the name of the file to be edited. However, it will not ask the
 * user for the name of the temporary file, but will instead generate the name within
 * the program. You can generate the name any way that is clear and efficient. One
 * possible way to generate the temporary file is to start with an unlikely name, such
 * as "Temp1", and to append a digit, such as '1', until a name is found that does
 * not name an existing file.
 *
 * @author Sharaf Qeshta */


public class Exercise_10_05
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String fileName = keyboard.next();
        keyboard.close();


        String tempFileName = createTempFile();
        try (Scanner scanner = new Scanner(new File(fileName));
            PrintWriter writer = new PrintWriter(new File(tempFileName)))
        {
            scanner.useDelimiter("\\.");
            while (scanner.hasNext())
            {
                String line = scanner.next().replaceAll("\n", "")
                        .replaceAll("\r", "").trim();
                writer.write(line + "\n");
            }

        } catch (FileNotFoundException ignored) {}

        copyTo(tempFileName, fileName);
    }


    public static String createTempFile()
    {
        int x = 0;
        String fileName = "Temp0.txt";
        File file = new File(fileName);
        while (file.exists())
        {
            x++;
            fileName = "Temp" + x + ".txt";
            file = new File(fileName);
        }

        try
        {
            file.createNewFile();
        }
        catch (IOException ignored)
        {
            createTempFile();
        }
        return fileName;
    }


    public static void copyTo(String tempName, String originalName)
    {
        File originalFile = new File(originalName);
        File tempFile = new File(tempName);


        try (Scanner scanner = new Scanner(tempFile);
             PrintWriter writer = new PrintWriter(originalFile))
        {
            while (scanner.hasNext())
                writer.write(scanner.nextLine() + "\n");

        } catch (FileNotFoundException ignored) {}

        tempFile.delete();
    }
}
