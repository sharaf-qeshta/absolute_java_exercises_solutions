package chapter_six;

import java.util.Arrays;

/**
 * 4. Write a program to document the marks of an additional value added course taught
 * to the students. The marks of the students cannot be negative and cannot be more
 * than 100 i.e. 0<=marks<=100. Create a class that should maintain the following
 * information about each student of the class.
 *  a. Student name
 *  b. Student ID
 *  c. Array of marks in five subjects
 *  Also, write a method called validateMarks that deletes all the marks less than zero
 * and greater than 100 from the array. When a value of marks is deleted, the
 * remaining marks are moved one position to fill in the gap. This creates empty positions
 * at the end of the array so that less of the array is used. For example, consider the
 * following given array:
 *  intarrMarks [] = new int[5];
 *  arrMarks [0] = 10;
 *  arrMarks [1] = –15;
 *  arrMarks [2] = 25;
 *  arrMarks [3] = 102;
 *  arrMarks [4] = 30;
 *  After execution of validateMarks, the value of arrMarks [0] is 10, the value of
 * arrMarks [1] is –15, the value of arrMarks [2] is 30, the value of arrMarks [3] is
 * 102 and the value of arrMarks [4] is 30 and the value of length is 5. (The value of
 * arrMarks [1] and arrMarks [3] is no longer of any concern, because the partially
 * filled array no longer uses this indexed variable). Write a suitable test program for
 * your method.
 *
 * @author Sharaf Qeshta*/



public class Exercise_06_04
{
    public static void main(String[] args)
    {
        int[] arrMarks  = new int[5];
        arrMarks [0] = 10;
        arrMarks [1] = -15;
        arrMarks [2] = 25;
        arrMarks [3] = 102;
        arrMarks [4] = 30;
        Student student = new Student("Sharaf Qeshta", "2", arrMarks);

        System.out.println(Arrays.toString(student.getMarks())); // [10, -15, 25, 102, 30]

        student.validateMarks();

        System.out.println(Arrays.toString(student.getMarks())); // [10, 25, 30, 0, 0]

    }
}
