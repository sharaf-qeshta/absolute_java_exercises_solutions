package chapter_eight;


/**
 * 5. Consider a graphics system that has classes for various figures—say, rectangles,
 * boxes, triangles, circles, and so on. For example, a rectangle might have data
 * members’ height, width, and center point, while a box and circle might have only
 * a center point and an edge length or radius, respectively. In a well-designed system,
 * these would be derived from a common class, Figure. You are to implement such
 * a system.
 *  The class Figure is the base class. You should add only Rectangle and Triangle
 * classes derived from Figure. Each class has stubs for methods erase and draw.
 * Each of these methods outputs a message telling the name of the class and what
 * method has been called. Because these are just stubs, they do nothing more than
 * output this message. The method center calls the erase and draw methods to
 * erase and redraw the figure at the center. Because you have only stubs for erase
 * and draw, center will not do any “centering” but will call the methods erase and
 * draw, which will allow you to see which versions of draw and center it calls.
 * Also, add an output message in the method center that announces that center is
 * being called. The methods should take no arguments. Also, define a demonstration
 * program for your classes.
 *  For a real example, you would have to replace the definition of each of these
 * methods with code to do the actual drawing. You will be asked to do this in
 * Programming Project 8.6.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_05
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(1, 2, 3);
        Rectangle rectangle = new Rectangle(5, 5);

        /*
        * center() called from Triangle
        * erase() called from Triangle
        * draw() called from Triangle
        * */
        triangle.center();

        System.out.println();

        /*
        * center() called from Rectangle
        * erase() called from Rectangle
        * draw() called from Rectangle
        * */
        rectangle.center();
    }
}
