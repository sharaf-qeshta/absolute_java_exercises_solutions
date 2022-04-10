package chapter_nine;

import java.util.Locale;
import java.util.Scanner;

/**
 * 2. Define a class to maintain bank accounts of customers. The program should place
 * the code into a try-catch block with multiple catches to check for the validity of
 * various attributes based on the following criteria.
 *  a. Customer ID must start with a letter and should be followed by three digits.
 *  b. Account number must be of five digits.
 *  c. Initial balance must be above $1000.
 *  Print suitable error matches within the catch block. If any of the criteria mentioned
 * above is not fulfilled, the program should loop back and let the user enter new data.
 *
 * @author Sharaf Qeshta */

public class Exercise_09_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Account account = new Account();

        boolean pass = false;
        while (!pass)
        {
            System.out.print("\nEnter ID: ");
            String id = scanner.next();
            pass = account.setID(id);
        }

        pass = false;
        while (!pass)
        {
            System.out.print("\nEnter Account Number: ");
            int accountNumber = scanner.nextInt();
            pass = account.setAccountNumber(accountNumber);
        }

        pass = false;
        while (!pass)
        {
            System.out.print("\nEnter Balance: ");
            double balance = scanner.nextDouble();
            pass = account.setBalance(balance);
        }

        /* ID: l456, Account Number: 12345, Balance: $10000.0 */
        System.out.println(account);
    }
}
