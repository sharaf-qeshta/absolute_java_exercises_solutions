package chapter_fourteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 11. Do Programming Project 14.9 and extend the program to play five-card stud poker
 * between two hands. Add more methods as necessary to implement your program.
 * For an additional challenge, incorporate a betting component.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_14_11
{
    private static int totalBet = 0;
    private static final Deck deck = new Deck();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        deck.shuffle();
        Hand player1 = new Hand(2, deck); // one face down and once face up
        Hand player2 = new Hand(2, deck); // one face down and once face up

        setBet("Player 1 Initial", player1);
        setBet("Player 2 Initial", player2);

        System.out.println("(Game) Total Bet: " + totalBet);
        int i = 0;
        while (i < 3)
        {
            i++;
            Card card = deck.remove();
            player1.add(card);
            System.out.println("(Player 1) New Card " + card);

            card = deck.remove();
            player2.add(card);
            System.out.println("(Player 2) New Card " + card);


            setBet("(Player 1)", player1);
            setBet("(Player 2)", player2);
        }
        int player1_level = getBestHand(player1);
        int player2_level = getBestHand(player2);

        if (player1_level < player2_level)
        {
            System.out.println("(Game) Player 1 Win");
            player1.setBet(player2.getBet() + player1.getBet());
            player2.setBet(0);
        }
        else if (player1_level > player2_level)
        {
            System.out.println("(Game) Player 2 Win");
            player2.setBet(player2.getBet() + player1.getBet());
            player1.setBet(0);
        }
        else
            System.out.println("(Game) Tie");

        System.out.println("(Player 1) Cards: ");
        player1.printCards();

        System.out.println("\n(Player 2) Cards");
        player2.printCards();

        System.out.println("Player 1 Gain $" + player1.getBet());
        System.out.println("Player 2 Gain $" + player2.getBet());
    }

    public static void setBet(String keyword, Hand hand)
    {
        System.out.print("(" + keyword + ") Bet: ");
        int bet = scanner.nextInt();
        hand.setBet(hand.getBet() + bet);
        totalBet += hand.getBet();
    }

    public static int getBestHand(Hand hand)
    {
        // Royal Flush
        ArrayList<String> royalGroup = new ArrayList<>(Arrays.asList("Ace", "Jack", "King", "Queen"));
        ArrayList<String> royalTest = new ArrayList<>(Arrays.asList("Ace", "Jack", "King", "Queen"));

        String suit = hand.getCards().get(0).getSuit();
        boolean royalFlush = true;
        for (Card card: hand.getCards())
        {
            royalTest.add(card.getName());
            if (!(suit.equals(card.getSuit())))
            {
                royalFlush = false;
                break;
            }
        }

        if (royalFlush)
        {
            if (royalGroup.equals(royalTest))
                return 0;
        }

        // Straight Flush
        suit = hand.getCards().get(0).getSuit();
        int number = getCardNumber(hand.getCards().get(0).getName());
        boolean straightFlush = true;
        for (int i = 1; i < hand.getCards().size(); i++)
        {
            Card card = hand.getCards().get(i);
            if (number+1 != getCardNumber(card.getName()))
            {
                straightFlush = false;
                break;
            }
            number += 1;
            if (!(suit.equals(card.getSuit())))
            {
                straightFlush = false;
                break;
            }
        }

        if (straightFlush)
            return 1;

        // Four of a Kind
        number = getCardNumber(hand.getCards().get(0).getName());
        int number2 = getCardNumber(hand.getCards().get(1).getName());

        if (number != number2)
        {
            int number3 = getCardNumber(hand.getCards().get(2).getName());
            if (number2 == number3)
                number = number2;
        }
        int occurrences = 0;
        for (int i = 0; i < hand.getCards().size(); i++)
        {
            int cardNumber = getCardNumber(hand.getCards().get(i).getName());
            if (cardNumber == number)
                occurrences++;
        }

        if (occurrences == 4)
            return 2;

        // Full House
        boolean two = false;
        boolean three = false;
        for (int i = 0; i < hand.getCards().size(); i++)
        {
            int x = 0;
            int cardNumber = getCardNumber(hand.getCards().get(i).getName());
            for (int j = 0; j < hand.getCards().size(); j++)
            {
                if (cardNumber == getCardNumber(hand.getCards().get(j).getName()))
                    x++;
            }
            if (two && three)
                return 3;
            if (x == 3)
                three = true;
            if (x == 2)
                two = true;
        }

        // Flush
        boolean sameSuit = true;
        String suit_ = hand.getCards().get(0).getSuit();
        for (int i = 1; i < hand.getCards().size(); i++)
        {
            if (!suit_.equals(hand.getCards().get(i).getSuit()))
            {
                sameSuit = false;
                break;
            }
        }
        if (sameSuit)
            return 4;

        // Straight
        number = getCardNumber(hand.getCards().get(0).getName());
        boolean straight = true;
        for (int i = 1; i < hand.getCards().size(); i++)
        {
            Card card = hand.getCards().get(i);
            if (number+1 != getCardNumber(card.getName()))
            {
                straight = false;
                break;
            }
        }
        if (straight)
            return 5;

        // Three of a Kind
        for (int i = 0; i < hand.getCards().size(); i++)
        {
            int x = 0;
            int cardNumber = getCardNumber(hand.getCards().get(i).getName());
            for (int j = 0; j < hand.getCards().size(); j++)
            {
                if (cardNumber == getCardNumber(hand.getCards().get(j).getName()))
                    x++;
            }
            if (x == 3)
                return 6;
        }


        // Two Pairs
        int pairs = 0;
        for (int i = 0; i < hand.getCards().size(); i++)
        {
            int x = 0;
            int cardNumber = getCardNumber(hand.getCards().get(i).getName());
            for (int j = 0; j < hand.getCards().size(); j++)
            {
                if (cardNumber == getCardNumber(hand.getCards().get(j).getName()) && i != j)
                    x++;
            }
            if (x == 1)
                pairs++;
        }
        if (pairs == 4)
            return 7;

        // One Pair
        pairs = 0;
        for (int i = 0; i < hand.getCards().size(); i++)
        {
            int x = 0;
            int cardNumber = getCardNumber(hand.getCards().get(i).getName());
            for (int j = 0; j < hand.getCards().size(); j++)
            {
                if (cardNumber == getCardNumber(hand.getCards().get(j).getName()) && i != j)
                    x++;
            }
            if (x == 1)
                pairs++;
        }
        if (pairs == 2)
            return 8;
        return 9;
    }


    public static int getCardNumber(String name)
    {
        try
        {
            return Integer.parseInt(name);
        }
        catch (Exception exception)
        {
            char x = name.charAt(0);
            return switch (x)
            {
                case 'A' -> 1;
                case 'J' -> 11;
                case 'Q' -> 12;
                case 'K' -> 13;
                default -> 0;
            };
        }
    }


}


