package chapter_thirteen;

/**
 * 8. This is a combination of Programming Projects 13.6 and 13.7. Redo the class
 * Person in Display 5.19 so that the class Date is a private inner class of the class
 * Person, and so that the class Person implements the Cloneable interface. Also,
 * do a suitable test program.
 *
 * @author Sharaf Qeshta */


public class Exercise_13_08
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person person1 = new Person("Sharaf Qeshta",
                new Person.Date(6, 13, 2001), null);
        Person person2 = (Person) person1.clone();

        /* Sharaf Qeshta, June 13, 2001- */
        System.out.println(person1);
        /* Sharaf Qeshta, June 13, 2001- */
        System.out.println(person2);

        person2.setName("John Smith");
        person2.setDeathDate(new Person.Date(2, 2, 2022));

        /* Sharaf Qeshta, June 13, 2001- */
        System.out.println(person1);
        /* John Smith, June 13, 2001-February 2, 2022 */
        System.out.println(person2);
    }
}





