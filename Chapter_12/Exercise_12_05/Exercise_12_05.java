package chapter_twelve;



/**
 * 5. It is possible to purchase “geek” watches that output the time of day in binary. To
 * illustrate the flexibility of the Model-View-Controller pattern, modify the view
 * class (CounterView ) of the previous problem so that the display outputs the
 * counter’s value in binary.
 *  Test your new program by counting values in binary. You should not have to
 * change the model or controller classes.
 *
 * @author Sharaf Qeshta */


public class Exercise_12_05
{
    public static void main(String[] args)
    {
        /*start = 1; end = 10;
        * output
        * 1
        * 10
        * 11
        * 100
        * 101
        * 110
        * 111
        * 1000
        * 1001
        * 1010*/
        CounterView.start();

        /*start = 15; end = 20;
         * output
         * 1111
         * 10000
         * 10001
         * 10010
         * 10011
         * 10100
         * */
        CounterView.start();
    }
}
