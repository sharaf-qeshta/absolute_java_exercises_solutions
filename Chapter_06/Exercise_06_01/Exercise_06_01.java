package chapter_six;

/**
 * 1. You are running a courier agency. The weight of a parcel determines the number
 * of stamps that will be needed to send that parcel. For each kilogram, a stamp of
 * $2 is needed. Create a class to accept the weight of five parcels in floating-point
 * values. Also, the courier company charges an additional rate depending on where
 * the courier has to be delivered. The charges are $20 for delivery within the city
 * of posting, and $40 for delivery anywhere else in the country. Write a computer
 * program to calculate and display the total cost of each parcel depending on the
 * weight and delivery location of the parcel.
 *
 * @author Sharaf Qeshta*/
public class Exercise_06_01
{
    public static void main(String[] args)
    {
        double[] parcels = {10.5, 15.6, 9.8, 16.6, 59.5};
        boolean[] inside = {true, false, true, true, false};
        CourierAgency agency = new CourierAgency(parcels, inside);

        System.out.println(agency.getFees()); // 364.0
        System.out.println(agency.getFee(0)); // 41.0
        System.out.println(agency.getFee(1)); // 71.2
        System.out.println(agency.getFee(2)); // 39.6
        System.out.println(agency.getFee(3)); // 53.2
        System.out.println(agency.getFee(4)); // 159.0

    }
}
