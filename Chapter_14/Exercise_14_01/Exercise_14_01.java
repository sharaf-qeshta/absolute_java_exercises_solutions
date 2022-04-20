package chapter_fourteen;

import java.util.ArrayList;

/**
 * 1. Write a computer program to make use of the dynamic data structure ArrayList
 * provided in Java. The program should create a list of items available in a
 * departmental store. First add at least five items in the list. Then display those items. Make
 * use of the methods that can be used with an ArrayList to perform the following
 * operations:
 *  a. Fetch the current number of elements available in the list.
 *  b. Check for a particular item in the list.
 *  c. Replace an item of a list with a new item.
 *  Also, in the end convert the latest ArrayList in to an Array and display the items
 * that are available in the array.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_14_01
{
    public static void main(String[] args)
    {
        ArrayList<String> items = new ArrayList<>();
        /* First add at least five items in the list */
        items.add("Absolute Java-Books");
        items.add("Xbox Series X-Video Games");
        items.add("Hp DeskJet-IT Accessories");
        items.add("Hanes Sweatshirt-Sweatshirt");
        items.add("The pragmatic Programmer-Books");

        /* Then display those items */
        /* [Absolute Java-Books, Xbox Series X-Video Games, Hp DeskJet-IT Accessories, Hanes Sweatshirt-Sweatshirt, The pragmatic Programmer-Books] */
        System.out.println(items);

        /* a. Fetch the current number of elements available in the list. */
        /* 5 */
        System.out.println(items.size());

        /* b. Check for a particular item in the list. */
        /* true */
        System.out.println(items.contains("Absolute Java-Books"));

        /*  c. Replace an item of a list with a new item. */
        items.set(1, "Playstation5-Video Games");

        /* convert the latest ArrayList in to an Array */
        Object[] itemsArray = items.toArray();

        /* display the items that are available in the array */
        /*
        * Absolute Java-Books
        * Playstation5-Video Games
        * Hp DeskJet-IT Accessories
        * Hanes Sweatshirt-Sweatshirt
        * The pragmatic Programmer-Books
        * */
        for (int i = 0; i < itemsArray.length; i++)
            System.out.println(itemsArray[i]);
    }
}
