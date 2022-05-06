package chapter_eighteen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. A Sierpinski Gasket or Triangle is a type of fractal named after the Polish
 * mathematician Waclaw Sierpinski who described some of its interesting properties
 * in 1916. It is a nice example of how an orderly structure can be created as a result
 * of random, chaotic behavior.
 *  One way to create the fractal is to start with an equilateral triangle. Let us say that
 * the corners are labeled X, Y, and Z.
 *  1. Set current equal to point X.
 *  2. Repeat many times (you can try 10,000).
 *  a. Randomly pick target as one of the three X, Y, or Z.
 *  b. Calculate the point halfway between current and target.
 *  c. Set current to this halfway point.
 *  d. Draw a pixel at location current. One way to do this is to fill or draw a tiny
 * rectangle at this coordinate.
 *  Write a program that draws a Sierpinski Gasket. You can pick the coordinates for
 * the corners of the triangle. It may seem like you should get a random mess of dots
 * but instead you get a very orderly picture!
 *  To draw a single pixel at coordinate (X,Y), use the drawLine method where the
 * start and endpoints are both (X,Y).
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_18_01 extends JPanel
{
    private static final Point X = new Point(250, 250);
    private static final Point Y = new Point(400, 400);
    private static final Point Z = new Point(400, 250);

    private static final ArrayList<Point> points
            = new ArrayList<>(Arrays.asList(X, Y, Z));

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Draw a line");
        f.getContentPane().add(new Exercise_18_01());
        f.setSize(500, 500);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g)
    {
        g.drawLine(X.getX(), X.getY(), Y.getX(), Y.getY());
        g.drawLine(Y.getX(), Y.getY(), Z.getX(), Z.getY());
        g.drawLine(Z.getX(), Z.getY(), X.getX(), X.getY());

        // 1. Set current equal to point X.
        Point current = X;

        //  2. Repeat many times (you can try 10,000).
        for (int i = 0; i < 10_000; i++)
        {
            // a. Randomly pick target as one of the three X, Y, or Z.
            Point target = points.get((int) ((Math.random() * 10) % 3));

            // b. Calculate the point halfway between current and target.
            Point midPoint = current.getMidPoint(target);

            // c. Set current to this halfway point.
            current = midPoint;

            // d. Draw a pixel at location current.
            g.drawLine(current.getX(), current.getY(), current.getX(), current.getY());
        }
    }
}
