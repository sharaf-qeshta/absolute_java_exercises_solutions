package chapter_six;


/**
 * 15. Programming Project 4.12 asked you to create a PizzaOrder class that stores an
 * order consisting of up to three pizzas. Modify the class to store the pizzas using an
 * array. This will allow the class to include an arbitrary number of pizzas in the order
 * instead of a maximum of three. The setNumPizzas method can be used to create
 * an array of the appropriate size. The array structure allows you to eliminate the
 * methods setPizza1, setPizza2, and setPizza3 and replace them with a single
 * method, setPizza(int index, Pizza newPizza). Include appropriate tests to
 * determine if the new PizzaOrder class is working correctly.
 *
 * @author Sharaf Qeshta */



public class Exercise_06_15
{

    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("Small", 5, 4, 0);
        Pizza pizza2 = new Pizza("Large", 4, 2, 0);
        Pizza pizza3 = new Pizza("Small", 0, 1, 3);
        Pizza pizza4 = new Pizza("Medium", 2, 3, 1);
        Pizza pizza5 = new Pizza("Large", 4, 0, 0);
        Pizza pizza6 = new Pizza("Medium", 0, 6, 0);

        PizzaOrder pizzaOrder = new PizzaOrder(6);

        pizzaOrder.setPizza(pizza1, 0);
        pizzaOrder.setPizza(pizza2, 1);
        pizzaOrder.setPizza(pizza3, 2);
        pizzaOrder.setPizza(pizza4, 3);
        pizzaOrder.setPizza(pizza5, 4);
        pizzaOrder.setPizza(pizza6, 5);

        System.out.println(pizzaOrder.calcTotal());

        pizzaOrder.setNumPizzas(7); // 142.0

        Pizza pizza7 = new Pizza("Medium", 2, 3, 2);
        pizzaOrder.setPizza(pizza7, 6);

        System.out.println(pizzaOrder.calcTotal()); // 168.0


    }


}
