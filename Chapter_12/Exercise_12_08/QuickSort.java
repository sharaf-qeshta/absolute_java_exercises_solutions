package chapter_twelve;

/**
 Class that realizes the divide-and-conquer sorting pattern and
 uses the quick sort algorithm.
 */

public class QuickSort
{
    public static void sort(double[] a, int begin, int end)
    {
        if (a.length == 2)
        {
            if (a[0] > a[1])
            {
                double temp = a[0];
                a[0] = a[1];
                a[1] = temp;
            }
        }
        else if (begin < end)
        {
            int splitPoint = split(a, begin, end);
            sort(a, begin, splitPoint-1);
            sort(a, splitPoint + 1, end);
        }
    }

    private static int split(double [] a, int begin, int end)
    {
        /* The splitting point is the middle (in size) of the first element */
        double[] temp;
        int size = (end - begin + 1);
        temp = new double[size];
        double splitValue = a[begin];
        int up = 0;
        int down = size -1;
        for (int i = begin + 1; i <= end; i++) {
            if (a[i] <= splitValue)
            {
                temp[up] = a[i];
                up++;
            } else {
                temp[down] = a[i];
                down--;
            }
        }
        temp[up] = a[begin];
        for (int i = 0; i < size; i++)
            a[begin + i] = temp[i];

        int end_ = begin + up;
        /* the last element */
        double pivot = a[end_];
        int i = (begin - 1);

        for(int j = begin; j <= end_ - 1; j++)
        {
            if (a[j] < pivot)
            {
                i++;
                double temp_ = a[i];
                a[i] = a[j];
                a[j] = temp_;
            }
        }
        double temp_ = a[i+1];
        a[i+1] = a[end];
        a[end] = temp_;

        int begin_ = i + 1;
        /* and an element at approximately the middle of the array */
        int i_ = begin_, j_ = end;
        double tmp;
        double pivot_ = a[(begin_ + end) / 2];

        while (i_ <= j_)
        {
            while (a[i_] < pivot_)
                i_++;
            while (a[j_] > pivot_)
                j_--;
            if (i_ <= j_)
            {
                tmp = a[i_];
                a[i_] = a[j_];
                a[j_] = tmp;
                i_++;
                j_--;
            }
        }
        return i_;
    }
}

