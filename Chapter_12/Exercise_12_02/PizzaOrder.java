package chapter_twelve;

public class PizzaOrder
{
    private int numPizzas = 3;
    private Pizza[] pizzas = new Pizza[numPizzas];
    private int index = 0;

    public void addPizzaToOrder(char size,  boolean pepperoni,
                                boolean sausage, boolean mushrooms)
    {
        if (index+1 >= numPizzas)
        {
            numPizzas *= 2;
            Pizza[] temp = new Pizza[numPizzas];
            for (int i = 0; i < pizzas.length; i++)
                temp[i] = pizzas[i];
            pizzas = temp;
        }
        pizzas[index++] = new Pizza(pepperoni, sausage, mushrooms, size);
    }


    public double calcCost()
    {
        double totalCost = 0;
        for (int i = 0; i < pizzas.length
                && pizzas[i] != null; i++)
            totalCost += pizzas[i].getNumToppings()
                    + ((pizzas[i].getSize() == 's')?  8 : 0)
                    + ((pizzas[i].getSize() == 'm')?  10 : 0)
                    + ((pizzas[i].getSize() == 'l')?  12 : 0);
        return totalCost;
    }
}
