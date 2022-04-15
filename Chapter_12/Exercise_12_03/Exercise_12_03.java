package chapter_twelve;


/**
 * 3. The UML diagram below shows the relationship between four classes. Implement
 * the classes in a test program that creates instances of CreditCard, Cash, and
 * Check. Output the string description of each. Note that the italicized Payment
 * class indicates that this is an abstract class. The word “in” means the parameter is
 * used to deliver data to the method
 *
 * @author Sharaf Qeshta */


public class Exercise_12_03
{
    public static void main(String[] args)
    {
        Payment cash = new Cash(100.25);
        Payment check = new Check(500.36, "123415", "Sharaf Qeshta");
        Payment creditCard = new CreditCard(1250.32, "2022/6/6",
                "Sharaf Qeshta", "123456");

        /* Amount: $100.25, Method: Cash */
        System.out.println(cash);
        /* Amount: $500.36, Method: Check, Routing Number: 123415, Name: Sharaf Qeshta */
        System.out.println(check);
        /* Amount: $1250.32, Method: Credit Card, Expiration: 2022/6/6, Name: Sharaf Qeshta, Number: 123456 */
        System.out.println(creditCard);
    }
}
