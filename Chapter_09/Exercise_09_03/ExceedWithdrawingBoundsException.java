package chapter_nine;

public class ExceedWithdrawingBoundsException extends Exception
{
    public ExceedWithdrawingBoundsException()
    {
        super("Account Should At Least Contains 1000$");
    }
}
