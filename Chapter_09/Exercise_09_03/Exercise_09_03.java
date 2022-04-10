package chapter_nine;


/**
 * 3. Modify the previous exercise to include methods for amount deposited and
 * amount withdrawn. Create your own exception class which will check inside
 * the method for the amount deposited so that after the deposit, the maximum
 * balance in the account must not be more than $5000. Also, check inside the
 * method for amount withdrawn so that the available balance after the withdrawal
 * does not go below $1000. Invoke the defined methods from your main method
 * and catch the exceptions
 *
 * @author Sharaf Qeshta */

public class Exercise_09_03
{
    public static void main(String[] args)
    {
        Account account = new Account();
        account.setID("l456");
        account.setBalance(1200);
        account.setAccountNumber(12345);

        try {
            account.deposit(5000);
        }catch (ExceedDepositingBoundsException ex){
            ex.printStackTrace();
        }

        try {
            account.withdraw(1000);
        }catch (ExceedWithdrawingBoundsException ex){
            ex.printStackTrace();
        }


        /* ID: l456, Account Number: 12345, Balance: $1200.0 */
        System.out.println(account);
    }
}
