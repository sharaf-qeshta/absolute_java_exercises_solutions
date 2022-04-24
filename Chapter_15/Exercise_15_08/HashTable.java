package chapter_fifteen;

import java.util.LinkedList;

public class HashTable
{
    // Uses the generic LinkedList2 class from Display 15.7
    private LinkedList2[] hashArray;
    private static final int SIZE = 10;

    public HashTable( )
    {
        hashArray = new LinkedList2[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList2( );
    }

    private int computeHash(String employee)
    {
        int hash = 0;
        for (int i = 0; i < employee.length( ); i++)
        {
            hash += employee.charAt(i);
        }
        return hash % SIZE;
    }

    /**
        Returns true if the target is in the hash table,
        false if it is not.
    */
    public boolean containsEmployee(Employee target)
    {
        int hash = computeHash(target.getName());
        LinkedList2 list = hashArray[hash];
        if (list.contains(target))
            return true;
        return false;
    }

    /**
    Stores or puts string s into the hash table
    */
    public void put(Employee employee)
    {
        int hash = computeHash(employee.getName());// Get hash value
        LinkedList2 list = hashArray[hash];
        if (!list.contains(employee))
        {
            // Only add the target if it's not already
            // on the list.
            hashArray[hash].addToStart(employee);
        }
    }

    public LinkedList2 get(String name)
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
} // End HashTable class

