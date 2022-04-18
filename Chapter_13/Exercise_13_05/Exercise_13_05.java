package chapter_thirteen;

import java.util.Arrays;

/**
 * 5. In Display 13.5, we described a sorting method to sort an array of type Comparable[].
 * In Display 12.8, we described a sorting method that used the quick sort
 * algorithm to sort an array of type double[] into increasing order. Redo the
 * method in Display 12.8 so it applies to an array of type Comparable[]. Also,
 * do a suitable test program.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_13_05
{
    public static void main(String[] args)
    {
        String[] strings = {"Sharaf", "John", "Adam", "Noah"};
        Integer[] integers = {10, 50, 30, 8, 9, 1, 7, 15};
        Double[] doubles = {7.7, 5.5, 11.0, 3.0, 16.0, 4.4, 20.0, 14.0, 13.0, 42.0};


        QuickSort.sort(strings, 0, strings.length-1);
        /* [Adam, John, Noah, Sharaf] */
        System.out.println(Arrays.toString(strings));

        QuickSort.sort(integers, 0, integers.length-1);
        /* [1, 7, 8, 9, 10, 15, 30, 50] */
        System.out.println(Arrays.toString(integers));

        QuickSort.sort(doubles, 0, doubles.length-1);
        /* [3.0, 4.4, 5.5, 7.7, 11.0, 13.0, 14.0, 16.0, 20.0, 42.0] */
        System.out.println(Arrays.toString(doubles));
    }
}





