package chapter_fourteen;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 8. In Programming Project 11.9, you were asked to implement a recursive algorithm
 * to find all files that matched a target file name. Redo this Programming Project
 * where the recursive method returns an ArrayList of String objects. Each string
 * should store the pathname to the matching file. Return null if no matching files
 * are found.
 *
 * @author Sharaf Qeshta */


public class Exercise_14_08
{
    private static final ArrayList<String> result = new ArrayList<>();
    public static void main(String[] args)
    {
        searchForFile(new File("src/chapter_fourteen/directory"), "file2.txt");
        /*
         * src/chapter_eleven/directory/file2.txt
         * src/chapter_eleven/directory/nested_directory/file2.txt
         * */
        printResult();
    }

    public static ArrayList<String> searchForFile(File dir, String target)
    {
        // If dir is not a directory, return
        if (!dir.isDirectory())
            return null;

        // Check each item in the directory
        for (File folderItem : Objects.requireNonNull(dir.listFiles()))
        {
            // Recurse if it's a directory
            if (folderItem.isDirectory())
                searchForFile(folderItem, target);
                // If it's a file, check for a match
            else
            {
                if (folderItem.getName().equals(target))
                    result.add(folderItem.getAbsolutePath());
            }
        }
        // If we got here, nothing was found
        return result;
    }


    public static void printResult()
    {
        for (String path: result)
            System.out.println(path);
    }
}
