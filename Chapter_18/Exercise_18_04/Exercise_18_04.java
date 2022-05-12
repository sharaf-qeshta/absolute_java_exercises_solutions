package chapter_eighteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 4. Write a “skeleton” GUI program that implements the WindowListener interface.
 * Write code for each of the methods in Display 18.1 that simply prints out
 * a message identifying which event occurred. Print the message out in a text field.
 * Note that your program will not end when the close-window button is clicked (but
 * will instead simply send a message to the text field saying that the windowClosing
 * method has been invoked). Include a button labeled Exit that the user can click
 * to end the program.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_18_04 implements WindowListener, ActionListener
{
    private static final JLabel STATUS = new JLabel("Start");
    private static final JFrame FRAME = new JFrame("Exercise_18_04");

    public static void main(String[] args)
    {
        FRAME.setSize(500, 500);
        FRAME.setLayout(new BorderLayout());
        FRAME.getContentPane().add(STATUS, BorderLayout.CENTER);
        FRAME.setVisible(true);
        FRAME.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        Exercise_18_04 listener = new Exercise_18_04();

        JButton close = new JButton("Close");
        close.addActionListener(listener);
        FRAME.getContentPane().add(close, BorderLayout.NORTH);

        FRAME.addWindowListener(listener);
    }

    /** This method will be invoked when the window is set as active. */
    @Override
    public void windowOpened(WindowEvent e)
    {
        STATUS.setText("Opened");
    }


    /** This method will be invoked when the user tries to get the window closed using the system menu in the window. */
    @Override
    public void windowClosing(WindowEvent e)
    {
        STATUS.setText("X pressed");
    }


    /**  This method will be invoked when the window gets closed due to the calling of disposing in the window. */
    @Override
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window Closed");
    }

    /** This method will be invoked when there is a change in the size of the window from normal to a small state. */
    @Override
    public void windowIconified(WindowEvent e)
    {
        STATUS.setText("Window Size Changed");
    }

    /** This method will be invoked when there is a change in the size of the window from minimal to normal state.
     * when you press on (-) */
    @Override
    public void windowDeiconified(WindowEvent e)
    {
        STATUS.setText("Window Minimized");
    }

    /** This method will be invoked when the window is set as active. */
    @Override
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window Activated");
    }

    /** This method will be invoked when the window is not active anymore. */
    @Override
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window Deactivated");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        FRAME.dispose();
    }
}
