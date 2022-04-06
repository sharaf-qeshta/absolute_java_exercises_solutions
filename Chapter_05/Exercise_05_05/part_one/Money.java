package chapter_five;

public class Money
{
    int dollars;
    int cents;

    public Money(int dollars, int cents)
    {
        setDollars(dollars);
        setCents(cents);
    }

    public Money(int dollars)
    {
        setDollars(dollars);
        setCents(0);
    }

    public Money()
    {
        setDollars(0);
        setCents(0);
    }

    public static Money add(Money m1, Money m2)
    {
        return new Money(m1.getDollars() + m2.getDollars(),
                m1.getCents() + m2.getCents());
    }

    public static Money subtract(Money m1, Money m2)
    {
        return new Money(m1.getDollars() - m2.getDollars(),
                m1.getCents() - m2.getCents());
    }

    public int getDollars()
    {
        return dollars;
    }

    public void setDollars(int dollars)
    {
        this.dollars = Math.max(dollars, 0);
    }

    public int getCents()
    {
        return cents;
    }

    public void setCents(int cents)
    {
        setDollars(getDollars() + (cents / 100));
        this.cents = Math.max(cents % 100, 0);
    }

    public String toString()
    {
        return "Dollars: $" + getDollars() + ", Cents: " + getCents();
    }

    public boolean equals(Money money)
    {
        return getDollars() == money.getDollars() && getCents() == money.getCents();
    }
}
