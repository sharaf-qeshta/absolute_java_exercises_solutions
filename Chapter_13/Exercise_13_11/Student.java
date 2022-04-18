package chapter_thirteen;

public class Student implements Comparable<Student>
{
    private String lastName;
    private int id;

    public Student(String lastName, int id)
    {
        this.lastName = lastName;
        this.id = id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }


    @Override
    public int compareTo(Student o)
    {
        return getId() - o.getId();
    }

    public String toString()
    {
        return "Last Name: " + getLastName() + ", ID: " + getId();
    }
}
