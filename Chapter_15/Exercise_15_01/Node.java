package chapter_fifteen;

public class Node<E>
{
    private E value;
    private int nextIndex;

    public Node(E value, int nextIndex)
    {
        this.value = value;
        this.nextIndex = nextIndex;
    }


    public E getValue()
    {
        return value;
    }

    public void setValue(E value)
    {
        this.value = value;
    }

    public int getNextIndex()
    {
        return nextIndex;
    }

    public void setNextIndex(int nextIndex)
    {
        this.nextIndex = nextIndex;
    }
}
