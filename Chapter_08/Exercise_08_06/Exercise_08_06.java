package chapter_eight;


/**
 * 6. Flesh out Programming Project 8.5. Give new definitions for the various
 * constructors and methods center, draw, and erase of the class Figure; draw and erase
 * of the class Triangle; and draw and erase of the class Rectangle. Use character
 * graphics; that is, the various draw methods will place regular keyboard characters
 * on the screen in the desired shape. Use the character '*' for all the character
 * graphics. That way, the draw methods actually draw figures on the screen by placing the
 * character '*' at suitable locations on the screen. For the erase methods, you can
 * simply clear the screen (by outputting blank lines or by doing something more
 * sophisticated). There are a lot of details in this project, and you will have to decide
 * on some of them on your own
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_06
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(10, 10, 10);
        Rectangle rectangle = new Rectangle(5, 5, 5, 5);


        /*
        *
         *
         *  *
         *    *
         *      *
         *        *
         *          *
         *            *
         *              *
         *                *
         *                  *
         * * * * * * * * * *
         * */
        triangle.center();

        /*
         * * * * *
         *       *
         *       *
         *       *
         * * * * *
         * */
        rectangle.center();
    }
}
