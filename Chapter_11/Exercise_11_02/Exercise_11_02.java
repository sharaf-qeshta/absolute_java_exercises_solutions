package chapter_eleven;


/**
 * 2. There are n people in a room, where n is an integer greater than or equal to 1. Each
 * person shakes hands once with every other person. What is the total number, h(n),
 * of handshakes? Write a recursive function to solve this problem. To get you started,
 * if there are only one or two people in the room, then
 * handshake(1) = 0
 * handshake(2) = 1
 * If a third person enters the room, he or she must shake hands with each of the
 * two people already there. This is two handshakes in addition to the number
 * of handshakes that would be made in a room of two people, or a total of three
 * handshakes.
 * If a fourth person enters the room, he or she must shake hands with each of the
 * three people already present. This is three handshakes in addition to the number
 * of handshakes that would be made in a room of three people, or six handshakes.
 * If you can generalize this to n handshakes, then it should help you write the
 * recursive solution.
 *
 * @author Sharaf Qeshta */

public class Exercise_11_02
{
    public static void main(String[] args)
    {
        System.out.println(handshakes(1)); // 0
        System.out.println(handshakes(2)); // 1
        System.out.println(handshakes(3)); // 3
        System.out.println(handshakes(4)); // 6
        System.out.println(handshakes(5)); // 10
    }


    public static int handshakes(int n)
    {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        return handshakes(n-1) + (n-1);
    }

}
