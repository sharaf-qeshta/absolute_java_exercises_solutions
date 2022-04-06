package chapter_five;

/**
 * 1. Define a class called BookStore to maintain the record of books sold. The store
 * contains three categories of books i.e. “Kids”, “Engineering”, and “Story”. The
 * following details should be maintained for each book.
 *  a. Book category
 *  b. Author
 *  c. Title
 *  d. Publisher
 *  e. Selling price of the book
 *  f. Quantity
 *  Create a constructor that initializes the Store ID and the rest of the details of the
 * book mentioned above. Include a method named trackSalesStatus that will
 * display the total number of books sold by the store (add a static variable that tracks
 * the total number of books sold). Also, include a method to display the quantity
 * available corresponding to each Book ID. Write a main method to test your class.
 *
 * @author Sharaf Qeshta*/

public class Exercise_05_01
{
    public static void main(String[] args)
    {
        BookStore bookStore = new BookStore("1", "Kids",
                "Walter Savitch", "Absolute Java", "Pearson", 50.5, 100);
        bookStore.sell();
        bookStore.sell();
        bookStore.sell();
        bookStore.sell();
        bookStore.trackSalesStatus(); // Book Sold: 4
    }
}
