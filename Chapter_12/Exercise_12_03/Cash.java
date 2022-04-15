package chapter_twelve;

public class Cash extends Payment
{
    public Cash(double amount)
    {
        super(amount);
    }

    public String toString()
    {
        return super.toString() + ", Method: Cash";
    }
}
