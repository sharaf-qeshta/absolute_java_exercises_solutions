package chapter_nine;

public class Account
{
    private String ID;
    private int accountNumber;
    private double balance;



    public String getID()
    {
        return ID;
    }

    public boolean setID(String ID)
    {
        boolean pass = true;
        String message = "";

        if (ID.length() != 4)
        {
            pass = false;
            message = "ID Should Have Only 4 Characters";
        }

        else if (!Character.isLetter(ID.charAt(0)))
        {
            message = "ID Must Starts With A Letter";
            pass = false;
        }

        else
        {
            try {
                int x = Integer.parseInt(ID.substring(1));
            }catch (Exception e){
                pass = false;
                message = "ID Must Have 3 Digits At The End";
            }
        }


        if (!pass)
        {
            try {
                throw new Exception(message);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else
            this.ID = ID;
        return pass;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public boolean setAccountNumber(int accountNumber)
    {
        boolean pass = true;

        if ((accountNumber + "").length() != 5)
        {
            try {
                throw new Exception("Account Number Must Be Of Five Digits");
            }catch (Exception e){
                e.printStackTrace();
            }
            pass = false;
        }else {
            this.accountNumber = accountNumber;
        }
        return pass;
    }

    public double getBalance()
    {
        return balance;
    }

    public boolean setBalance(double balance)
    {
        if (balance < 1001)
        {
            try {
                throw new Exception("Balance Must Be Above 1000$");
            }catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }
        else
        {
            this.balance = balance;
            return true;
        }
    }


    public String toString()
    {
        return "ID: " + ID + ", Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}
