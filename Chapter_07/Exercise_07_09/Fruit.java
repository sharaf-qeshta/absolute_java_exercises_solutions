package chapter_seven;

public class Fruit extends Produce
{

    public Fruit(String name)
    {
        super(name);
    }


    public String toString()
    {
        return super.toString() + ", Type: Fruit";
    }
}
