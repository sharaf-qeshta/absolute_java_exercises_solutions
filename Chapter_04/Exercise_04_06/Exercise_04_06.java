package chapter_four;

/**
 * 6. Write a grading program for a class with the following grading policies:
 *  a. There are three quizzes, each graded on the basis of 10 points.
 *  b. There is one midterm exam, graded on the basis of 100 points.
 *  c. There is one final exam, graded on the basis of 100 points.
 *  The final exam counts for 40% of the grade. The midterm counts for 35% of the
 * grade. The three quizzes together count for a total of 25% of the grade. (Do not
 * forget to convert the quiz scores to percentages before they are averaged in.)
 *  Any grade of 90 or more is an A, any grade of 80 or more (but less than 90) is a
 * B, any grade of 70 or more (but less than 80) is a C, any grade of 60 or more (but
 * less than 70) is a D, and any grade below 60 is an F. The program should read in
 * the student’s scores and output the student’s record, which consists of three quiz
 * scores and two exam scores, as well as the student’s overall numeric score for the
 * entire course and final letter grade.
 *  Define and use a class for the student record. The class should have instance variables
 *  for the quizzes, midterm, final, overall numeric score for the course, and
 * final letter grade. The overall numeric score is a number in the range 0 to 100,
 * which represents the weighted average of the student’s work. The class should have
 * methods to compute the overall numeric grade and the final letter grade. These last
 * methods should be void methods that set the appropriate instance variables. Your
 * class should have a reasonable set of accessor and mutator methods, an equals
 * method, and a toString method, whether or not your program uses them. You
 * may add other methods if you wish.
 * 
 * @author Sharaf Qeshta
 * */

public class Exercise_04_06
{
    public static void main(String[] args)
    {
        StudentRecord studentRecord = new StudentRecord();
        StudentRecord studentRecord2 = new StudentRecord(10, 10, 10, 100, 100);

        System.out.println(studentRecord); // StudentRecord{quiz1=8.0, quiz2=9.0, quiz3=10.0, Mid Exam=80.0, Final Exam=85.0, Final Score=84.5, Letter=B}
        System.out.println(studentRecord.equals(studentRecord2)); // true
        System.out.println(studentRecord.getScore()); // 100
        System.out.println(studentRecord.getLetter()); // A


    }
}
