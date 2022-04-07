package chapter_six;

public class Card
{
    private final int value;
    private boolean faceUp;

    public Card(int value, boolean faceUp)
    {
        this.value = value;
        this.faceUp = faceUp;
    }

    public void setFaceUp(boolean faceUp)
    {
        this.faceUp = faceUp;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isFaceUp()
    {
        return faceUp;
    }
}
