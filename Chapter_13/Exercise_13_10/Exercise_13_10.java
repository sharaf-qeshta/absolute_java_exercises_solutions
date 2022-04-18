package chapter_thirteen;

/**
 * 10. Define an interface named Shape with a single method named area that calculates
 * the area of the geometric shape:
 * public double area();
 *  Next, define a class named Circle that implements Shape. The Circle class should
 * have an instance variable for the radius, a constructor that sets the radius, accessor/
 * mutator methods for the radius, and an implementation of the area method. Also
 * define a class named Rectangle that implements Shape. The Rectangle class
 * should have instance variables for the height and width, a constructor that sets the
 * height and width, accessor and mutator methods for the height and width, and an
 * implementation of the area method.
 * The following test code should then output the area of the Circle and Rectangle
 * objects:
 * public static void main(String[] args)
 * {
 *  Circle c = new Circle(4); // Radius of 4
 *  Rectangle r = new Rectangle(4,3); // Height = 4, Width = 3
 *  ShowArea(c);
 *  ShowArea(r);
 * }
 * public static void ShowArea(Shape s)
 * {
 *  double area = s.area();
 *  System.out.println("The area of the shape is " + area);
 * }
 *
 * @author Sharaf Qeshta */


public class Exercise_13_10
{
    public static void main(String[] args)
    {
        Circle c = new Circle(4); // Radius of 4
        Rectangle r = new Rectangle(4,3); // Height = 4, Width = 3
        ShowArea(c); // The area of the shape is 50.26548245743669
        ShowArea(r); // The area of the shape is 12.0
    }


    public static void ShowArea(Shape s)
    {
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }
}





