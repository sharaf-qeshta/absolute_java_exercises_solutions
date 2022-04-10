package chapter_nine;

public class MonthException extends Exception
{
    public MonthException()
    {
        super("The Month Number Should be between 1 and 12 (inclusive) ");
    }

    public MonthException(String message)
    {
        super(message);
    }

}
