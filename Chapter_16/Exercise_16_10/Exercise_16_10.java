package chapter_sixteen;

import java.util.*;

/**
 * 10. You have a list of student ID numbers followed by the course number (separated
 * by a space) that each student is enrolled in. The listing is in no particular order.
 * For example, if student 1 is in CS100 and CS200 while student 2 is in CS105 and
 * MATH210, then the list might look like this:
 *  1 CS100
 *  2 MATH210
 *  2 CS105
 *  1 CS200
 *  Write a program that reads data in this format from the console. If the ID number
 * is −1, then stop inputting data. Use the HashMap class to map from an Integer
 * (the student ID number) to an ArrayList of type String that holds each course
 * that the student is enrolled in. The declaration should look like this:
 *  HashMap<Integer, ArrayList<String>> students =
 *  new HashMap<Integer, ArrayList<String>>();
 *  After all the data is input, iterate through the map and output the student ID
 * number and all courses stored in the vector for that student. The result should be
 * a list of courses organized by student ID number.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_16_10
{
    public static final HashMap<Integer, ArrayList<String>> STUDENTS = new HashMap<>();

    public static void main(String[] args)
    {
        /*
        * Enter Data (-1 for id to Exit)
        * 1 CS100
        * 2 MATH210
        * 2 CS105
        * 1 CS200
        * -1 X
        * 1: [CS100, CS200]
        * 2: [MATH210, CS105]
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Data (-1 for id to Exit)");

        int id = scanner.nextInt();
        String course = scanner.next();

        while (id != -1)
        {
            if (STUDENTS.containsKey(id))
                STUDENTS.get(id).add(course);
            else
                STUDENTS.put(id, new ArrayList<>(Collections.singletonList(course)));
            id = scanner.nextInt();
            course = scanner.next();
        }

        STUDENTS.forEach((student, courses) ->
                System.out.println(student + ": " + courses));
    }
}
