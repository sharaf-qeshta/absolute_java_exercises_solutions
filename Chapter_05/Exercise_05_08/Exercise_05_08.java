package chapter_five;

/**
 * 8. Programming Project 4.12 asked you to create a PizzaOrder class that stores an
 * order consisting of up to three pizzas. Extend this class with the following methods
 * and constructor:
 *  • public int getNumPizzas()—returns the number of pizzas in the order.
 *  • public Pizza getPizza1()—returns the first pizza in the order or null if
 * pizza1 is not set.
 *  •	 public Pizza getPizza2()—returns the second pizza in the order or null
 * if pizza2 is not set.
 *  • public Pizza getPizza3()—returns the third pizza in the order or null if
 * pizza3 is not set.
 * • A copy constructor that takes another PizzaOrder object and makes an
 * independent copy of its pizzas. This might be useful if using an old order as a
 * starting point for a new order.
 *  Write a main method to test the new methods. Changing the pizzas in the new
 * order should not change the pizzas in the original order. For example,
 *  Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham
 *  Pizza pizza2 = // Code to create a medium pizza, 2 cheese,
 *  // 2 pepperoni
 *  PizzaOrder order1 = // Code to create an order
 *  order1.setNumPizzas(2); // 2 pizzas in the order
 *  order1.setPizza1(pizza1); // Set first pizza
 *  order1.setPizza2(pizza2); // Set second pizza
 *  double total = order1.calcTotal(); // Should be 18+20 = 38
 *  PizzaOrder order2 = new PizzaOrder(order1); // Use copy
 *  // constructor
 *  order2.getPizza1().setNumCheeseToppings(3); // Change toppings
 *  double total = order2.calcTotal(); // Should be 22 + 20 = 42
 *  double origTotal = order1.calcTotal(); // Should still be 38
 *  Note that the first three lines of code are incomplete. You must complete them as
 * part of the Programming Project.
 *
 * @author Sharaf Qeshta*/

public class Exercise_05_08
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("Large", 1, 0, 1); // Code to create a
        // large pizza, 1 cheese, 1 ham

        Pizza pizza2 = new Pizza("Medium", 2, 2, 0); // Code to create
        // a medium pizza, 2 cheese, 2 pepperoni

        PizzaOrder order1 = new PizzaOrder(); // Code to create an order
        order1.setNumPizzas(2); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza
        order1.setPizza2(pizza2); // Set second pizza

        double total = order1.calcTotal(); // Should be 18+20 = 38
        System.out.println(total); // 38.0

        PizzaOrder order2 = new PizzaOrder(order1); // Use copy constructor
        order2.getPizza1().setCheeseToppings(3); // Change toppings

        total = order2.calcTotal(); // Should be 22 + 20 = 42
        double origTotal = order1.calcTotal(); // Should still be 38

        System.out.println(total); // 42
        System.out.println(origTotal); // 38.0



    }
}
