package chapter_eighteen;

import chapter_seventeen.Exercise_17_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 5. Enhance the face drawing in Display 18.17 in the following ways: Add color so the
 * eyes are blue and the mouth is red. When the face winks, the line that represents
 * a closed eye is black, not blue. Add a nose and a brown handlebar mustache. Add
 * buttons labeled "Smile" and "Frown". When the "Frown" button is clicked, the
 * face shows a frown (upside down smile); when the "Smile" button is clicked, the
 * face shows a smile. When the user clicks the close-window button, a window pops
 * up to ask if the user is sure he or she wants to exit, as in Display 18.2.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_18_05 extends JFrame
{
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 400;
    public static final int FACE_DIAMETER = 200;
    public static final int X_FACE = 100;
    public static final int Y_FACE = 100;
    public static final int EYE_WIDTH = 20;
    public static final int EYE_HEIGHT = 10;
    public static final int X_RIGHT_EYE = X_FACE + 55;
    public static final int Y_RIGHT_EYE = Y_FACE + 60;
    public static final int X_LEFT_EYE = X_FACE + 130;
    public static final int Y_LEFT_EYE = Y_FACE + 60;
    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = X_FACE + 50;
    public static final int Y_MOUTH = Y_FACE + 100;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_ARC_SWEEP = 180;

    public static final int SMALL_WIDTH = 200; //for confirm window
    public static final int SMALL_HEIGHT = 100; //for confirm window

    private boolean wink;
    private boolean smile;

    private class Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("Click for a Wink."))
                wink = !wink;
            else smile = button.getText().equals("Click to Smile");
            repaint();
        }
    }

    private static class ConfirmWindow extends JFrame implements
            ActionListener, WindowListener
    {

        public ConfirmWindow()
        {
            setSize(SMALL_WIDTH, SMALL_HEIGHT);
            getContentPane().setBackground(Color.YELLOW);

            setLayout(new BorderLayout());
            JLabel confirmLabel = new JLabel(
                    "Are you sure you want to exit?");
            add(confirmLabel, BorderLayout.CENTER);
            JPanel buttonPanel = new JPanel();
            buttonPanel.setBackground(Color.ORANGE);
            buttonPanel.setLayout(new FlowLayout());

            JButton exitButton = new JButton("Yes");
            exitButton.addActionListener(this);
            buttonPanel.add(exitButton);

            JButton cancelButton = new JButton("No");
            cancelButton.addActionListener(this);
            buttonPanel.add(cancelButton);
            add(buttonPanel, BorderLayout.SOUTH);
        }


        @Override
        public void actionPerformed(ActionEvent e)
        {
            String actionCommand = e.getActionCommand();
            if (actionCommand.equals("Yes"))
                System.exit(0);
            else if (actionCommand.equals("No"))
                dispose(); //Destroys only the ConfirmWindow.
            else
                System.out.println(
                        "Unexpected Error in Confirm Window.");
        }

        @Override
        public void windowOpened(WindowEvent e) { }

        @Override
        public void windowClosing(WindowEvent e)
        {
            ConfirmWindow checkers = new ConfirmWindow();
            checkers.setVisible(true);
        }

        @Override
        public void windowClosed(WindowEvent e) { }

        @Override
        public void windowIconified(WindowEvent e) { }

        @Override
        public void windowDeiconified(WindowEvent e) { }

        @Override
        public void windowActivated(WindowEvent e) { }

        @Override
        public void windowDeactivated(WindowEvent e) { }
    }


    public static void main(String[] args)
    {
        Exercise_18_05 drawing = new Exercise_18_05();
        drawing.setVisible(true);
    }

    public Exercise_18_05()
    {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new ConfirmWindow());
        setTitle("Exercise_18_05");
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.white);

        JButton winkButton = new JButton("Click for a Wink.");
        JButton smileButton = new JButton("Click to Smile");
        JButton frownButton = new JButton("Click to Frown");
        JPanel buttonsContainer = new JPanel(new FlowLayout());
        buttonsContainer.add(winkButton);
        buttonsContainer.add(smileButton);
        buttonsContainer.add(frownButton);

        Listener listener = new Listener();

        smileButton.addActionListener(listener);
        frownButton.addActionListener(listener);
        winkButton.addActionListener(listener);
        add(buttonsContainer, BorderLayout.SOUTH);
        wink = false;
        smile = true;
    }


    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        //Draw Right Eye:
        g.setColor(Color.BLUE);
        g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        //Draw Left Eye:
        if (wink)
        {
            g.setColor(Color.BLACK);
            g.drawLine(X_LEFT_EYE, Y_LEFT_EYE,
                    X_LEFT_EYE + EYE_WIDTH, Y_LEFT_EYE);
        }
        else
            g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);


        // Draw Nose:
        g.setColor(Color.BLACK);
        Point mid = new Point(X_RIGHT_EYE, Y_RIGHT_EYE).getMidPoint(new Point(X_LEFT_EYE, Y_LEFT_EYE));
        mid.setX(mid.getX()+10); mid.setY(mid.getY()+15);
        g.drawLine(mid.getX(), mid.getY(), mid.getX()-20, mid.getY()+20);
        g.drawLine(mid.getX()-20, mid.getY()+20, mid.getX()+10, mid.getY()+20);


        // Draw Mustache:
        g.setColor(new Color(234, 221, 202));
        g.fillRect(X_RIGHT_EYE+10, Y_RIGHT_EYE+40, 70, 10);

        //Draw Mouth:
        g.setColor(Color.RED);
        if (smile)
            g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT,
                    MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
        else
            g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT,
                    0, MOUTH_ARC_SWEEP);
    }
}
