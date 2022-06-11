package chapter_nineteen;

/**
 * 13. This program simulates what might happen if two people who share the same bank
 * account happen to make a simultaneous deposit or withdrawal and the bank does
 * not account for race conditions by recreating the situation described in Displays 19.4
 * and 19.5 with a simple BankAccount class. The BankAccount class should store
 * an account balance and have methods to retrieve the balance, make a deposit, and
 * make a withdrawal. Do not worry about negative balances.
 *  Next, create an array of thousands of threads where each thread has a reference
 * to the same BankAccount object. In the run() method, even numbered threads
 * deposit one dollar and odd numbered threads withdraw one dollar. If you create
 * an even number of threads, then after all threads are done the account balance
 * should be zero. See if you can find a number of threads so that you consistently end
 * up with a balance that is not zero. If you want to increase the likelihood of a race
 * condition, then make each thread sleep a short random number of milliseconds in
 * the run() method.
 *  Add the synchronized keyword to fix the problem and ensure a balance of zero
 * after all the threads are done.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_19_13
{
    /**
     * if we try it with odd number of threads then the
     * final result will be 1.0
     * */
    public static final int NUMBER_OF_THREADS = 30_000;
    public static final int AMOUNT = 1;

    public static void main(String[] args)
    {
        /*
        * without synchronization
        * The balance is 0.0
        * The balance is -1.0
        * or sometimes the correct one
        * The balance is 0.0
        * The balance is 0.0
        *
        * with synchronization
        * it`s always the right answer
        * The balance is 0.0
        * The balance is 0.0
        * */
        BankAccount account = new BankAccount(0);
        System.out.println("The balance is " + account.getBalance());

        Transaction[] threads = new Transaction[NUMBER_OF_THREADS];
        // assign and start the threads
        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new Transaction(account, i);
            threads[i].start();
        }

        // wait until threads finish
        for (Transaction thread : threads)
        {
            try
            {
                thread.join();
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("The balance is " + account.getBalance());
    }
}
