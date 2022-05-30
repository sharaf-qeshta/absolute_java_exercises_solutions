package chapter_nineteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_19_05  extends JFrame implements ActionListener
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final int FILL_WIDTH = 300;
    public static final int FILL_HEIGHT = 100;
    public static final int CIRCLE_SIZE = 10;
    public static final int PAUSE = 25; //milliseconds

    private static int xSpeed = 5;
    private static int ySpeed = 5;
    private static int x = 0;
    private static int y = 0;

    private final JPanel box;

    public static void main(String[] args)
    {
        Exercise_19_05 gui = new Exercise_19_05();
        gui.setVisible(true);
    }

    public Exercise_19_05()
    {
        setSize(WIDTH, HEIGHT);
        setTitle("Exercise_19_05");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        box = new JPanel();
        add(box, "Center");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);
        add(buttonPanel, "South");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Packer packerThread = new Packer();
        box.getGraphics().setXORMode(getBackground());
        packerThread.start();
    }

    private class Packer extends Thread
    {
        public void run()
        {
            Graphics g = box.getGraphics();
            g.setXORMode(getBackground());
            while (true)
            {
                pause(PAUSE);
                g.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);

                pause(PAUSE);
                g.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);

                // change the directions
                if (x+CIRCLE_SIZE >= FILL_WIDTH || x < 0) // left and right
                    xSpeed *= -1;
                if (y+CIRCLE_SIZE >= FILL_HEIGHT || y < 0) // north and south
                    ySpeed *= -1;

                x += xSpeed; y += ySpeed;
            }
        }

        public void pause(int milliseconds)
        {
            try
            {
                Thread.sleep(milliseconds);
            }
            catch (InterruptedException e)
            {
                System.out.println("Unexpected interrupt");
                System.exit(0);
            }
        }
    }
}
