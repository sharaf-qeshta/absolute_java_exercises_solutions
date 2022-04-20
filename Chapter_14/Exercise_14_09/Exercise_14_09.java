package chapter_fourteen;

/**
 * 9. Use inheritance and classes to represent a deck of playing cards. Create a Card class
 * that stores the suit (e.g., Clubs, Diamonds, Hearts, Spades) and name (e.g., Ace, 2,
 * 10, Jack) of each card along with appropriate accessors, constructors, and mutators.
 *  Next, create a Deck class that stores an ArrayList of Card objects. The default
 * constructor should create objects that represent the standard 52 cards and store
 * them in the ArrayList. The Deck class should have methods to do the following:
 * • Print every card in the deck.
 * • Shuffle the cards in the deck. You can implement this by randomly swapping
 * every card in the deck.
 * • Add a new card to the deck. This method should take a Card object as a
 * parameter and add it to the ArrayList.
 * • Remove a card from the deck. This removes the first card stored in the ArrayList
 * and returns it.
 * • Sort the cards in the deck ordered by name.
 *  Next, create a Hand class that represents the cards in a hand. Hand should be
 *  derived from Deck. This is because a hand is like a more specialized version of a deck;
 * we can print, shuffle, add, remove, and sort cards in a hand just like cards in a deck.
 * The default constructor should set the hand to an empty set of cards.
 *  Finally, write a main method that creates a deck of cards, shuffles the deck, and
 * creates two hands of 5 cards each. The cards should be removed from the deck and
 * added to the hand. Test the sort and print functions for the hands and the deck.
 * Finally, return the cards in the hand to the deck and test to ensure that the cards
 * have been properly returned.
 *  You may add additional methods or class variables as desired to implement your
 * solution.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_14_09
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();

        /*
        * Clubs Ace
        * Clubs 2
        * Clubs 3
        * Clubs 4
        * Clubs 5
        * Clubs 6
        * Clubs 7
        * Clubs 8
        * Clubs 9
        * Clubs 10
        * Clubs Jack
        * Clubs Queen
        * Clubs King
        * Diamonds Ace
        * Diamonds 2
        * Diamonds 3
        * Diamonds 4
        * Diamonds 5
        * Diamonds 6
        * Diamonds 7
        * Diamonds 8
        * Diamonds 9
        * Diamonds 10
        * Diamonds Jack
        * Diamonds Queen
        * Diamonds King
        * Hearts Ace
        * Hearts 2
        * Hearts 3
        * Hearts 4
        * Hearts 5
        * Hearts 6
        * Hearts 7
        * Hearts 8
        * Hearts 9
        * Hearts 10
        * Hearts Jack
        * Hearts Queen
        * Hearts King
        * Spades Ace
        * Spades 2
        * Spades 3
        * Spades 4
        * Spades 5
        * Spades 6
        * Spades 7
        * Spades 8
        * Spades 9
        * Spades 10
        * Spades Jack
        * Spades Queen
        * Spades King
        * */
        deck.printCards();

        deck.shuffle();
        /*
        * Clubs 7
        * Clubs 8
        * Spades King
        * Hearts 6
        * Diamonds Ace
        * Hearts King
        * Diamonds 8
        * .
        * .
        * .
        * .
        * Clubs 10
        * Spades 2
        * Diamonds King
        * Hearts 3
        * Diamonds 9
        * Clubs 2
        * Diamonds 7
        * */
        deck.printCards();


        Hand hand1 = new Hand(5, deck);
        Hand hand2 = new Hand(5, deck);

        System.out.println(hand1.getCards().size()); // 5
        System.out.println(hand2.getCards().size()); // 5


        hand1.sort();

        /*
        * Hearts 6
        * Clubs 7
        * Clubs 8
        * Diamonds Ace
        * Spades King
        * */
        hand1.printCards();

        deck.sort();

        deck.printCards();
        System.out.println(deck.getCards().size()); // 42

        hand1.returnCards(5, deck);
        hand2.returnCards(5, deck);

        System.out.println(deck.getCards().size()); // 52
    }
}
