package chapter_three;


/**
 * 11. You have three identical prizes to give away and a pool of 30 finalists. The finalists
 * are assigned numbers from 1 to 30. Write a program to randomly select the numbers
 * of three finalists to receive a prize. Make sure not to pick the same number
 * twice. For example, picking finalists 3, 15, 29 would be valid but picking 3, 3, 31
 * would be invalid because finalist number 3 is listed twice and 31 is not a valid
 * finalist number.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_03_11
{
    public static void main(String[] args)
    {
        // you can do that by separating the 30 finalists in ranges
        int prize1 = (int) (((Math.random() * 10) % 10) + 1); // 1..10
        int prize2 = (int) (((Math.random() * 10) % 10) + 11); // 11..20
        int prize3 = (int) (((Math.random() * 10) % 10) + 21); // 21..30

        System.out.println(prize1 + ", " + prize2 + ", " + prize3);
    }
}
