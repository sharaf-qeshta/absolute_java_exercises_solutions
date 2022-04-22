package chapter_fifteen;

import java.util.Deque;
import java.util.LinkedList;

public class IntegerStack extends LinkedList<Integer> implements Deque<Integer>
{
    @Override
    public Integer removeLast()
    {
        return remove(size()-1);
    }

    @Override
    public void addLast(Integer integer)
    {
        add(size(), integer);
    }
}
