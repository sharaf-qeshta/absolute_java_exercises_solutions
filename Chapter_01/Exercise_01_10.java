package chapter_one;

/**
 * 10. Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
 * lethal overdose. Write a program with a variable that holds the number of milligrams
 * of caffeine in a drink and outputs how many drinks it takes to kill a person.
 * A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
 * of coffee has approximately 160 mg of caffeine
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_01_10
{
    public static final int LETHAL_OVERDOSE = 10; // grams
    public static final int TWELVE_OZ_CAN_CONTAIN_CAFFEINE = 34; // mg
    public static final int SIXTEEN_OZ_CAN_CONTAIN_CAFFEINE = 160; // mg       
    public static void main(String[] args)
    {
        int mgToKillPerson = LETHAL_OVERDOSE * 1000;

        int sixteenOzCans = mgToKillPerson / SIXTEEN_OZ_CAN_CONTAIN_CAFFEINE;
        int twelveOzCans = (mgToKillPerson % SIXTEEN_OZ_CAN_CONTAIN_CAFFEINE) / TWELVE_OZ_CAN_CONTAIN_CAFFEINE;

        System.out.println("if you drink " + sixteenOzCans + " 16-oz cans and "
                + twelveOzCans + " 12-oz cans probably you will be die");



    }
}

