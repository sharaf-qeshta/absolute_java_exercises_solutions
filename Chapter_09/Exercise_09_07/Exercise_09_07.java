package chapter_nine;

/**
 * 7. A method that returns a special error code is usually better accomplished throwing an
 * exception instead. The following class maintains an account balance:
 *  class Account
 *  {
 *  private double balance;
 *  public Account()
 *  {
 *  balance = 0;
 *  }
 *  public Account(double initialDeposit)
 *  {
 *  balance = initialDeposit;
 *  }
 *  public double getBalance()
 *  {
 *  return balance;
 *  }
 *  // returns new balance or -1 if error
 *  public double deposit(double amount)
 *  {
 *  if (amount > 0)
 *  balance += amount;
 *  else
 *  return -1;// Code indicating error
 *  return balance;
 *  }
 *  // returns new balance or -1 if invalid amount
 *  public double withdraw(double amount)
 *  {
 *  if ((amount > balance) || (amount < 0))
 *  return -1;
 *  else
 *  balance -= amount;
 *  return balance;
 *  }
 *  }
 *  Rewrite the class so that it throws appropriate exceptions instead of returning −1
 * as an error code. Write test code that attempts to withdraw and deposit invalid
 * amounts and catches the exceptions that are thrown.
 *
 * @author Sharaf Qeshta */


public class Exercise_09_07
{
    public static void main(String[] args)
    {
       Account account = new Account();

       /* The Programme Can`t Work With 0.0 */
       try
       {
           account.deposit(0);
       }
       catch (ValueException ex)
       {
           System.out.println(ex.getMessage());
       }

       /* The Programme Can`t Work With -100.0 */
       try {
           account.withdraw(-100);
       }
       catch (ValueException ex)
       {
           System.out.println(ex.getMessage());
       }
    }
}
