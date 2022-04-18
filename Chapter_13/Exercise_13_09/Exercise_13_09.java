package chapter_thirteen;

/**
 * 9. Redo the class Employee and the class HourlyEmployee in Displays 7.2 and 7.3
 * so that the class Date is an inner class of the class Employee and an inherited inner
 * class of the class HourlyEmployee. Also, do a suitable test program.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_13_09
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Sharaf Qeshta",
                new Employee.Date(8, 6, 2022));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("John Smith", new Employee.Date(5, 17, 2003),
                25.64, 50);

        hourlyEmployee.setHireDate(new Employee.Date(5, 5, 2010));

        /* Sharaf Qeshta August 6, 2022 */
        System.out.println(employee);
        /*
        * John Smith May 5, 2010
        * $25.64 per hour for 50.0 hours
        * */
        System.out.println(hourlyEmployee);
    }
}





