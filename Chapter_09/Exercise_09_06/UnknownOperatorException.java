package chapter_nine;

public class UnknownOperatorException extends Exception
{
    public UnknownOperatorException(String error)
    {
        super(error + " is an unknown operation");
    }
}
