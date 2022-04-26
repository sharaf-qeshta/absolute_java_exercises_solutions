package chapter_sixteen;

import java.util.Vector;

public class BubbleSort
{
    public static void sort(Vector<String> vector)
    {
        boolean needNextIteration = true;
        while (needNextIteration)
        {
            needNextIteration = false;
            for (int i = 0; i < vector.size()-1; i++)
            {
                if (vector.get(i).compareTo(vector.get(i+1)) > 0)
                {
                    interchange(i, i+1, vector);
                    needNextIteration = true;
                }
            }
        }
    }

    private static void interchange(int i, int j, Vector<String> vector)
    {
        String temp = vector.get(i);
        vector.set(i, vector.get(j));
        vector.set(j, temp);
    }
}

