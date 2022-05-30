package chapter_nineteen;

/**
 * 3. Write a program to simulate a buzzer. The program should make use of the Thread
 * class. Create a class named Buzzer that extends the Thread class. Create an interface
 * named MonitorTime which contains a method setBuzzerTime(). Your
 * Buzzer class should implement this interface. Override setBuzzerTime() method
 * to set the buzzer time delay in milliseconds and the number of times the buzzer
 * should be repeated. Also, include methods blowBuzzer to start the buzzer.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_19_03
{
    public static void main(String[] args)
    {
        Buzzer buzzer = new Buzzer();
        buzzer.setBuzzerTime(1000); // second
        buzzer.setBuzzerLoop(10);
        buzzer.blowBuzzer();
    }
}
