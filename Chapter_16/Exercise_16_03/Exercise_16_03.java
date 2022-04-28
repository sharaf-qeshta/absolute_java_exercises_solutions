package chapter_sixteen;


import java.util.HashSet;

/**
 * 3. The birthday paradox is that there is a surprisingly high probability that two or
 * more people in the same room happen to share the same birthday. By birthday,
 * we mean the same day of the year (ignoring leap years), but not the exact birthday
 * that includes the birth year or time of day. Write a program that approximates the
 * probability that 2 or more people in the same room have the same birthday, for
 * 2 to 50 people in the room.
 *  The program should use simulation to approximate the answer. Over many trials
 * (say, 5,000), randomly assign birthdays (i.e., a number from 1–365) to everyone
 * in the room. Use a HashSet to store the birthdays. As the birthdays are randomly
 * generated, use the contains method of a HashSet to see if someone with the same
 * birthday is already in the room. If so, increment a counter that tracks how many
 * times at least two people have the same birthday and then move on to the next trial.
 * After the trials are over, divide the counter by the number of trials to get an estimated
 * probability that two or more people share the same birthday for a given room size.
 *  Your output should look something like the following. It will not be exactly the
 * same due to the random numbers:
 *  For 2 people, the probability of two birthdays is about 0.002
 *  For 3 people, the probability of two birthdays is about 0.0082
 *  For 4 people, the probability of two birthdays is about 0.0163
 *  ...
 *  For 49 people, the probability of two birthdays is about 0.9654
 *  For 50 people, the probability of two birthdays is about 0.969
 *
 *  @author Sharaf Qeshta
 *  */


public class Exercise_16_03
{
    public static final int TRIALS = 5_000;
    public static void main(String[] args)
    {
        /*
        * For 2 people, the probability of two birthdays is about 0.0038
        * For 3 people, the probability of two birthdays is about 0.0084
        * For 4 people, the probability of two birthdays is about 0.0196
        * For 5 people, the probability of two birthdays is about 0.0264
        * ....
        * For 47 people, the probability of two birthdays is about 0.9558
        * For 48 people, the probability of two birthdays is about 0.9574
        * For 49 people, the probability of two birthdays is about 0.9662
        * For 50 people, the probability of two birthdays is about 0.9726
        * */


        for (int i = 2; i < 51; i++)
            printProbability(i);
    }

    public static void printProbability(int people)
    {
        double sameBirthday = 0;
        for (int i = 0; i < TRIALS; i++)
        {
            HashSet<Integer> birthdays = new HashSet<>();
            for (int j = 0; j < people; j++)
            {
                int birthday = (int) ((Math.random() * 1000) % 365);
                if (birthdays.contains(birthday))
                {
                    sameBirthday++;
                    break;
                }
                else
                    birthdays.add(birthday);
            }
        }

        System.out.println("For " + people +  " people, the probability of two birthdays is about " + (sameBirthday/TRIALS));
    }
}
