package chapter_six;

/**
 * 8. Design a class called BubbleSort that is similar to the class SelectionSort given
 * in Display 6.11. The class BubbleSort will be used in the same way as the class
 * SelectionSort, but it will use the bubble sort algorithm.
 *  The bubble sort algorithm checks all adjacent pairs of elements in the array from
 * the beginning to the end and interchanges any two elements that are out of order.
 * This process is repeated until the array is sorted. The algorithm is as follows:
 *  Bubble Sort Algorithm to Sort an Array a
 *  Repeat the following until the array a is sorted:
 *  for (index = 0; index < a.length – 1; index++)
 *  if (a[index] > a[index + 1])
 *  Interchange the values of a[index] and a[index + 1].
 *  The bubble sort algorithm is good for sorting an array that is “almost sorted.” It is
 * not competitive with other sorting methods for most other situations.
 *
 * @author Sharaf Qeshta */



public class Exercise_06_08
{
    public static void main(String[] args)
    {
        double[] b = {7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42};

        System.out.println("Array contents before sorting:");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        BubbleSort.sort(b);

        System.out.println("Sorted array values:");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        /*
         * Array contents before sorting:
         * 7.7 5.5 11.0 3.0 16.0 4.4 20.0 14.0 13.0 42.0
         * Sorted array values:
         * 3.0 4.4 5.5 7.7 11.0 13.0 14.0 16.0 20.0 42.0
         *
         * */
    }
}
