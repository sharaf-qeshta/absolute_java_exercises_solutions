package chapter_eight;

import java.util.Date;

/**
 * 3. Extend the previous problem to calculate the salary deductions based on
 * the number of days an employee is on leave. Consider 20 working days per month. Add
 * a method that calculates the deductions of each employee based on their leave
 * record. In your main method, create an array of type deduction filled with sample
 * data of all types of Employees. Finally calculate the total deduction that iterates
 * through the array and returns the total amount of deductions of all the employees
 * in a month.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_03
{
    private static final Employee[] employees = new Employee[50];

    public static void main(String[] args)
    {
        double deduction = fillAndCalculate();
        /* Deduction For This Month is $100000.0 */
        System.out.println("Deduction For This Month is $" + deduction);
    }

    public static double fillAndCalculate()
    {
        double deduction = 0;
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = new Employee("123"+i, "Sharaf Qeshta",
                    "Production", 2000 * (i+1), new Date());

            for (int j = 0; j < 20; j++)
            {
                employees[i].leaves(j % 2 == 0); // random
                if (!employees[i].getDays()[j])
                    deduction += 200;
            }

        }
        return deduction;
    }
}
