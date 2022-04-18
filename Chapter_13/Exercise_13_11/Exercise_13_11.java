package chapter_thirteen;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 11. Create a Student class that has instance variables for the student’s last name and
 * ID number, along with appropriate constructors, accessors, and mutators. Make the
 * Student class implement the Comparable interface. Define the compareTo method
 * to order Student objects based on the student ID number. In the main method,
 * create an array of at least five Student objects, sort them using Arrays.sort, and
 * output the students. They should be listed by ascending student number. Next,
 * modify the compareTo method so it orders Student objects based on the
 * lexicographic ordering of their last name. Without modification to the main method, the
 * program should now output the students ordered by name.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_13_11
{
    public static void main(String[] args)
    {
        Student[] students =
        {
          new Student("SMITH", 5),
          new Student("JOHNSON", 7),
          new Student("WILLIAMS", 1),
          new Student("BROWN", 9),
          new Student("JONES", 2),
        };

        Arrays.sort(students); // based on their id

        /* [Last Name: WILLIAMS, ID: 1, Last Name: JONES, ID: 2, Last Name: SMITH, ID: 5, Last Name: JOHNSON, ID: 7, Last Name: BROWN, ID: 9] */
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, Comparator.comparing(Student::getLastName)); // lexicographic ordering

        /* [Last Name: BROWN, ID: 9, Last Name: JOHNSON, ID: 7, Last Name: JONES, ID: 2, Last Name: SMITH, ID: 5, Last Name: WILLIAMS, ID: 1] */
        System.out.println(Arrays.toString(students));
    }
}





