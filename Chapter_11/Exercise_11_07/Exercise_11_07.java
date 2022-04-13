package chapter_eleven;

/**
 * 7. Towers of Hanoi. There is a story about Buddhist monks who are playing this
 * puzzle with 64 stone disks. The story claims that when the monks finish moving
 * the disks from one post to a second via the third post, time will end.
 * A stack of n disks of decreasing size (from bottom to top) is placed on one of three
 * posts. The task is to move the disks one at a time from the first post to the second.
 * To do this, any disk can be moved from any post to any other post, subject to the
 * rule that you can never place a larger disk over a smaller disk. The (spare) third
 * post is provided to make the solution possible. Your task is to write a recursive
 * static method that gives instructions for a solution to this problem. We do not
 * want to bother with graphics, so you should output a sequence of instructions
 * that will solve the problem. The number of disks is a parameter to the method.
 * Hint: If you could move up n–1 of the disks from the first post to the third post
 * using the second post as a spare, the last disk could be moved from the first post
 * to the second post. Then, by using the same technique (whatever that may be),
 * you can move the n–1 disks from the third post to the second post, using the
 * first disk as a spare. There! You have the puzzle solved. You have only to decide
 * what the nonrecursive case is, what the recursive case is, and when to output
 * instructions to move the disks.
 *
 * @author Sharaf Qeshta */

public class Exercise_11_07
{
    public static void main(String[] args)
    {
        /*
        * Move disk 1 From Post A To Post C
        * Move disk 2 From Post A To Post B
        * Move disk 1 From Post C To Post B
        * Move disk 3 From Post A To Post C
        * Move disk 1 From Post B To Post A
        * Move disk 2 From Post B To Post C
        * Move disk 1 From Post A To Post C
        * */
        move(3, "A", "C", "B");
    }

    public static void move(int n, String a, String b, String c)
    {
        if (n == 0)
            return;
        move(n-1, a, c, b);
        System.out.println("Move disk " + n + " From Post " + a + " To Post " + b);
        move(n-1, c, b, a);
    }



}
