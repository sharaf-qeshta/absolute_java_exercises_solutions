package chapter_fifteen;

import java.util.ArrayList;

public class CircularLinkedList<E>
{
    private final ArrayList<Node<E>> list = new ArrayList<>();

    public CircularLinkedList(){}


    public void add(E element)
    {
        if (list.size() > 0)
            list.get(list.size()-1).setNextIndex(list.size());
        list.add(new Node<>(element, 0));
    }


    public ArrayList<Node<E>> getList()
    {
        return list;
    }

    public void remove(int index)
    {
        for (int i = index+1; i < list.size()-1; i++)
        {
            list.get(i).setNextIndex(list.get(i).getNextIndex()-1);
        }
        list.remove(index);
        list.get(list.size()-1).setNextIndex(0);
    }

}
