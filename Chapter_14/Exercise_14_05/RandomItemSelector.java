package chapter_fourteen;

import java.util.ArrayList;

public class RandomItemSelector<E>
{
    private final ArrayList<E> items = new ArrayList<>();

    public void add(E object)
    {
        items.add(object);
    }

    public boolean isEmpty()
    {
        return items.size() == 0;
    }

    public E drawItem()
    {
        return (isEmpty())? null : items.get((int) ((Math.random() * 10 * items.size()) % items.size()));
    }
}
