package chapter_seven;

/**
 * 6. Create a class called Vehicle that has the manufacturer’s name (type String),
 * number of cylinders in the engine (type int), and owner (type Person given
 * next). Then, create a class called Truck that is derived from Vehicle and has the
 * following additional properties: the load capacity in tons (type double since it may
 * contain a fractional part) and towing capacity in pounds (type int). Be sure your
 * class has a reasonable complement of constructors, accessor and mutator methods,
 * and suitably defined equals and toString methods. Write a program to test all
 * your methods.
 *  The definition of the class Person follows. Completing the definitions of the
 * methods is part of this programming project.
 * public class Person
 * {
 *  private String name;
 *  public Person()
 *  {...}
 *  public Person(String theName)
 *  {...}
 *  public Person(Person theObject)
 *  {...}
 *  public String getName()
 *  {...}
 *  public void setName(String theName)
 *  {...}
 *  public String toString()
 *  {...}
 *  public boolean equals(Object other)
 *  {...}
 * }
 *
 * @author Sharaf Qeshta */


public class Exercise_07_06
{
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Vehicle("Mercedes", 800,
                new Person("Sharaf Qeshta"));
        Vehicle vehicle2 = new Vehicle("Nissan", 750,
                new Person("John Smith"));

        Truck truck1 = new Truck("Vovlo", 430,
                new Person(), 12.5, 500);
        Truck truck2 = new Truck("Vovlo", 430,
                new Person(), 12.5, 500);

        System.out.println(vehicle1); // Vehicle Manufacturer: Mercedes, Vehicle Cylinders: 800, Vehicle Owner: Person Name Sharaf Qeshta
        System.out.println(vehicle2); // Vehicle Manufacturer: Nissan, Vehicle Cylinders: 750, Vehicle Owner: Person Name John Smith

        System.out.println(truck1); // Vehicle Manufacturer: Vovlo, Vehicle Cylinders: 430, Vehicle Owner: Person Name No Name Yet, Load Capacity: 12.5, Towing Capacity: 500
        System.out.println(truck2); // Vehicle Manufacturer: Vovlo, Vehicle Cylinders: 430, Vehicle Owner: Person Name No Name Yet, Load Capacity: 12.5, Towing Capacity: 500

        System.out.println(truck1.equals(truck2)); // true
        System.out.println(vehicle1.equals(truck1)); // false
        System.out.println(vehicle1.equals(vehicle2)); // false
    }
}
