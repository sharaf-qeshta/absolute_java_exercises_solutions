package chapter_eleven;

import java.io.File;

/**
 * 9. The program to recursively find a file in Display 11.11 stops searching when the
 * first match is found. Modify the program so that if there are multiple files with the
 * same name in different directories, then all matching files are found and output.
 * The simplest way to do this is to output all matches in the recursive method with
 * a print statement. For a more challenging version, modify the method to return
 * an array of Strings containing the pathnames of all matching files. It can return
 * null or an empty array if there are no matches. Feel free to create additional helper
 * classes if needed (e.g., to manage the number of items in the array of Strings). In
 * Chapter 14, we will introduce ArrayLists, which make it easier to create an
 * arraylike structure with an arbitrary number of entries.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_11_09
{
    private static int index = 0;
    private static String[] result = new String[1000];
    public static void main(String[] args)
    {
        searchForFile(new File("src/chapter_eleven/directory"), "file2.txt");
        /*
        * src/chapter_eleven/directory/file2.txt
        * src/chapter_eleven/directory/nested_directory/file2.txt
        * */
        printResult();
    }

    public static String[] searchForFile(File dir, String target)
    {
        // If dir is not a directory, return
        if (!dir.isDirectory())
            return null;

        // Check each item in the directory
        for (File folderItem : dir.listFiles())
        {
            // Recurse if it's a directory
            if (folderItem.isDirectory())
                searchForFile(folderItem, target);
            // If it's a file, check for a match
            else
            {
                if (folderItem.getName().equals(target))
                {
                    result[index++] = folderItem.getAbsolutePath();
                    if (index > result.length-1)
                    {
                        String[] temp = new String[result.length*2];
                        for (int i = 0; i < result.length; i++)
                            temp[i] = result[i];
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    public static void printResult()
    {
        for (int i = 0; i < result.length && result[i] != null; i++)
            System.out.println(result[i]);
    }
}
