package chapter_seven;

public class Message
{
    String text;

    public Message(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String toString()
    {
        return text;
    }

    public String encode()
    {
        String encoded = "";

        for (int i = 0; i < text.length(); i++)
            encoded += (char) (text.charAt(i) + 1);

        return encoded;
    }

    public String encode(String string)
    {
        String encoded = "";

        for (int i = 0; i < string.length(); i++)
            encoded += (char) (string.charAt(i) + 1);

        return encoded;
    }

    public String decode(String string)
    {
        String decoded = "";

        for (int i = 0; i < string.length(); i++)
            decoded += (char) (string.charAt(i) - 1);

        return decoded;
    }
}
