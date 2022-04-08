package chapter_seven;

public class SMS extends Message
{
    String recipientContactNo;

    public SMS(String text)
    {
        super(text);
    }

    public SMS(String text, String recipientContactNo)
    {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo()
    {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo)
    {
        this.recipientContactNo = recipientContactNo;
    }

    public String toString()
    {
        return "SMS Body: " + text + "\nSMS Receiver: " + recipientContactNo;
    }
}
