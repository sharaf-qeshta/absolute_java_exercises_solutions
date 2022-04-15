package chapter_twelve;

public abstract class Payment
{
    protected double amount;

    public Payment(double amount)
    {
        this.amount = amount;
    }

    public String toString()
    {
        return "Amount: $" + amount;
    }
}
