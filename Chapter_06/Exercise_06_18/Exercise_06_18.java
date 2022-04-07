package chapter_six;

/**
 * 18. Programming Project 4.13 asked you to create a BoxOfProduce class representing
 * a box of produce to deliver from a CSA farm. The box contained exactly three
 * items. Modify the class so it uses an array of type String to represent the items
 * in the box. You can still start with three random items to place in the box, but
 * your menu should be modified to allow the user to add additional items and still
 * substitute one item for another. You will likely need to modify the constructor of
 * the BoxOfProduce class and also add new methods.
 *
 * @author Sharaf Qeshta */



public class Exercise_06_18
{
    public static void main(String[] args)
    {
        BoxOfProduce box = new BoxOfProduce();
        box.setBundle("Tomato", 0);
        box.setBundle("Avocado", 1);
        box.setBundle("Garlic", 2);

        /* Item 1: Tomato, Item 2: Avocado, Item 3: Garlic,  */
        System.out.println(box);

        box.setCapacity(5);

        box.setBundle("Carrot", 3);
        box.setBundle("Mango", 4);

        /* Item 1: Tomato, Item 2: Avocado, Item 3: Garlic, Item 4: Carrot, Item 5: Mango,  */
        System.out.println(box);

        System.out.println(box.getBundle(4)); // Mango
    }

}
