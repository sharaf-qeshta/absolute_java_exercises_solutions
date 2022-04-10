package chapter_nine;

public class DayException extends Exception
{
    public DayException()
    {
        super("The Day Number Should be between 1 and 31 (inclusive) ");
    }

    public DayException(String message)
    {
        super(message);
    }
}
