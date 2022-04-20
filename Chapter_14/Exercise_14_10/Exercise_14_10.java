package chapter_fourteen;

import java.util.Scanner;

/**
 * 10. Do Programming Project 14.9 and extend the program to play blackjack, where
 * the computer plays the role of the house and the user is a single player playing
 * against the house. Use standard house rules for hitting or standing. Add more
 * methods as necessary to implement your program. For an additional challenge,
 * incorporate a betting component and additional blackjack rules, such as splitting
 * or insurance
 *
 * @author Sharaf Qeshta */


public class Exercise_14_10
{
    private static final Deck deck = new Deck();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        deck.shuffle(); // shuffle the deck
        Hand player = new Hand(2, deck); // give the player 2 cards
        Hand dealer = new Hand(2, deck); // give the dealer 2 cards

        while (true)
        {
            // player turn
            System.out.println("(Player) Your Cards: ");
            player.printCards();

            int playerCardsCount = getCardsSum(player);
            int dealerCardsCount = getCardsSum(dealer);
            if (playerCardsCount == 21 && dealerCardsCount != 21)
            {
                System.out.println("Player Won!!");
                break;
            }
            if(playerCardsCount == 21)
            {
                System.out.println("Tie!!");
                break;
            }

            System.out.print("(Player) (1) hit or (2) bust: ");
            try
            {
                int choice = scanner.nextInt();
                if (choice == 1)
                {
                    System.out.println("(Player) Hitting");
                    hit(player);
                }
                else
                {
                    System.out.println("(Player) Bust");
                    System.out.println("Dealer Won!!");
                    break;
                }

            }
            catch (Exception exception)
            {
                System.out.println("(Player) Invalid Value");
                continue;
            }

            // dealer turn
            int random = (int) ((Math.random() * 10) % 2);
            if (random == 1)
            {
                System.out.println("(Dealer) Hitting");
                hit(dealer);
            }
            else
            {
                System.out.println("(Dealer) Bust");
                System.out.println("Player Won!!");
                break;
            }

            playerCardsCount = getCardsSum(player);
            dealerCardsCount = getCardsSum(dealer);
            int player_close = Math.abs(playerCardsCount - 21);
            int dealer_close = Math.abs(dealerCardsCount - 21);

            if (player_close < dealer_close)
                System.out.println("Player Won!!");
            else
                System.out.println("Dealer Won!!");
            break;

        }

    }

    private static void hit(Hand hand)
    {
        hand.add(deck.remove());
        hand.add(deck.remove());
    }


    private static int getCardValue(String name)
    {
        try
        {
            return Integer.parseInt(name);
        }
        catch (Exception ex)
        {
            char x = name.charAt(0);
            return switch (x){
                case 'A' -> 1;
                case 'J' -> 11;
                case 'Q' -> 12;
                case 'K' -> 13;
                default -> 0; // unknown card
            };
        }
    }


    private static int getCardsSum(Hand hand)
    {
        int total = 0;
        for (Card card: hand.getCards())
            total += getCardValue(card.getName());

        return total;
    }

}
