package chapter_eight;


/**
 * 7. Define a class named MultiItemSale that represents a sale of multiple items of
 * type Sale given in Display 8.1 (or of the types of any of its descendent classes).
 * The class MultiItemSale will have an instance variable whose type is Sale[],
 * which will be used as a partially filled array. There will also be another instance
 * variable of type int that keeps track of how much of this array is currently used.
 * The exact details on methods and other instance variables, if any, are up to you.
 * Use this class in a program that obtains information for items of type Sale and of
 * type DiscountSale (Display 8.2) and that computes the total bill for the list of
 * items sold
 *
 * @author Sharaf Qeshta */

public class Exercise_08_07
{
    public static void main(String[] args)
    {
        MultiItemSale items = new MultiItemSale();

        for (int i = 0; i < 25; i++)
            items.add(new Sale("Item" + i, 3 * (i+1)));
        for (int i = 25; i < 50; i++)
            items.add(new DiscountSale("Item" + i, 2 * (i), i));

        items.printAllItems();
        System.out.println("Total Price: $" + items.getBill()); // Total Price: $2064.52
    }
}
