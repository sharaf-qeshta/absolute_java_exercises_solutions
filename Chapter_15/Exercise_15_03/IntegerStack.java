package chapter_fifteen;

import java.util.LinkedList;

public class IntegerStack extends LinkedList<Integer>
{
    public void push(int value)
    {
        add(0, value);
    }

    public Integer pop()
    {
        return remove(0);
    }
}
