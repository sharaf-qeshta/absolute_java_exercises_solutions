package chapter_nine;

public class ValueException extends Exception
{
    public ValueException(double value)
    {
        super("The Programme Can`t Work With " + value);
    }
}
