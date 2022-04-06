package chapter_four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 13. Your Community Supported Agriculture (CSA) farm delivers a box of fresh fruits
 * and vegetables to your house once a week. For this Programming Project, define the
 * class BoxOfProduce that contains exactly three bundles of fruits or vegetables. You
 * can represent the fruits or vegetables as three instance variables of type String. Add
 * appropriate constructor, accessor, and mutator methods. Also write a toString()
 * method that returns as a String the complete contents of the box.
 *  Next, write a main method that creates a BoxOfProduce with three items randomly
 * selected from this list:
 * Broccoli
 * Tomato
 * Kiwi
 * Kale
 * Tomatillo
 *  This list should be stored in a text file that is read in by your program. For now
 * you can assume that the list contains exactly five types of fruits or vegetables.
 *  Do not worry if your program randomly selects duplicate produce for the three
 * items. Next, the main method should display the contents of the box and allow
 * the user to substitute any one of the five possible fruits or vegetables for any of the
 * fruits or vegetables selected for the box. After the user is done with substitutions,
 * output the final contents of the box to be delivered. If you create additional methods
 * to select the random items and to select valid substitutions, then your main
 * method will be simpler to write.
 *
 * @author Sharaf Qeshta*/


public class Exercise_04_13
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
        , getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5), getRandomBundle(bundle1, bundle2, bundle3, bundle4, bundle5));

        Scanner keyboard = new Scanner(System.in);
        while (true)
        {
            System.out.println(box);
            System.out.println("Enter -1 to Quit!");
            System.out.println("Available Items: " + bundle1 + ", " + bundle2 + ", " + bundle3 + ", " +  bundle4 +  ", " + bundle5);
            System.out.println("Enter number of item(1-3) to be replaced with(1-5) other items: ");
            int replaced = keyboard.nextInt();
            int replacedWith = keyboard.nextInt();

            if (replaced == -1 || replacedWith == -1)
            {
                System.out.println("This is The Package That Will be Delivered: ");
                System.out.println(box);
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
