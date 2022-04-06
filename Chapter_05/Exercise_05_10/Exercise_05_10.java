package chapter_five;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 10. First, complete Programming Project 4.13 from Chapter 4.
 *  Modify the main method with a loop so that an arbitrary number of BoxOfProduce
 * objects are created and substitutions are allowed for each box. Add a menu so the
 * user can decide when to stop creating boxes.
 *  You would like to throw in a free recipe flyer for salsa verde if the box contains
 * tomatillos. However, there are only five recipe flyers. Add a static variable to the
 * BoxOfProduce class that counts the number of recipe flyers remaining and initialize
 * it to 5. Also add an instance variable that indicates whether or not the box contains
 * a recipe flyer and modify the toString() method to also output “salsa verde
 * recipe” if the box contains a recipe flyer. Finally, add logic inside the class so that
 * if the box contains at least one order of tomatillos then it automatically gets a recipe
 * flyer until all of the recipe flyers are gone. Note that a box should only get one recipe
 * flyer even if there are multiple orders of tomatillos.
 *  Test your class by creating boxes with tomatillos from your menu until all of the
 * flyers are gone.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_05_10
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/chapter_four/bundles.txt");
        Scanner fileScanner = new Scanner(file);

        String bundle1 = fileScanner.nextLine();
        String bundle2 = fileScanner.nextLine();
        String bundle3 = fileScanner.nextLine();
        String bundle4 = fileScanner.nextLine();
        String bundle5 = fileScanner.nextLine();

        BoxOfProduce box = new BoxOfProduce(getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5)
                , getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5),
                getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5));
        String boxes = "\n";

        Scanner keyboard = new Scanner(System.in);
        while (true)
        {
            System.out.println(box);
            System.out.println("Enter -2 to Quit! Or -1 To Select Another Box");
            System.out.println("Available Items: " + bundle1 + ", " + bundle2 + ", " + bundle3 + ", " +  bundle4 +  ", " + bundle5);
            System.out.println("Enter number of item(1-3) to be replaced with(1-5) other items: ");
            int replaced = keyboard.nextInt();
            int replacedWith = keyboard.nextInt();

            if (replaced == -1 || replacedWith == -1)
            {
                System.out.println("This is The Package That Will be Delivered: ");
                System.out.println(box + "\n\n\n");
                boxes += box + "\n";
                box = new BoxOfProduce(getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5)
                        , getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5),
                        getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5));
                continue;
            }

            else if (replaced == -2 || replacedWith == -2)
            {
                System.out.println("The Selected Boxes Are: ");
                System.out.println(boxes);
                System.exit(0);
            }

            if (replaced < 1 || replaced > 3 || replacedWith < 1 || replacedWith > 5)
            {
                System.out.println("Wrong Input");
                continue;
            }

            replace(replaced, getItem(replacedWith, bundle1, bundle2, bundle3, bundle4, bundle5), box);
            System.out.println("Replaced Successfully");
        }
    }

    public static void replace(int itemIndex, String bundle, BoxOfProduce box)
    {
        if (itemIndex == 1)
            box.setBundle1(bundle);
        else if (itemIndex == 2)
            box.setBundle2(bundle);
        else if (itemIndex == 3)
            box.setBundle3(bundle);
    }

    public static String getRandomBundle(String b1, String b2, String b3, String b4, String b5)
    {
        int i = (int) ((Math.random() * 100) % 5);
        if (i == 0)
            return b1;
        if (i == 1)
            return b2;
        if (i == 2)
            return b3;
        if (i == 3)
            return b4;
        if (i == 4)
            return b5;
        return "Error"; // will not occur
    }

    public static String getItem(int i, String b1, String b2, String b3, String b4, String b5)
    {
        if (i == 1)
            return b1;
        if (i == 2)
            return b2;
        if (i == 3)
            return b3;
        if (i == 4)
            return b4;
        if (i == 5)
            return b5;
        return "Error"; // will not occur
    }
}
