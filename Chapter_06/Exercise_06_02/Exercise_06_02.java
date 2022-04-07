package chapter_six;

import java.util.Scanner;

/**
 * 2. A common memory matching game played by young children is to start with a
 * deck of cards that contain identical pairs. For example, given six cards in the deck,
 * two might be labeled 1, two labeled 2, and two labeled 3. The cards are shuffled
 * and placed face down on the table. A player then selects two cards that are face
 * down, turns them face up, and if the cards match, they are left face up. If the two
 * cards do not match, they are returned to their original face down position. The
 * game continues until all cards are face up.
 *  Write a program that plays the memory matching game. Use 16 cards that are laid
 * out in a 4  4 square and are labeled with pairs of numbers from 1 to 8. Your
 * program should allow the player to specify the cards that he or she would like to
 * select through a coordinate system.
 *  For example, in the following layout:
 *  1 2 3 4
 *  1 8 * * *
 *  2 * * * *
 *  3 * 8 * *
 *  4 * * * *
 *  all of the face down cards are indicated by *. The pairs of 8 that are face up are at
 * coordinates (1,1) and (2,3). To hide the cards that have been temporarily placed
 * face up, output a large number of newlines to force the old board off the screen.
 *  Hint: Use a 2D array for the arrangement of cards and another 2D array that
 * indicates if a card is face up or face down. Or, a more elegant solution is to create
 * a single 2D array where each element is an object that stores both the card’s value
 * and face. Write a function that “shuffles” the cards in the array by repeatedly selecting
 * two cards at random and swapping them.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_06_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Card[][] board = createBoard();

        while (!finish(board))
        {
            printBoard(board);
            System.out.print("\n Enter Coordinate: ");
            int i1 = scanner.nextInt(), j1 = scanner.nextInt();
            int i2 = scanner.nextInt(), j2 = scanner.nextInt();
            replace(board, i1-1, j1-1, i2-1, j2-1);
        }

    }


    public static void printBoard(Card[][] board)
    {
        System.out.println("\t1\t2\t3\t4");
        for (int i = 0; i < board.length; i++)
        {
            System.out.print(i+1 + "\t");
            for (int j = 0; j < board[i].length; j++)
            {
                String value = "*";
                if (board[i][j].isFaceUp())
                    value = board[i][j].getValue() + "";
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static Card[][] createBoard()
    {
        Card[][] board = new Card[4][4];
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
                board[i][j] = new Card((int) (((Math.random() * 100) % 8) + 1), false);
        }
        return board;
    }

    public static boolean finish(Card[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if (!board[i][j].isFaceUp())
                    return false;
            }
        }
        return true;
    }


    public static void replace(Card[][] board, int i1,
                               int j1, int i2, int j2)
    {
        if (i1 < 0 || i1 > 3 || j1 < 0 || j1 > 3
            || i2 < 0 || i2 > 3 || j2 < 0 || j2 > 3)
            return;
        if (board[i1][j1].isFaceUp() || board[i2][j2].isFaceUp())
            return;
        if (board[i1][j1].equals(board[i2][j2]))
            return;

        if (board[i1][j1].getValue() == board[i2][j2].getValue()){
            board[i1][j1].setFaceUp(true); board[i2][j2].setFaceUp(true);
            System.out.println(board[i1][j1].getValue() + " == " + board[i2][j2].getValue());
        }else
            System.out.println(board[i1][j1].getValue() + " != " + board[i2][j2].getValue());
    }
}
