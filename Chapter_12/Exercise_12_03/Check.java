package chapter_twelve;

public class Check extends Payment
{
    private String routingNumber;
    private String name;

    public Check(double amount,
                 String routingNumber, String name)
    {
        super(amount);
        this.routingNumber = routingNumber;
        this.name = name;
    }

    public String getRoutingNumber()
    {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber)
    {
        this.routingNumber = routingNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return super.toString() + ", Method: Check, Routing Number: "
                + routingNumber + ", Name: " + name;
    }
}
