package chapter_eighteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 7. The MouseListener interface allows you to retrieve mouse events. A program
 * implements this interface in a manner similar to the WindowListener interface.
 * For example, the following program creates a JFrame and outputs the X and Y
 * coordinates of any mouse clicks within the JFrame. The MouseListener interface
 * requires the implementing class to define the mouseClicked, mouseEntered,
 * mousePressed, mouseReleased, and mouseExited methods. In the example,
 * only the mouseClicked method has been completed.
 *
 *  import javax.swing.JFrame;
 *  import java.awt.event.MouseListener;
 *  import java.awt.event.MouseEvent;
 *  public class MouseDemo extends JFrame implements MouseListener
 *  {
 *  public void mouseClicked (MouseEvent e)
 *  {
 *  System.out.println(e.getX() + " " + e.getY());
 *  }
 *  public void mouseEntered (MouseEvent e) {}
 *  public void mousePressed (MouseEvent e) {}
 *  public void mouseReleased (MouseEvent e) {}
 *  public void mouseExited (MouseEvent e) {}
 *
 *  public MouseDemo()
 *  {
 *  super();
 *  setSize(600,400);
 *  setTitle("Mouse Demo");
 *  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *  addMouseListener(this); // Add listener for this object
 *  }
 *  public static void main(String[] args)
 *  {
 *  MouseDemo m = new MouseDemo();
 *  m.setVisible(true);
 *  }
 *  }
 *
 *  Modify this program to create a simple drawing program. When the mouse button
 * is clicked, a solid circle with a radius of three pixels should be drawn in the JFrame
 * centered at the mouse coordinates. Draw the circle in the color of your choice.
 * Make sure that the drawing is correctly redrawn if the JFrame is minimized and
 * then displayed again
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_18_07 extends JFrame implements MouseListener
{
    private static int x = -10, y = -10;

    public static void main(String[] args)
    {
        Exercise_18_07 frame = new Exercise_18_07();
    }

    public Exercise_18_07()
    {
        super();
        setSize(600, 400);
        setTitle("Exercise_18_07");
        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillOval(x, y, 3, 3);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        x = e.getX(); y = e.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }
}
