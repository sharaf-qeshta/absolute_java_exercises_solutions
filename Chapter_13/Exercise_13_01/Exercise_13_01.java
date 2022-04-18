package chapter_thirteen;

/**
 * 1. Modify the recursive implementation of binary search from Chapter 11 so that the
 * search method works on any array of type Comparable[]. Test the
 * implementation with arrays of different types to see if it works.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_13_01
{
    public static void main(String[] args)
    {
        String[] strings = {"hello", "world", "again"};
        Integer[] integers = {5, 7, 6, 3, 15};

        System.out.println(binarySearch(strings, 0, strings.length-1, "world")); // 1
        System.out.println(binarySearch(integers, 0, integers.length-1, 6)); // 2
    }

    public static Comparable binarySearch(Comparable[] arr, int from, int to, Comparable element)
    {
        if (to >= from)
        {
            int mid = from + (to - from) / 2;

            if (arr[mid].compareTo(element) == 0)
                return mid;
            if (arr[mid].compareTo(element) > 0)
                return binarySearch(arr, from, mid - 1, element);
            return binarySearch(arr, mid + 1, to, element);
        }
        return -1;
    }
}





