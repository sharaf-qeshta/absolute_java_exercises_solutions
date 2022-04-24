package chapter_fifteen;

public class LinkedList2
{
    private class Node
    {
        private Employee item;
        private Node link;

        public Node( )
        {
            item = null;
            link = null;
        }

        public Node(Employee newItem, Node linkValue)
        {
            item = newItem;
            link = linkValue;
        }
    }//End of Node inner class

    private Node head;
    public LinkedList2( )
    {
        head = null;
    }

    /**
        Adds a node at the start of the list with the specified data.
        The added node will be the first node in the list.
    */
    public void addToStart(Employee itemName)
    {
        head = new Node(itemName, head);
    }

    /**
        Removes the head node and returns true if the list contains at
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
        Returns the number of nodes in the list.
    */
    public int size( )
    {
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(Employee employee)
    {
        return (find(employee) != null);
    }

    /**
        Finds the first node containing the target item, and returns a
        reference to that node. If target is not in the list, null is
        returned.
    */

    private Node find(Employee target)
    {
        Node position = head;
        Employee itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.item;
            if (itemAtPosition.getName().equals(target.getName()))
                return position;
            position = position.link;
        }
    return null; //target was not found
    }

    public void outputList( )
    {
        Node position = head;
        while (position != null)
        {
            System.out.println(position.item);
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
}

