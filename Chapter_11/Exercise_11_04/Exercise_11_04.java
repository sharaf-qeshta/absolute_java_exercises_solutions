package chapter_eleven;


/**
 * 4. The game of “Jump It” consists of a board with n positive integers in a row except
 * for the first column, which always contains zero. These numbers represent the cost
 * to enter each column. Here is a sample game board where n is 6:
 * 0 3 80 6 57 10
 * The object of the game is to move from the first column to the last column in the
 * lowest total cost. The number in each column represents the cost to enter that
 * column. Always start the game in the first column and have two types of moves. You
 * can either move to the adjacent column or jump over the adjacent column to land
 * two columns over. The cost of a game is the sum of the costs of the visited columns.
 * In the board shown above, there are several ways to get to the end. Starting in the
 * first column, our cost so far is 0. We could jump to 80, then jump to 57, then
 * move to 10 for a total cost of 80 + 57 + 10 = 147. However, a cheaper path would
 * be to move to 3, jump to 6, then jump to 10, for a total cost of 3 + 6 + 10 = 19.
 * Write a recursive solution to this problem that computes the cheapest cost of the
 * game and outputs this value for an arbitrarily large game board represented as an
 * array. Your program does not have to output the actual sequence of jumps, only
 * the cheapest cost of this sequence. After making sure that your solution works on
 * small arrays, test your solution on boards of larger and larger values of n to get a
 * feel for how efficient and scalable your solution is.
 *
 * @author Sharaf Qeshta */

public class Exercise_11_04
{
    private static long minCost = Integer.MAX_VALUE;
    public static void main(String[] args)
    {
        int[] array = {0, 3, 80, 6, 57, 10};
        solve(array, 0, 0);
        System.out.println(minCost); // 19

        minCost = Integer.MAX_VALUE;

        array = new int[] {0, 80, 3, 57, 6, 10};
        solve(array, 0, 0);
        System.out.println(minCost); // 19

        minCost = Integer.MAX_VALUE;

        array = new int[] {0, 80, 12, 13, 22, 12, 15, 89, 52, 13, 90, 10};
        solve(array, 0, 0);
        System.out.println(minCost); // 124
    }


    public static void solve(int[] array, int currentStep, long cost)
    {
        if (currentStep == array.length-1)
            minCost = Math.min(cost, minCost);
        else
        {
            // jump
            int nextMove = currentStep+2;
            if (nextMove < array.length)
                solve(array, nextMove, cost+array[nextMove]);
            // move
            nextMove = currentStep+1;
            solve(array, nextMove, cost+array[nextMove]);
        }
    }

}
