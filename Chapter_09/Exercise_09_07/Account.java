package chapter_nine;

public class Account
{
    private double balance;

    public Account()
    {
        balance = 0;
    }


    public Account(double initialDeposit)
    {
        balance = initialDeposit;
    }


    public double getBalance()
    {
        return balance;
    }

    // returns new balance or throw ValueException if error
    public double deposit(double amount) throws ValueException
    {
        if (amount > 0)
            balance += amount;
        else
            throw new ValueException(amount); // Code indicating error
        return balance;
    }


    // returns new balance or throw ValueException if invalid amount
    public double withdraw(double amount) throws ValueException
    {
        if ((amount > balance) || (amount < 0))
            throw new ValueException(amount);
        else
            balance -= amount;
        return balance;
    }
}
