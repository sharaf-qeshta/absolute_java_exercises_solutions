package chapter_fifteen;

import java.util.LinkedList;

public class Set<T>
{
    private static int SIZE = 100;
    private final LinkedList<T>[] hashArray;

    public Set()
    {
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
    }

    public Set(int size)
    {
        SIZE = size;
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
    }

    private int computeHash(T element)
    {
        // since all Classes extends Object hashCode()
        // will return int value
        return Math.abs(element.hashCode()) % SIZE;
    }

    public boolean contains(T element)
    {
        int hash = computeHash(element);
        return hashArray[hash].contains(element);
    }

    public void add(T element)
    {
        int hash = computeHash(element);// Get hash value
        if (!hashArray[hash].contains(element))
        {
            // Only add the target if it's not already
            // on the list.
            hashArray[hash].add(element);
        }
    }

    public LinkedList<T> get(T element)
    {
        int hash = computeHash(element);
        try
        {
            return hashArray[hash];
        }
        catch (Exception exception)
        {
            return null;
        }
    }


    public boolean remove(T element)
    {
        int hash = computeHash(element);
        return hashArray[hash].remove(element);
    }

    public Set<T> union(Set<T> otherSet)
    {
        Set<T> unionSet = new Set<T>( );
        // Copy this set to unionSet.
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
                unionSet.add(element);
        }

        // Copy otherSet set to unionSet.
        for (LinkedList<T> list: otherSet.hashArray)
        {
            for (T element: list)
                unionSet.add(element);
        }
        return unionSet;
    }

    public Set<T> intersection(Set<T> otherSet)
    {
        Set<T> interSet = new Set<T>( );
        // Copy only items in both sets.
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
            {
                if (otherSet.contains(element))
                    interSet.add(element);
            }
        }
        return interSet;
    }

    public Set<T> difference(Set<T> otherSet)
    {
        Set<T> differSet = new Set<T>( );
        // Copy only items in 'this' set.
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
            {
                if (!otherSet.contains(element))
                    differSet.add(element);
            }
        }
        return differSet;
    }

    public void output()
    {
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
                System.out.print(element + " ");
        }
        System.out.println();
    }
}
