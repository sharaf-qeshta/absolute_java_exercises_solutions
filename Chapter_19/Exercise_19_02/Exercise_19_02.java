package chapter_nineteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 2. Create a program to simulate the movement of a bicycle wheel. A wheel consists of
 * a rim represented by a circle and several spokes represented by line from the centre
 * of circle to its parameters. The wheel should move from one end of the frame to
 * the other end on the click of start button. Use a thread for the rotation.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_19_02 extends JPanel implements ActionListener
{
    /**
     * choosing different colors for the spokes
     * will create the illusion of the movement
     * */
    private static Color[] colors = {Color.BLACK, Color.LIGHT_GRAY, Color.GRAY, Color.DARK_GRAY};
    private static final int SIZE = 100;
    private static final int NUMBER_OF_SPOKES = 36;
    private static boolean start = true;

    private static int xSpeed = 2;
    private static int wheel1_startX = 50;
    private static int wheel1_startY = 50;
    private static int wheel2_startX = 170;
    private static int wheel2_startY = 50;

    public static void main(String[] args)
    {
        Exercise_19_02 panel = new Exercise_19_02();
        JFrame frame = new JFrame("Exercise_19_02");
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new Exercise_19_02());
        frame.getContentPane().add(startButton, BorderLayout.SOUTH);
        frame.setVisible(true);

        while (start)
            panel.repaint();
    }

    public void shuffleColors()
    {
        for (int i = 0; i < colors.length; i++)
        {
            int index = (int) ((Math.random() * (colors.length*2)) % colors.length);
            Color temp = colors[index];
            colors[index] = colors[i];
            colors[i] = temp;
        }
    }



    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        graphics.setColor(Color.BLACK);

        graphics.drawOval(wheel1_startX, wheel1_startY, SIZE, SIZE);
        graphics.drawOval(wheel2_startX, wheel2_startY, SIZE, SIZE);

        shuffleColors();
        int part = 360/NUMBER_OF_SPOKES;
        int index = 0;
        for (int i = 0; i < 360; i+=part, index++)
        {
            if (index >= colors.length)
                index = 0;
            graphics.setColor(colors[index]);

            int startX = wheel1_startX+(SIZE/2);
            int startY = wheel1_startY+(SIZE/2);
            int endX = (int) ((SIZE/2)*Math.cos(Math.toRadians(i)));
            int endY = (int) ((SIZE/2)*Math.sin(Math.toRadians(i)));
            graphics.drawLine(startX, startY, endX+startX, endY+startY);

            startX = wheel2_startX+(SIZE/2);
            startY = wheel2_startY+(SIZE/2);
            graphics.drawLine(startX, startY, endX+startX, endY+startY);
        }

        if (wheel1_startX+SIZE >= getWidth()
                || wheel1_startX <= 0
                || wheel2_startX+SIZE >= getWidth()
                || wheel2_startX <= 0)
            xSpeed *= -1; // change direction

        wheel1_startX += xSpeed; wheel2_startX += xSpeed;

        try
        {
            Thread.sleep(25);
        }
        catch (Exception ignored){ }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        start = !start;
    }
}
