package chapter_twelve;


/**
 * 4. Use the Model-View-Controller pattern to implement a simple timer-based
 * counter. The counter should start at a user-specified initial value and increment by one
 * every second until it reaches a user-specified final value. A UML diagram depicting
 * the three classes for the pattern is shown below. The word “in” means the
 * parameter is used to deliver data to the method.
 * The CounterView class should simply take an input counter value and print it
 * on the console screen.
 *  The CounterModel class should have a variable that represents the counter’s value.
 * The Increment method increments the counter by one and calls CounterView’s
 * Display method.
 *  The CounterController class takes a start and end value that is specified by
 * the user. CounterModel is then initialized with the start value. When the Start
 * method is invoked, it calls CounterModel’s increment method once per second
 * until endValue — startValue seconds have elapsed.
 *  You will need to implement additional variables or methods in addition to those
 * shown above in order to create the linkages between classes.
 *  You can use the method call Thread.sleep(1000) to make the CounterController
 * wait for one second. The call must be placed inside a try/catch block.
 *  Test your program with a main method that counts several different ranges
 * of values
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_12_04
{
    public static void main(String[] args)
    {
        /*start = 1; end = 10;
        * output
        * 1
        * 2
        * 3
        * 4
        * 5
        * 6
        * 7
        * 8
        * 9
        * 10*/
        CounterView.start();

        /*start = 15; end = 20;
         * output
         * 15
         * 16
         * 17
         * 18
         * 19
         * 20
         * */
        CounterView.start();
    }
}
