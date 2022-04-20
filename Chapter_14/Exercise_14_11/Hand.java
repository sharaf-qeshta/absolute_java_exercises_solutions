package chapter_fourteen;

public class Hand extends Deck
{
    private int bet = 0;

    public Hand(int cardsNumber, Deck deck)
    {
        super(cardsNumber, deck);
    }

    public void returnCards(int cardsNumber, Deck deck)
    {
        for (int i = 0; i < cardsNumber; i++)
            deck.add(remove());
    }

    public void setBet(int bet)
    {
        this.bet = bet;
    }

    public int getBet()
    {
        return bet;
    }
}
