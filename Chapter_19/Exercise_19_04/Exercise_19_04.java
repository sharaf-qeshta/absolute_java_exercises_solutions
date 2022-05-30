package chapter_nineteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 4. Modify the GUI in Display 19.2 so that the circles are alternately red, white, and
 * blue, and so that they fill the area from bottom to top instead of top to bottom.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_19_04 extends JFrame implements ActionListener
{
    /** colors */
    private static final ArrayList<Color> COLORS =
            new ArrayList<>(Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final int FILL_WIDTH = 300;
    public static final int FILL_HEIGHT = 100;
    public static final int CIRCLE_SIZE = 10;
    public static final int PAUSE = 100; //milliseconds

    private JPanel box;

    public static void main(String[] args)
    {
        Exercise_19_04 gui = new Exercise_19_04();
        gui.setVisible(true);
    }

    public Exercise_19_04()
    {
        setSize(WIDTH, HEIGHT);
        setTitle("Exercise_19_04");
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
        packerThread.start();
    }

    private class Packer extends Thread
    {
        public void run()
        {
            int index = 0;
            Graphics g = box.getGraphics();
            for (int y = FILL_HEIGHT; y > -1; y = y - CIRCLE_SIZE)
                for (int x = FILL_WIDTH; x > -1; x = x - CIRCLE_SIZE, index++)
                {
                    if (index >= 3)
                        index = 0;
                    g.setColor(COLORS.get(index));
                    g.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
                    doNothing(PAUSE);
                }
        }

        public void doNothing(int milliseconds)
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
