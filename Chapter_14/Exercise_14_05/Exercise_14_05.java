package chapter_fourteen;

/**
 * 5. Create a generic class with a type parameter that simulates drawing an item at
 * random out of a box. This class could be used for simulating a random drawing.
 * For example, the box might contain Strings representing names written on a slip
 * of paper, or the box might contain Integers representing a random drawing for a
 * lottery based on numeric lottery picks. Create an add method that allows the user
 * of the class to add an object of the specified type along with an isEmpty method
 * that determines whether or not the box is empty. Finally, your class should have
 * a drawItem method that randomly selects an object from the box and returns it.
 * If the user attempts to draw an item out of an empty box, return null. Write a
 * main method that tests your class
 *
 * @author Sharaf Qeshta */

public class Exercise_14_05
{
    public static void main(String[] args)
    {
        RandomItemSelector<Integer> selector = new RandomItemSelector<>();

        System.out.println(selector.drawItem()); // null

        selector.add(10);
        selector.add(12);
        selector.add(43);
        selector.add(54);
        selector.add(65);
        selector.add(13);
        selector.add(3);

        System.out.println(selector.isEmpty()); // false

        System.out.println(selector.drawItem()); // 13
        System.out.println(selector.drawItem()); // 65
        System.out.println(selector.drawItem()); // 10
    }

}
