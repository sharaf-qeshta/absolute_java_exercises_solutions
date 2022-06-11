package chapter_nineteen;

public class Transaction extends Thread
{
    private BankAccount account;
    private int index;

    public Transaction(BankAccount account, int index)
    {
        this.account = account;
        this.index = index;
    }

    @Override
    public void run()
    {
        if (index % 2 == 0)
            account.deposit(Exercise_19_13.AMOUNT);
        else
            account.withdraw(Exercise_19_13.AMOUNT);
    }
}
