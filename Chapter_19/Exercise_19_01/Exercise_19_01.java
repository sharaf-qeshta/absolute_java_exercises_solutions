package chapter_nineteen;

import javax.swing.*;
import java.awt.*;

/**
 * 1. Write a GUI program that uses the methods in the Graphics class together with
 * threads to draw a ball within a rectangular box. The ball should move inside the
 * box and as it strikes the wall of the box it should bounce back. The application
 * should be responsive and exit immediately if the user decides to close the window.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_19_01 extends JFrame
{
    private static int xSpeed = 2;
    private static int ySpeed = 2;
    private static int x = 0;
    private static int y = 0;
    private static int width = 50;
    private static int height = 50;

    public static void main(String[] args)
    {
        Exercise_19_01 frame = new Exercise_19_01();

        while (true)
            frame.repaint();
    }

    public Exercise_19_01()
    {
        super("Exercise_19_01");
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillOval(x, y, width, height);

        try
        {
            Thread.sleep(10);
        }
        catch (Exception ignored) { }

        // change the directions
        if (x+width >= getWidth() || x < 0) // left and right
            xSpeed *= -1;
        if (y+height >= getHeight() || y < 0) // north and south
            ySpeed *= -1;

        x += xSpeed; y += ySpeed;
    }
}
