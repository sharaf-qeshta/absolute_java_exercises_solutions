package chapter_four;

/**
 * 2. Define a class called CalAge. This class is used to calculate age of a person from her or
 * his date of birth and the current date. Include a mutator method that allows the user to
 * enter her or his date of birth and set the value for current date. Also include a method to
 * return the age in years and months (for example, 25.5 years) as a double value. Include
 * an additional method to check if the date of birth entered by the user is a valid one. For
 * example, 30 February 2008 is an invalid date. Embed your class in a test program.
 * 
 * @author Sharaf Qeshta
 * */

public class Exercise_04_02
{
    public static void main(String[] args)
    {
        CalAge.getInstance().setDate("2001-06-13", "2022-03-08");
        System.out.println(CalAge.getInstance().getYears()); // 20.75
        System.out.println(CalAge.getInstance().getMonths()); // 252.43
        System.out.println(CalAge.getInstance().getWeeks()); // 1081.86
        System.out.println(CalAge.getInstance().getDays()); // 7573
        System.out.println(CalAge.getInstance().getHours()); // 181752
        System.out.println(CalAge.getInstance().getMinutes()); // 10905120
        System.out.println(CalAge.getInstance().getSeconds()); // 654307200
    }
}
