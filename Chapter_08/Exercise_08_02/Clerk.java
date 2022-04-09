package chapter_eight;

import java.util.Date;

public class Clerk extends Employee
{
    public double addBonus(){ return getSalary() + 100; }

    public void display()
    {
        display("Clerk");
    }


    public Clerk() {}

    public Clerk(String id, String name, String department,
                 double salary, Date designation)
    {
        super(id, name, department, salary, designation);
    }
}
