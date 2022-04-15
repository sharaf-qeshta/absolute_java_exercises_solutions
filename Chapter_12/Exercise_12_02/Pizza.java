package chapter_twelve;

public class Pizza
{
    private boolean pepperoni, sausage, mushrooms;
    private char size;

    public Pizza(boolean pepperoni, boolean sausage,
                 boolean mushrooms, char size)
    {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.size = size;
    }

    public char getSize()
    {
        return size;
    }

    public int getNumToppings()
    {
        return ((pepperoni)? 1 : 0) + ((sausage)? 1 : 0) + ((mushrooms)? 1 : 0);
    }
}
