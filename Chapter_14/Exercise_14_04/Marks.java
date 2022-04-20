package chapter_fourteen;

import java.util.ArrayList;

public class Marks<M extends Number>
{
    public double orderAverage(ArrayList<M> values)
    {
        double total = 0;
        for (M value: values)
            total += value.doubleValue();
        return total/values.size();
    }
}
