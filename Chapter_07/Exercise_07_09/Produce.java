package chapter_seven;

public class Produce
{
    private String name;


    public Produce(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Produce Name: " + name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
