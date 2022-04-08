package chapter_seven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 9. Programming Project 6.18 asked you to use an array of Strings to store the fruits
 * and vegetables shipped in a BoxOfProduce object for a CSA farm.
 *  Modify your solution further by creating a Produce class. This class should have an
 * instance variable of type String for the name, appropriate constructors, and a public
 * toString() method. Then create a Fruit and a Vegetable class that are derived
 * from Produce. These classes should have constructors that take the name as a String
 * and invoke the appropriate constructor from the base class to set the name.
 *  Next, modify the text file of produce so it indicates whether each item is a fruit or
 * a vegetable. Here is one possible organization, although you can use others:
 * Broccoli,Vegetable
 * Tomato,Fruit
 * Kiwi,Fruit
 * Kale,Vegetable
 * Tomatillo,Fruit
 *  Finally, modify the BoxOfProduce class so it creates an array of type Produce
 * instead of type String. The class should read the produce from the text file and
 * create instances of either Fruit or Vegetable, with the appropriate name, in the
 * array. After a box is finished, loop through the contents of the array and output
 * how many fruit and how many vegetables are in the box. The rest of the program
 * should behave the same as the solution to Programming Project 6.18.
 *
 * @author Sharaf Qeshta */


public class Exercise_07_09
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        BoxOfProduce box = readFromFile("src/chapter_seven/produce.txt");

        System.out.println(box); // Item 1: Produce Name: Broccoli, Type: Vegetable, Item 2: Produce Name: Tomato, Type: Fruit, Item 3: Produce Name: Kiwi, Type: Fruit, Item 4: Produce Name: Kale, Type: Vegetable, Item 5: Produce Name: Tomatillo, Type: Fruit,


        System.out.println(BoxOfProduce.getFruitAndVegetableCount(box)); // Fruits Count: 3, Vegetables Count: 2


    }

    public static BoxOfProduce readFromFile(String filePath)
            throws FileNotFoundException
    {
        File file = new File(filePath);
        Scanner fileReader = new Scanner(file);
        BoxOfProduce box = new BoxOfProduce();

        int counter = 0;
        while (fileReader.hasNext())
        {
            box.setCapacity(counter+1);
            String line = fileReader.nextLine();
            StringTokenizer st = new StringTokenizer(line, ",");

            String name = st.nextToken();
            String type = st.nextToken();

            if (type.equals("Fruit"))
                box.setBundle(new Fruit(name), counter++);
            else
                box.setBundle(new Vegetable(name), counter++);
        }
        return box;
    }
}
