package chapter_six;

public class BubbleSort
{
    public static void sort(double[] a)
    {
        boolean needNextIteration = true;
        while (needNextIteration)
        {
            needNextIteration = false;
            for (int i = 0; i < a.length-1; i++)
            {
                if (a[i] > a[i+1])
                {
                    interchange(i, i+1, a);
                    needNextIteration = true;
                }
            }
        }
    }

    private static void interchange(int i, int j, double[] a)
    {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
