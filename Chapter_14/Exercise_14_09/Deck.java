package chapter_fourteen;

import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck()
    {
        // adding the default 52 cards
        for (int i = 0; i < Card.SUITS.length; i++)
        {
            for (int j = 0; j < Card.NAMES.length; j++)
            {
                cards.add(new Card(Card.SUITS[i], Card.NAMES[j]));
            }
        }
    }

    public Deck(int cardsNumber, Deck deck)
    {
        for (int i = 0; i < cardsNumber; i++)
            add(deck.remove());
    }

    /**
     * Print every card in the deck.
     * */
    public void printCards()
    {
        for (Card card: cards)
            System.out.println(card);
    }

    /**
     * Shuffle the cards in the deck. You can implement this by randomly swapping
     * every card in the deck.
     * */
    public void shuffle()
    {
        for (int i = 0; i < cards.size(); i++)
        {
            int index = (int) ((Math.random() * 10 * cards.size()) % cards.size());
            // interchange
            Card temp = cards.get(i);
            cards.set(i, cards.get(index));
            cards.set(index, temp);
        }
    }

    /**
     * Add a new card to the deck. This method should take a Card object as a
     * parameter and add it to the ArrayList
    */
    public void add(Card card)
    {
        cards.add(card);
    }


    /**
     * Remove a card from the deck. This removes the first card stored in the ArrayList
     * and returns it.
     * */
    public Card remove()
    {
        return (cards.isEmpty())? null : cards.remove(0);
    }


    /**
     * Sort the cards in the deck ordered by name.
     * @Algorithm Selection Sort
     * */
    public void sort()
    {
        for (int i = 0; i < cards.size(); i++)
        {
            int min = i;
            for (int j = i+1; j < cards.size(); j++)
            {
                if (cards.get(min).getName().compareTo(cards.get(j).getName()) > 0)
                    min = j;
            }
            Card temp = cards.get(i);
            cards.set(i, cards.get(min));
            cards.set(min, temp);
        }
    }

    public ArrayList<Card> getCards()
    {
        return cards;
    }
}
