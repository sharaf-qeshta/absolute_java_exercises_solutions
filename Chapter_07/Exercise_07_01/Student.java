package chapter_seven;

public class Student extends Person
{
    String id, course, teacherName;

    public Student(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName,
                   String id, String course,
                   String teacherName)
    {
        super(firstName, lastName);
        this.id = id;
        this.course = course;
        this.teacherName = teacherName;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Student Name: " + firstName + lastName
                + ", Student ID: " + id + ", Student Course: " + course
                + ", Student Teacher: " + teacherName);
    }


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }
}
