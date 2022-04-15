package chapter_twelve;


/**
 * 1. The UML diagram below describes a class named Movie. Implement this class
 * in Java and test it from a main method that creates several Movie objects. The
 * printDescription() method should output all member variables for the class.
 *                      Movie
 * — title: String
 * — minutes: int
 * — year: int
 * # price: double
 * + Movie(in String title, in int year, in double price)
 * + getTitle( ): String
 * + setTitle(in String newTitle)
 * + printDescription( )
 *
 * The word “in” means the parameter is used to deliver data to the method.
 *
 * @author Sharaf Qeshta
 **/


public class Exercise_12_01
{
    public static void main(String[] args)
    {
        Movie movie1 = new Movie("Avatar ", 2009, 30.5);
        Movie movie2 = new Movie("American Sniper", 2014, 20.6);
        Movie movie3 = new Movie("Avengers: Endgame", 2019, 19.5);

        /* Title: Avatar , Duration (Minutes): 0, Year: 2009, Price: $30.5 */
        movie1.printDescription();
        /* Title: American Sniper, Duration (Minutes): 0, Year: 2014, Price: $20.6 */
        movie2.printDescription();
        /* Title: Avengers: Endgame, Duration (Minutes): 0, Year: 2019, Price: $19.5 */
        movie3.printDescription();
    }
}
