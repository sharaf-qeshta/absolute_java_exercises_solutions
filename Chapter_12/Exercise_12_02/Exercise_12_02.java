package chapter_twelve;


/**
 * 2. The following UML diagram shows the relationship between a class called
 * PizzaOrder and a class called Pizza:
 * PizzaOrder
 * Pizza
 * 1
 * -Pizza[MAXPIZZAS]
 * -numPizzas: int
 * +addPizzaToOrder(in char size, in boolean pepperoni, in boolean sausage, in boolean mushrooms)
 * +calcCost( ): double
 * -pepperoni: boolean
 * -sausage: boolean
 * -mushrooms: boolean
 * -size: boolean
 * +Pizza(in char size, in boolean pepperoni, in boolean sausage, in boolean mushrooms)
 * +getSize( ): char
 * +getNumToppings( ): int
 *
 * The word “in” means the parameter is used to deliver data to the method.
 *  The Pizza class contains information about a specific pizza. The variables of
 * pepperoni, sausage, and mushrooms are booleans that indicate whether or not
 * these toppings are present on the pizza. The size variable is a character of value 's',
 * 'm', or 'l' to indicate small, medium, or large. There is also a Pizza constructor
 * that initializes all of these values. The getSize() method returns the size of the
 * pizza and the getNumToppings() method returns a number from 0–3 depending
 * on what toppings are present (e.g., if the pizza has pepperoni and mushrooms, it
 * would be 2).
 *  The PizzaOrder class contains an array of Pizza’s. There is a method to add a
 * new pizza to the array (which increments numPizzas) and also a method to
 * calculate the cost of the entire order. A small pizza costs $8, a medium pizza is $10, and
 * a large pizza costs $12. Each topping adds $1 to the pizza.
 *  The arrow connecting PizzaOrder to Pizza indicates that the PizzaOrder class
 * has a reference to the Pizza class, but not vice versa. The solid diamond on the
 * PizzaOrder class is a UML construct that indicates that the PizzaOrder class has
 * a collection of the Pizza class. There may be many (*) Pizza’s for a single (one)
 * PizzaOrder.
 *  Given this information, write Java code that implements the Pizza and
 * PizzaOrder classes. Also, write a test main function that creates a pizza order, adds
 * several pizzas to it, and outputs the cost of the order
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_12_02
{
    public static void main(String[] args)
    {
        PizzaOrder order = new PizzaOrder();
        order.addPizzaToOrder('m', true, true, true); // cost 13
        order.addPizzaToOrder('l', true, false, true); // cost 14
        order.addPizzaToOrder('s', false, false, false); // cost 8

        System.out.println(order.calcCost()); // 35.0
    }
}
