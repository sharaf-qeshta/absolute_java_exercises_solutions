package chapter_thirteen;

/**
 * 7. Redo the class Person in Display 5.19 so that the class Date is a private inner class
 * of the class Person. Also, do a suitable test program. (You need not start from the
 * version produced in Programming Project 13.6. You can ignore Programming
 * Project 13.6 when you do this project.)
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_13_07
{
    public static void main(String[] args)
    {
        Person person = new Person("Sharaf Qeshta",
                new Person.Date(6, 13, 2001), null);

        /* Sharaf Qeshta, June 13, 2001- */
        System.out.println(person);
    }
}





