package chapter_nine;

public class YearException extends Exception
{
    public YearException()
    {
        super("The Year Should be between 1000 and 3000 (inclusive) ");
    }

}
