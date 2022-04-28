package chapter_sixteen;

public class Name
{
    private String name;
    private int girlsCount, boysCount;

    public Name(String name, int girlsCount, int boysCount)
    {
        this.name = name;
        this.girlsCount = girlsCount;
        this.boysCount = boysCount;
    }

    @Override
    public String toString()
    {
        return "Name{" +
                "name='" + name + '\'' +
                ", girlsCount=" + girlsCount +
                ", boysCount=" + boysCount +
                '}';
    }
}
