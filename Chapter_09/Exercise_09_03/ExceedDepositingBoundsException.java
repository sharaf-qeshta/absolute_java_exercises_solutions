package chapter_nine;

public class ExceedDepositingBoundsException extends Exception
{
    public ExceedDepositingBoundsException()
    {
        super("You Cannot Deposit More Than 5000$ In Your Account!");
    }
}
