package chapter_one;

/**
 * 7. Write a program that outputs the number of hours, minutes, and seconds that
 * corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
 * and 51 seconds. Test your program with a different number of total seconds to
 * ensure that it works for other cases
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_01_07
{
    public static void main(String[] args)
    {
        int seconds = 50391;
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
