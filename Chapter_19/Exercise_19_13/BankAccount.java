package chapter_nineteen;

public class BankAccount
{
    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount)
    {
        balance -= amount;
    }

    public synchronized void deposit(double amount)
    {
        balance += amount;
    }

    public double getBalance()
    {
        return balance;
    }
}

