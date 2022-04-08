package chapter_seven;

public class Vegetable extends Produce
{
    public Vegetable(String name)
    {
        super(name);
    }


    public String toString()
    {
        return super.toString() + ", Type: Vegetable";
    }
}
