package chapter_six;

import java.util.Arrays;

public class PizzaOrder
{
    private Pizza[] pizzas = new Pizza[3]; // default
    private int numPizzas;


    public PizzaOrder(Pizza[] pizzas)
    {
        this.pizzas = pizzas;
        setNumPizzas(pizzas.length);
    }

    public PizzaOrder() {}

    public PizzaOrder(int numPizzas)
    {
        setNumPizzas(numPizzas);
    }

    public void setPizza(Pizza pizza, int index)
    {
        if (index < pizzas.length && index > -1)
            pizzas[index] = pizza;
    }


    public void setNumPizzas(int numPizzas)
    {
        if (numPizzas > 0)
        {
            this.numPizzas = numPizzas;
            Pizza[] temp = new Pizza[this.numPizzas];

            for (int i = 0; i < temp.length && i < pizzas.length; i++)
                temp[i] = pizzas[i];
            pizzas = temp;
        }
    }

    public double calcTotal()
    {
        double total = 0;
        for (int i = 0; i < pizzas.length; i++)
            total += pizzas[i].calcCost();
        return total;
    }
}
