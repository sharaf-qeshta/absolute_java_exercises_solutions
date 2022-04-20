package chapter_fourteen;

public class Card
{
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] NAMES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                                          "Jack", "Queen", "King"};
    private String suit, name;

    public Card(String suit, String name)
    {
        this.suit = suit;
        this.name = name;
    }

    public String getSuit()
    {
        return suit;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return suit + " " + name;
    }
}
