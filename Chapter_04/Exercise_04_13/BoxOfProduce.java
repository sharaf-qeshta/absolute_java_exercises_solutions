package chapter_four;

public class BoxOfProduce
{
    private String bundle1, bundle2, bundle3;

    public BoxOfProduce(String bundle1, String bundle2,
                        String bundle3)
    {
        this.bundle1 = bundle1;
        this.bundle2 = bundle2;
        this.bundle3 = bundle3;
    }

    public BoxOfProduce() {
    }

    public String getBundle1()
    {
        return bundle1;
    }

    public String getBundle2()
    {
        return bundle2;
    }

    public String getBundle3()
    {
        return bundle3;
    }


    public void setBundle1(String bundle1)
    {
        this.bundle1 = bundle1;
    }

    public void setBundle2(String bundle2)
    {
        this.bundle2 = bundle2;
    }

    public void setBundle3(String bundle3)
    {
        this.bundle3 = bundle3;
    }

    public String toString()
    {
        return "Item1: " + bundle1 + ", Item2: " + bundle2 + ", Item3: " + bundle3;
    }
}
