package chapter_twelve;

public class InsertionSort
{
    public static void sort(int[] array, int begin, int end)
    {
        if (begin < array.length)
        {
            int key = array[begin];
            int j = begin - 1;
            join(array, j, key);
            sort(array, begin+1, end);
        }
    }

    public static void join(int[] array, int j, int key)
    {
        while (j >= 0 && array[j] > key)
        {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
    }
}
