package chapter_seven;

/**
 * 1. Define a class named Person that contains two instance variables of type String
 * that stores the first name and last name of a person and appropriate accessor and
 * mutator methods. Also create a method named displayDetails that outputs the
 * details of a person. Next, define a class named Student that is derived from Person,
 * the constructor for which should receive first name and last name from the class
 * Student and also assigns values to student id, course, and teacher name. This class
 * should redefine the displayDetails method to person details as well as details of
 * a student. Include appropriate constructor(s). Define a class named Teacher that
 * is derived from Person. This class should contain instance variables for the subject
 * name and salary. Include appropriate constructor(s). Finally, redefine the
 * displayDetails method to include all teacher information in the printout.
 * Create a main method that creates at least two student objects and two teacher
 * objects with different values and calls displayDetails for each.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_07_01
{
    public static void main(String[] args)
    {
        Person student1 = new Student("Sharaf", "Qeshta", "12345",
                "Mathematics", "John Smith");
        Person student2 = new Student("Noah", "Smith", "12345",
                "Physics", "Jack Smith");

        Person teacher1 = new Teacher("John", "Smith",
                "Mathematics", 20000);
        Person teacher2 = new Teacher("Jack", "Smith",
                "Physics", 22000);

        student1.displayDetails(); // Student Name: SharafQeshta, Student ID: 12345, Student Course: Mathematics, Student Teacher: John Smith
        student2.displayDetails(); // Student Name: NoahSmith, Student ID: 12345, Student Course: Physics, Student Teacher: Jack Smith

        teacher1.displayDetails(); // Teacher Name: John Smith, Teacher Subject: Mathematics, Teacher Salary: $20000.0
        teacher2.displayDetails(); // Teacher Name: Jack Smith, Teacher Subject: Physics, Teacher Salary: $22000.0
    }
}
