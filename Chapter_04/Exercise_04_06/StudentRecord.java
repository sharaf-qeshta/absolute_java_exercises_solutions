package chapter_four;

import java.util.Locale;
import java.util.Scanner;

public class StudentRecord
{
    private double q1, q2, q3, midExam, finalExam;
    private double score;
    private char letter;

    public StudentRecord(double q1, double q2, double q3,
                         double midExam, double finalExam)
    {
        setQ1(q1);
        setQ2(q2);
        setQ3(q3);
        setMidExam(midExam);
        setFinalExam(finalExam);
    }


    public StudentRecord()
    {
        readFromKeyboard();
    }



    public void readFromKeyboard()
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter quiz 1 grade (0-10): ");
        double quiz1 = scanner.nextDouble();
        setQ1(quiz1);

        System.out.print("Enter quiz 2 grade (0-10): ");
        double quiz2 = scanner.nextDouble();
        setQ2(quiz2);

        System.out.print("Enter quiz 3 grade (0-10): ");
        double quiz3 = scanner.nextDouble();
        setQ3(quiz3);

        System.out.print("Enter the mid term grade (0-100): ");
        double mid = scanner.nextDouble();
        setMidExam(mid);

        System.out.print("Enter the final term grade (0-100): ");
        double finalTerm = scanner.nextDouble();
        setFinalExam(finalTerm);
        scanner.close();
        System.out.println();
    }


    public void computeDegree()
    {
        double quizzes = ((q1 * 10) + (q2 * 10) + (q3 * 10)) / 12;
        double finalExamPercentage = finalExam / 2.5;
        double midExamPercentage = midExam / (20/7.0);
        score = quizzes + finalExamPercentage + midExamPercentage;
    }

    public void assignLetter()
    {
        if (score > 90)
            letter = 'A';
        else if (score > 80)
            letter = 'B';
        else if (score > 70)
            letter = 'C';
        else if (score > 60)
            letter = 'D';
        else
            letter = 'F';
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "quiz1=" + getQ1() +
                ", quiz2=" + getQ2() +
                ", quiz3=" + getQ3() +
                ", Mid Exam=" + getMidExam() +
                ", Final Exam=" + getFinalExam() +
                ", Final Score=" + getScore() +
                ", Letter=" + getLetter() +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof StudentRecord)
            return getScore() - ((StudentRecord) o).getScore() < 0.000001; // double comparison
        return false;
    }


    public double getQ1()
    {
        return q1;
    }

    public double getQ2() {
        return q2;
    }

    public double getQ3() {
        return q3;
    }

    public double getMidExam() {
        return midExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public double getScore() {
        computeDegree();
        return score;
    }

    public char getLetter() {
        assignLetter();
        return letter;
    }


    public void setQ1(double q1) {
        if (q1 > -1 & q1 < 11)
            this.q1 = q1;
    }

    public void setQ2(double q2) {
        if (q2 > -1 & q2 < 11)
            this.q2 = q2;
    }

    public void setQ3(double q3) {
        if (q3 > -1 & q3 < 11)
            this.q3 = q3;
    }

    public void setMidExam(double midExam) {
        if (midExam > -1 & midExam < 101)
            this.midExam = midExam;
    }

    public void setFinalExam(double finalExam) {
        if (finalExam > -1 & finalExam < 101)
            this.finalExam = finalExam;
    }
}
