package chapter_fifteen;

import java.util.LinkedList;

public class Set<T>
{
    private static int SIZE = 100;
    private final LinkedList<T>[] hashArray;
    private Node<T> head;

    private static class Node<T>
    {
        private T data;
        private Node<T> link;
        public Node( )
        {
            data = null;
            link = null;
        }

        public Node(T newData, Node<T> linkValue)
        {
            data = newData;
            link = linkValue;
        }
    }//End of Node<T> inner class

    public Set()
    {
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
        head = null;
    }

    public Set(int size)
    {
        SIZE = size;
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
        head = null;
    }

    /** for hash table */
    private int computeHash(T element)
    {
        // since all Classes extends Object hashCode()
        // will return int value
        return Math.abs(element.hashCode()) % SIZE;
    }

    /** searching is better using hash table */
    public boolean contains(T element)
    {
        int hash = computeHash(element);
        return hashArray[hash].contains(element);
    }

    /** add to both hash table and linked list */
    public void add(T element)
    {
        int hash = computeHash(element);// Get hash value
        if (!hashArray[hash].contains(element))
        {
            // Only add the target if it's not already
            // on the list.
            head = new Node<>(element, head);
            hashArray[hash].add(element);
        }
    }

    /** remove from both data structures */
    public boolean remove(T element)
    {
        if (contains(element))
        {
            int hash = computeHash(element);
            hashArray[hash].remove(element);

            Set<T> temp = new Set<>();
            temp.add(element);
            head = difference(temp).head;
            return true;
        }
        return false;
    }

    public Set<T> union(Set<T> otherSet)
    {
        Set<T> unionSet = new Set<T>( );
        // Copy this set to unionSet.
        Node<T> position = head;
        while (position != null)
        {
            unionSet.add(position.data);
            position = position.link;
        }

        // Copy otherSet items to unionSet.
        // The add method eliminates any duplicates.
        position = otherSet.head;
        while (position != null)
        {
            unionSet.add(position.data);
            position = position.link;
        }
        return unionSet;
    }

    public Set<T> intersection(Set<T> otherSet)
    {
        Set<T> interSet = new Set<T>( );
        // Copy only items in both sets.
        Node<T> position = head;
        while (position != null)
        {
            if (otherSet.contains(position.data))
                interSet.add(position.data);
            position = position.link;
        }
        return interSet;
    }

    public Set<T> difference(Set<T> otherSet)
    {
        Set<T> differSet = new Set<T>( );
        // Copy only items in the first set.
        Node<T> position = head;
        while (position != null)
        {
            if (!otherSet.contains(position.data))
                differSet.add(position.data);
            position = position.link;
        }
        return differSet;
    }

    /**
     * when you need to loop through the elements
     * use linked list */
    public void output()
    {
        Node<T> position = head;
        while (position != null)
        {
            System.out.print(position.data.toString( ) + " ");
            position = position.link;
        }
        System.out.println( );
    }
}
