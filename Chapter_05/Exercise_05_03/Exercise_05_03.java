package chapter_five;

/**
 * 3. Create a class to represent a container. The class Container should have the following properties.
 *  a. Maximum capacity of the container in liters.
 *  b. Quantity of liquid at any given time in liters.
 *  The following operations can be performed on the containers:
 *  a. Completely fill a container.
 *  b. Completely empty a container.
 *  c. Transfer liquid from one container to another.
 *  Define the class named Container that implements the properties and operations
 * defined above. Create a constructor of the Container class that allows the user to
 * specify the maximum capacity of the container in liters. Initially, assume that all
 * the containers are empty.
 * Also, implement the following methods in the Container class.
 *  a. Quantity to return the current quantity of liquid at any given time in liters.
 *  b. Leftover to return the quantity of liquid that can be filled in the current container before it is full.
 *  c. Full to fill the current container fully.
 *  d. Empty to make the container completely empty.
 *  e. Transfer to transfer a certain amount of liquid from one container to another.
 *  f. displayQuantity to display the current quantity in liters/ milliliters/ kiloliters.
 *  Note: While transferring liquid from one container to another, check the maximum capacity of the container.
 *  Also, include other supporting variables or methods wherever necessary.
 *
 *  @author Sharaf Qeshta*/

public class Exercise_05_03
{
    public static void main(String[] args)
    {
        Container container = new Container(100);
        Container container2 = new Container(20);
        container2.completelyFill();

        container.add(10);
        container.transfer(container2);

        System.out.println(container.equals(container2)); // false
        container.displayContainer(); // The Container Contains 30.0 Liters
        container2.displayContainer(); // The Container Contains 0.0 Liters
    }
}
