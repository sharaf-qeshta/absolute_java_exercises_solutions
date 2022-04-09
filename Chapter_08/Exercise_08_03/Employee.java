package chapter_eight;

import java.util.Date;

public class Employee
{
    private String id, name, department;
    private double salary;
    private Date designation;
    private boolean[] days = new boolean[20];
    private int index = 0;


    public void leaves(boolean status)
    {
        days[index++] = status;

        if (status)
            salary -= 200;
    }


    public Employee()
    {
        id = ""; name = "No Name Yet!";
        department = "No Department Yet!";
        designation = new Date();
    }

    public Employee(String id, String name,
                    String department, double salary,
                    Date designation)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public double addBonus(){ return salary + 200; }

    public boolean equals(Employee other)
    {
        return other.getDesignation().equals(designation);
    }

    public void display(String key)
    {
        System.out.println(key + " ID: " + id
        + ", " + key + " Name: " + name
                + ", " + key + " Department: "
                + department + ", " + key
                + "Salary: $" + salary + ", "
                + key + " Designation: " + designation);
    }


    public void display()
    {
        display("Employee");
    }


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Date getDesignation()
    {
        return designation;
    }

    public void setDesignation(Date designation)
    {
        this.designation = designation;
    }


    public boolean[] getDays()
    {
        return days;
    }
}
