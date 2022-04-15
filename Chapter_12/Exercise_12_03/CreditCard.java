package chapter_twelve;

public class CreditCard extends Payment
{
    private String expiration, name, number;

    public CreditCard(double amount, String expiration,
                      String name, String number)
    {
        super(amount);
        this.expiration = expiration;
        this.name = name;
        this.number = number;
    }


    public String getExpiration()
    {
        return expiration;
    }

    public void setExpiration(String expiration)
    {
        this.expiration = expiration;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String toString()
    {
        return super.toString() + ", Method: Credit Card, Expiration: "
                + expiration + ", Name: " + name + ", Number: " + number;
    }
}
