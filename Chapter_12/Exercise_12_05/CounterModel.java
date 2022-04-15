package chapter_twelve;

/**
 * The Model contains only the pure application data
 * */

public class CounterModel
{
    public static int counter;

    public CounterModel(int initialValue)
    {
        counter = initialValue;
    }

    public void Increment()
    {
        counter++;
    }
}
