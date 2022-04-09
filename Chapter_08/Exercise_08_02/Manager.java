package chapter_eight;

import java.util.Date;

public class Manager extends Employee
{
    public double addBonus(){ return getSalary() + 300; }

    public void display()
    {
       display("Manager");
    }

    public Manager() {}

    public Manager(String id, String name,
                   String department, double salary, Date designation)
    {
        super(id, name, department, salary, designation);
    }
}
