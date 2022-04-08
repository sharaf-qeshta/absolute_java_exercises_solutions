package chapter_seven;

/**
 * 4. Define a class called Administrator, which is a derived class of the class
 * SalariedEmployee in Display 7.5. You are to supply the following additional
 * instance variables and methods:
 * • An instance variable of type String that contains the administrator’s title (such
 * as "Director" or "Vice President").
 * • An instance variable of type String that contains the administrator’s area of
 * responsibility (such as "Production", "Accounting", or "Personnel").
 * • An instance variable of type String that contains the name of this administrator’s
 * immediate supervisor.
 * • Suitable constructors, and suitable accessor and mutator methods.
 * • A method for reading in an administrator’s data from the keyboard.
 *  Override the definitions for the methods equals and toString so they are appropriate
 *  to the class Administrator.
 *  Also, write a suitable test program.
 *
 *  @author Sharaf Qeshta */


public class Exercise_07_04
{
    public static void main(String[] args)
    {
        Administrator admin1 = new Administrator("Sharaf Qeshta",
                new Date(10, 15, 2014), 10000,
                "Director", "Production", "John Smith");

        Administrator admin2 = new Administrator("John Smith",
                new Date(1, 17, 2010), 15000,
                "Vice President", "Production", "Tom");


        /*
        * Sharaf Qeshta October 15, 2014
        * $10000.0 per year
        * Director
        * John Smith
        * Production
        * */
        System.out.println(admin1);

        /*
        * John Smith January 17, 2010
        * $15000.0 per year
        * Vice President
        * Tom
        * Production
        * */
        System.out.println(admin2);


        System.out.println(admin1.equals(admin2)); // false


    }

}
