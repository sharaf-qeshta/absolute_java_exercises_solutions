package chapter_fifteen;

import java.util.ArrayList;

public class LinkedList3<T extends Comparable<T>>
{
    private class Node<T extends Comparable<T>>
    {
        private T data;
        private Node<T> link;

        public Node( )
        {
            data = null;
            link = null;
        }

        public Node (T newData, Node<T> linkValue)
        {
            data = newData;
            link = linkValue;
        }

        public Node<T> clone()
        {
            return new Node<>(data, (link == null)? null:  link.clone());
        }

    }  //End of Node<T> inner class

    private Node<T> head;

    public LinkedList3( )
    {
        head = null;
    }

    /**
    Adds a node at the start of the list with the specified data.
    The added node will be the first node in the list.
    */
    public void addToStart(T itemData)
    {
        head = new Node<T> (itemData, head);
    }

    public void addSorted(T itemData)
    {
        addToStart(itemData);
        ArrayList<Node<T>> list = getItems();
        head = null;
        sort(list);
        for (Node<T> node: list)
            addToStart(node.data);
    }

    public void sort(ArrayList<Node<T>> list)
    {
        boolean needNextIteration = true;
        while (needNextIteration)
        {
            needNextIteration = false;
            for (int i = 0; i < list.size()-1; i++)
            {
                if (list.get(i).data.compareTo(list.get(i+1).data) > 0)
                {
                    // interchange
                    Node<T> temp = list.get(i).clone();
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    needNextIteration = true;
                }
            }
        }
    }

    public ArrayList<Node<T>> getItems()
    {
        Node<T> position = head;
        ArrayList<Node<T>> list = new ArrayList<>();
        while (position != null)
        {
            list.add(position);
            position = position.link;
        }
        return list; //target was not found
    }

    /** Removes the head node and returns true if the list contains at
    least one node. Returns false if the list is empty.
    */
    public boolean deleteHeadNode( )
    {
        if (head != null)
        {
            head = head.link;
            return true;
        }
        else
            return false;
    }

    /**
     * Returns the number of nodes in the list.
     * */
    public int size( )
    {
        int count = 0;
        Node<T> position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(T item)
    {
        return (find(item) != null);
    }

    /**
        Finds the first node containing the target item, and returns a
        reference to that node. If target is not in the list, null is
        returned.
    */
    private Node find(T target)
    {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target))
                return position;
            position = position.link;
        }
        return null; //target was not found
    }

    /**
        Finds the first node containing the target and returns a reference
        to the data in that node. If target is not in the list, null is
        returned.
    */
    public T findData(T target)
    {
        Node<T> result = find(target);
        if (result == null)
            return null;
        else
        return result.data;
    }

    public void outputList( )
    {
        Node<T> position = head;
        while (position != null)
        {
            System.out.println(position.data);
            position = position.link;
        }
    }

    public boolean isEmpty( )
    {
        return (head == null);
    }

    public void clear( )
    {
        head = null;
    }
    /**
    For two lists to be equal they must contain the same data items in
    the same order. The equals method of T is used to compare data
     items.
    */
    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            LinkedList3<T> otherList = (LinkedList3<T>)otherObject;
            if (size( )!= otherList.size( ))
                return false;
            Node<T> position = head;
            Node<T> otherPosition = otherList.head;
            while (position != null)
            {
                if (!(position.data.equals(otherPosition.data)))
                    return false;
                position = position.link;
                otherPosition = otherPosition.link;
            }
        return true; //no mismatch was not found
        }
    }
}

