package chapter_six;

public class Pizza
{
    private int size; // 0:small, 1:medium, 2:large (to simplify comparison)
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        setSize(size);
        setCheeseToppings(cheeseToppings);
        setHamToppings(hamToppings);
        setPepperoniToppings(pepperoniToppings);
    }

    public int getSizeNumber(String size)
    {
        if (size.equals("Small"))
            return  0;
        else if (size.equals("Medium"))
            return  1;
        else if (size.equals("Large"))
            return  2;
        else
            return -1;
    }

    public String getSizeString(int size)
    {
        if (size == 0)
            return "Small";
        if (size == 1)
            return "Medium";
        if (size == 2)
            return "Large";
        else
            return "Error"; // to make the compiler happy
    }

    public void setSize(String size)
    {
        this.size = getSizeNumber(size);
    }

    public void setCheeseToppings(int cheeseToppings)
    {
        if (cheeseToppings >= 0)
            this.cheeseToppings = cheeseToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings)
    {
        if (pepperoniToppings >= 0)
            this.pepperoniToppings = pepperoniToppings;
    }

    public void setHamToppings(int hamToppings)
    {
        if (hamToppings >= 0)
            this.hamToppings = hamToppings;
    }

    public double calcCost()
    {
        int toppings = cheeseToppings + pepperoniToppings + hamToppings;

        if (size == 0)
            return 10 + toppings * 2;
        if (size == 1)
            return 12 + toppings * 2;
        if (size == 2)
            return 14 + toppings * 2;
        else
            return -1; // to make the compiler happy

    }

    public String getDescription()
    {
        return "Pizza Size: " + getSizeString(size) + ", Cheese Toppings: " + cheeseToppings
                + ", Pepperoni Toppings: " + pepperoniToppings + ", Ham Toppings: " + hamToppings
                + ", Cost: $" + calcCost();
    }
}
