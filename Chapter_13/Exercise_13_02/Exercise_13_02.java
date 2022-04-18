package chapter_thirteen;

/**
 * 2. Listed next is the skeleton for a class named City. Each city has a name and temperature:
 * class City
 * {
 * private String cityName;
 * private double temperature;
 * }
 *  Flesh out the class with appropriate accessors, constructors, and mutators.
 *  The temperatures are assigned by you and can be set from outside the City class—your
 *  code does not have to ensure that they are unique. Next, modify the class so that
 * it implements the Comparable interface. The class also overrides the compareTo
 * method. This method imposes an order between instances of the City class
 * depending upon their temperature. Test your class by creating an array of sample
 * temperatures and sort them in an ascending order using a sorting method that takes
 * as input an array of type Comparable.
 *
 * @author Sharaf Qeshta */

public class Exercise_13_02
{
    public static void main(String[] args)
    {
        City losAngeles = new City("Los Angeles", 25);
        City houston = new City("Houston", 28);
        City newYork = new City("New York", 22);
        City boston = new City("Boston", 19);

        City[] cities = {losAngeles, houston, newYork, boston};
        bubbleSort(cities);

        /*
        * City: Boston, Temperature: 19.0
        * City: New York, Temperature: 22.0
        * City: Los Angeles, Temperature: 25.0
        * City: Houston, Temperature: 28.0
        * */
        for (int i = 0; i < cities.length; i++)
            System.out.println(cities[i]);
    }

    public static void bubbleSort(Comparable[] array)
    {
        boolean needNextPass = true;
        while (needNextPass)
        {
            needNextPass = false;
            for (int i = 0; i < array.length-1; i++)
            {
                if (array[i].compareTo(array[i+1]) > 0)
                {
                    Comparable temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

}





