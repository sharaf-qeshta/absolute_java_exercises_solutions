package chapter_fifteen;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * the worst case for searching is O(37) and the best case is O(1)
 * this is the faster searching algorithm i encounter so far*/
public class HashTable
{
    private final LinkedList<String>[] hashArray;
    private static final int SIZE = 10000; // for faster searching

    public HashTable( )
    {
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
    }

    private int computeHash(String word)
    {
        int hash = 0;
        for (int i = 0; i < word.length( ); i++)
        {
            hash += word.charAt(i);
        }
        return hash % SIZE;
    }

    /**
        Returns true if the target is in the hash table,
        false if it is not.
    */
    public boolean contains(String word)
    {
        int hash = computeHash(word);
        LinkedList<String> list = hashArray[hash];
        return list.contains(word);
    }

    /**
    Stores or puts string s into the hash table
    */
    public void put(String word)
    {
        int hash = computeHash(word);// Get hash value
        LinkedList<String> list = hashArray[hash];
        if (!list.contains(word))
        {
            // Only add the target if it's not already
            // on the list.
            hashArray[hash].add(word);
        }
    }

    public LinkedList<String> get(String name)
    {
        int hash = computeHash(name);
        try
        {
            return hashArray[hash];
        }
        catch (Exception exception)
        {
            return null;
        }
    }

    public static HashTable getInstance(String fileName)
    {
        HashTable hashTable = new HashTable();
        try (Scanner scanner = new Scanner(new File(fileName)))
        {
            while (scanner.hasNext())
                hashTable.put(scanner.nextLine().trim());
        }
        catch (IOException exception)
        {
            System.out.println("File Not Exist!!");
        }
        return hashTable;
    }
}

