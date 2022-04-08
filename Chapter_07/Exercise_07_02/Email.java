package chapter_seven;

public class Email extends Message
{
    String receiver, sender, subject;

    public Email(String text)
    {
        super(text);
    }

    public Email(String text, String receiver,
                 String sender, String subject)
    {
        super(text);
        this.receiver = receiver;
        this.sender = sender;
        this.subject = subject;
    }

    public String toString()
    {
        return "Email Receiver: " + receiver + ", Email Sender: " + sender
                + ", Email Subject: " + subject + "\nEmail Text: " + text;
    }


    public String getReceiver()
    {
        return receiver;
    }

    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    public String getSender()
    {
        return sender;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }
}
