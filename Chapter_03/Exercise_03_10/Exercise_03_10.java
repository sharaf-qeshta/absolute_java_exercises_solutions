package chapter_three;


/**
 * 10. The game of Pig is a simple two-player dice game in which the first player to
 * reach 100 or more points wins. Players take turns. On each turn, a player rolls a
 * six-sided die:
 *  • If the player rolls a 1, then the player gets no new points and it becomes the other
 * player’s turn.
 *  • If the player rolls 2 through 6, then he or she can either
 *  • ROLL AGAIN or
 *  • HOLD. At this point, the sum of all rolls is added to the player’s score, and it
 * becomes the other player’s turn.
 *  Write a program that plays the game of Pig, where one player is a human and the
 * other is the computer. When it is the human’s turn, the program should show the
 * score of both players and the previous roll. Allow the human to input “r” to roll
 * again or “h” to hold.
 *  The computer program should play according to the following rule:
 *  • Keep rolling when it is the computer’s turn until it has accumulated 20 or
 * more points, then hold. If the computer wins or rolls a 1, then the turn ends
 * immediately.
 *  Allow the human to roll first.
 *
 * @author Sharaf Qeshta
 *  */


import java.util.Scanner;

public class Exercise_03_10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int computerScores = 0, humanScores = 0;

        int scoresInTurn = 0;
        boolean turn = true; // player, false for computer

        while (computerScores < 100 && humanScores < 100)
        {
            String player;
            if (turn){
                player = "Human";
                System.out.print("(" + player + ") " + "insert action r(roll): ");
                String action = scanner.next();

                if (action.equalsIgnoreCase("r")){
                    int roll = (int) (((Math.random() * 10) % 6) + 1); // 1..6
                    System.out.println("(" + player + ") " + "dice rolled : " + roll);

                    if (roll == 1){
                        System.out.println("(" + player + ") " + "No Points added");
                        System.out.println("(" + player + ") " + "Human Points " + humanScores + ", Computer Points " + computerScores);
                        turn = false;
                    }else {
                        scoresInTurn += roll;
                        while (true){
                            System.out.print("(" + player + ") " + "insert action r(roll), h(hold) : ");
                            action = scanner.next();

                            if (action.equalsIgnoreCase("r")) {
                                roll = (int) (((Math.random() * 10) % 6) + 1);
                                if (roll == 1){
                                    System.out.println("(" + player + ") " + "dice rolled : " + roll);
                                    System.out.println("(" + player + ") " + "No Points added");
                                    System.out.println("(" + player + ") " + "Human Points " + humanScores + ", Computer Points " + computerScores);
                                    turn = false;
                                    scoresInTurn = 0;
                                    break;
                                }else {
                                    System.out.println("(" + player + ") " + "dice rolled : " + roll);
                                    scoresInTurn += roll;
                                }
                            }else{
                                System.out.println("(" + player + ") " + scoresInTurn + " added to " + player);
                                humanScores += scoresInTurn;
                                turn = false;
                                System.out.println("(" + player + ") " + "Human Points " + humanScores + ", Computer Points " + computerScores);
                                scoresInTurn = 0;
                                break;
                            }
                        }
                    }
                }
            }else {
                player = "Computer";
                System.out.println("(" + player + ") " + "insert action r(roll): r");
                int roll = (int) (((Math.random() * 10) % 6) + 1); // 1..6
                System.out.println("(" + player + ") " + "dice rolled : " + roll);
                if (roll == 1) {
                    System.out.println("(" + player + ") " + "No Points added");
                    System.out.println("(" + player + ") " + "Human Points " + humanScores + ", Computer Points " + computerScores);
                    turn = true;
                }else {
                    scoresInTurn += roll;
                    while (scoresInTurn < 20){
                        System.out.println("(" + player + ") " + "insert action r(roll), h(hold) : r");
                        roll = (int) (((Math.random() * 10) % 6) + 1);
                        if (roll == 1) {
                            System.out.println("(" + player + ") " + "dice rolled : " + roll);
                            System.out.println("(" + player + ") " + "No Points added");
                            System.out.println("(" + player + ") " + "Human Points " + humanScores + ", Computer Points " + computerScores);
                            turn = true;
                            scoresInTurn = 0;
                            break;
                        }else {
                            System.out.println("(" + player + ") " + "dice rolled : " + roll);
                            scoresInTurn += roll;
                        }
                    }

                    System.out.println("(" + player + ") " + scoresInTurn + " added to " + player);
                    computerScores += scoresInTurn;
                    turn = !turn;
                    System.out.println("(" + player + ") " + "Human Points " + humanScores + ", Computer Points " + computerScores);
                    scoresInTurn = 0;
                }
            }
        }

        System.out.println("\n\n\n\n(Game) Human Points " + humanScores + ", Computer Points " + computerScores);
        System.out.println(((humanScores > computerScores)? "Human": "Computer") + "Won" );
    }
}
