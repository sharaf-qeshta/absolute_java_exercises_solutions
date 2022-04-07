package chapter_six;

import java.util.Scanner;

/**
 * 10. Write a program to simulate a simple game using arrays. The program should
 * create a grid of stars using 2D arrays for the user to move in. When the program
 * is started, the user’s current position should be generated randomly in row and
 * column format. It should then ask the user for the movement selection, i.e., left,
 * right, up, and down. The program should then reprint the grid with the old location
 * of user replaced with a $ symbol and the new location with an N symbol. The
 * program displays the game positions as follows:
 *  * * *
 *  * * *
 *  * * *
 *  A sample grid configuration is
 *  * * *
 *  $ N *
 *  * * *
 *
 *
 * @author Sharaf Qeshta	
 *  */



public class Exercise_06_10
{
    private static char[][] board = new char[3][3];

    private static int currentColumn = (int) (Math.random() * 10 % 3);
    private static int currentRow = (int) (Math.random() * 10 % 3);

    private static int nextColumn = -1;
    private static int nextRow = -1;


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        fill();
        printBoard();
        while (true)
        {
            fill();
            System.out.print("Enter Move 1 -> right, 2 -> left, 3 -> up, 4 -> down: ");
            int movement = scanner.nextInt();

            move(movement);
            adjust();
            printBoard();
        }
    }

    public static void adjust()
    {
        if (nextRow != -1 && nextColumn != -1)
        {
            board[currentRow][currentColumn] = '$';
            board[nextRow][nextColumn] = 'N';

            currentRow = nextRow;
            currentColumn = nextColumn;

            nextRow = -1;
            nextColumn = -1; // unknown
        }
    }

    public static void fill()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                board[i][j] = '*';
            }
        }
    }


    public static void printBoard()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void move(int direction)
    {
        switch (direction)
        {
            case 1 :
            { // right
                if (currentColumn+1 < 3)
                {
                    nextColumn = currentColumn+1;
                    nextRow = currentRow;
                }
                else
                    System.out.println("Invalid Move!!");
                break;
            }
            case 2 :
            { // left
                if (currentColumn-1 > -1)
                {
                    nextColumn = currentColumn-1;
                    nextRow = currentRow;
                }
                else
                    System.out.println("Invalid Move!!");
                break;
            }
            case 3 :
            { // up
                if (currentRow-1 > -1)
                {
                    nextRow = currentRow-1;
                    nextColumn = currentColumn;
                }
                else
                    System.out.println("Invalid Move!!");
                break;
            }
            case 4 :
            { // down
                if (currentRow+1 < 3)
                {
                    nextRow = currentRow+1;
                    nextColumn = currentColumn;
                }
                else
                    System.out.println("Invalid Move!!");
                break;
            }
            default:
                System.out.println("Invalid Number!!");
        }
    }
}
