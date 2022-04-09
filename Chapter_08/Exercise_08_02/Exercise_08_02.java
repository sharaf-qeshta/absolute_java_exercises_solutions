package chapter_eight;

import java.util.Date;

/**
 * 2. Create a class named Employee that can be used to calculate the salaries of different
 * employees. The Employee class should keep a track of the employee ID, name,
 * department, salary, and designation with appropriate accessor and mutator methods.
 * Also create an equals() method that overrides Object’s equals() method,
 * where employees can check if their designation is identical. Next, create two
 * additional classes named Manager and Clerk that are derived from Employee. Create an
 * overridden method named addBonus that returns the salary of the employee after
 * adding up the bonus. There is a default bonus of $200/month. Managers have a
 * bonus of $300/month and clerks have a bonus of $100/month. Finally create a
 * display method to print the details of the employee. You may assume the initial salary
 * of an employee and other necessary values. Test your classes from a main method
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_02
{
    public static void main(String[] args) {
        Employee employee = new Employee("123", "Sharaf Qeshta",
                "Production", 20000, new Date());

        Employee manager = new Manager("124", "John Smith",
                "Production", 29000, new Date());

        Employee clerk = new Clerk("125", "John Smith",
                "Production", 25000, new Date());

        /* Employee ID: 123, Employee Name: Sharaf Qeshta, Employee Department: Production, EmployeeSalary: $20000.0, Employee Designation: Sat Apr 09 05:25:00 PDT 2022 */
        employee.display();

        /* Manager ID: 124, Manager Name: John Smith, Manager Department: Production, ManagerSalary: $29000.0, Manager Designation: Sat Apr 09 05:25:00 PDT 2022 */
        manager.display();

        /* Clerk ID: 125, Clerk Name: John Smith, Clerk Department: Production, ClerkSalary: $25000.0, Clerk Designation: Sat Apr 09 05:25:00 PDT 2022 */
        clerk.display();


        System.out.println(employee.addBonus()); // 20200.0
        System.out.println(manager.addBonus()); // 29300.0
        System.out.println(clerk.addBonus()); // 25100.0

    }
}
