package chapter_seven;

public class Teacher extends Person
{
    String subjectName;
    double salary;

    public Teacher(String firstName, String lastName)
    {
        super(firstName, lastName);
    }


    public Teacher(String firstName, String lastName,
                   String subjectName, double salary)
    {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }


    @Override
    public void displayDetails()
    {
        System.out.println("Teacher Name: " + firstName + " " + lastName
                + ", Teacher Subject: " + subjectName
                + ", Teacher Salary: $" + salary);
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
