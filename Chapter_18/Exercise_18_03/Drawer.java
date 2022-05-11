package chapter_eighteen;

import javax.swing.*;
import java.awt.*;

public class Drawer extends JPanel
{
    /**
     * 0 => Happy Face
     * 1 => Frowny Face
     * 2 => Scary Face
     * */
    public static int status = 0;

    public void paint(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // draw Eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        if (status == 0)
            drawHappyFace(g);
        else if (status == 1)
            drawFrownyFace(g);
        else
            drawScaryFace(g);
    }


    public void drawFrownyFace(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawArc(50, 140, 120, 30, 0, 180);
    }

    public void drawScaryFace(Graphics g)
    {
        g.fillOval(50, 110, 120, 60);
    }

    public void drawHappyFace(Graphics g)
    {
        g.fillOval(50, 110, 120, 60);

        // adding smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
