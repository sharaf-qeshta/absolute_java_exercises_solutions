package chapter_four;

public class PizzaOrder
{
    private Pizza pizza1, pizza2, pizza3;
    private int numPizzas;

    public PizzaOrder(Pizza pizza1, Pizza pizza2,
                      Pizza pizza3, int numPizzas)
    {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
        setNumPizzas(numPizzas);
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3)
    {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

    public PizzaOrder()
    {
    }

    public PizzaOrder(int numPizzas)
    {
        setNumPizzas(numPizzas);
    }

    public void setPizza1(Pizza pizza1)
    {
        if (numPizzas >= 1)
            this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2)
    {
        if (numPizzas >= 2)
            this.pizza2 = pizza2;
    }

    public void setPizza3(Pizza pizza3)
    {
        if (numPizzas == 3)
            this.pizza3 = pizza3;
    }

    public void setNumPizzas(int numPizzas)
    {
        if (numPizzas > 0 && numPizzas < 4)
            this.numPizzas = numPizzas;
        else
        {
            System.out.println("Error: numPizzas should be between 1-3");
            System.exit(0);
        }
    }

    public double calcTotal()
    {
        double total = 0;
        if (pizza1 != null)
            total += pizza1.calcCost();
        if (pizza2 != null)
            total += pizza2.calcCost();
        if (pizza3 != null)
            total += pizza3.calcCost();
        return total;
    }
}
