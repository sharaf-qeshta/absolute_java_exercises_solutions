package chapter_nine;

public class DenominatorIsZeroException extends Exception
{
    public DenominatorIsZeroException()
    {
        super("You Cannot Divide By Zero");
    }
}
