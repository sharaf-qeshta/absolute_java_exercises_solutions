package chapter_fourteen;


import java.util.ArrayList;

/**
 * 4. Write a generic class, Marks, with a type parameter M where M is a numeric object
 * type (e.g., Integer, Double, or any class that extends java.lang.Number). Add
 * a method named orderAverage that takes an ArrayList of type M and returns
 * a double type data which is the average of the values in the ArrayList. Use the
 * doubleValue() method in the Number class to retrieve the value of each number
 * as a double. Test your method with suitable data. Your program should generate
 * a compile-time error if your average method is invoked on an ArrayList and a
 * nonnumeric element is encountered (e.g., Strings).
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_14_04
{
    public static void main(String[] args)
    {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);

        Marks<Integer> marks = new Marks<>();
        System.out.println(marks.orderAverage(integers)); // 5.5
    }

}
