package chapter_four;

/**
 * 8. Redefine the class Date in Display 4.13 so that the instance variable for the month
 * is of type int instead of type String. None of the method headings should change
 * in any way. In particular, no String type parameters should change to int type
 * parameters. You must redefine the methods to make things work out. Any program
 * that uses the Date class from Display 4.13 should be able to use your Date class
 * without any changes in the program. In particular, the program in Display 4.14
 * should work the same whether the Date class is defined as in Display 4.13 or is
 * defined as you do it for this project. Write a test program (or programs) that tests
 * each method in your class definition.
 *
 *
 * @author sharaf qeshta
 * */

public class Exercise_04_08
{
    public static void main(String[] args)
    {
        Date date1 = new Date("December", 16, 1770),
                date2 = new Date(1, 27, 1756),
                date3 = new Date(1882),
                date4 = new Date();
        System.out.println("Whose birthday is " + date1 + "?");
        System.out.println("Whose birthday is " + date2 + "?");
        System.out.println("Whose birthday is " + date3 + "?");
        System.out.println("The default date is " + date4 + ".");

        /*
        * before edit
        * Whose birthday is December 16, 1770?
        * Whose birthday is January 27, 1756?
        * Whose birthday is January 1, 1882?
        * The default date is January 1, 1000.
        * */

        /*
         * after edit
         * Whose birthday is December 16, 1770?
         * Whose birthday is January 27, 1756?
         * Whose birthday is January 1, 1882?
         * The default date is January 1, 1000.
         * */


    }
}
