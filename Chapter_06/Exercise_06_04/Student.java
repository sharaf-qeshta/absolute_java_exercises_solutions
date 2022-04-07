package chapter_six;

public class Student
{
    private final String studentName;
    private final String studentID;
    private int[] marks;

    public Student(String studentName, String studentID, int[] marks)
    {
        this.studentName = studentName;
        this.studentID = studentID;
        this.marks = marks;
    }


    public void validateMarks()
    {
        int[] newArr = new int[marks.length];
        int index = 0;
        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] > 0 && marks[i] <= 100)
            {
                newArr[index++] = marks[i];
            }
        }
        marks = newArr;
    }


    public String getStudentName()
    {
        return studentName;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public int[] getMarks()
    {
        return marks;
    }
}
