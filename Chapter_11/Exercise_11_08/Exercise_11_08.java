package chapter_eleven;

/**
 * 8. Write a recursive method named searchList with the following header:
 * boolean searchList ( int[] a, int size, int num)
 * The method should accept as parameter the following values with the specification
 * mentioned below:
 * a. A list of integer values
 * b. Size of the array, size >=5
 * c. Number to be searched in the parameter num, num >=0
 * The method should return true if the number is contained within the array list
 * and false if the number is not in the array list.
 *
 * @author Sharaf Qeshta */

public class Exercise_11_08
{
    public static void main(String[] args)
    {
        int[] a = {10, 50, 12, 13, 14, 78, 102, 33, 98};
        System.out.println(searchList(a, a.length, 50)); // true
        System.out.println(searchList(a, a.length, 33)); // true
        System.out.println(searchList(a, a.length, 14)); // true
        System.out.println(searchList(a, a.length, 103)); // false
        System.out.println(searchList(a, a.length, -1)); // false
    }

    public static boolean searchList(int[] a, int size, int num)
    {
        if (a.length < 5 || num < 0)
            return false;
        if (size < 1)
            return false;

        if (a[size-1] == num)
            return true;

        return searchList(a, size-1, num);
    }



}
