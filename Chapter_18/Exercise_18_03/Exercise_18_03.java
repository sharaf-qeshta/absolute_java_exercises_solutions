package chapter_eighteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 3. Write a GUI program that uses the methods in the Graphics class to draw three
 * faces—happy, frowny, scary—when three corresponding buttons labeled ‘Happy’,
 * ‘Frowny’, ‘Scary’ are clicked.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_18_03 implements ActionListener
{
    private static final Drawer drawer = new Drawer();
    private static final JFrame frame = new JFrame("Exercise_18_03");

    public static void main(String[] args)
    {
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().add(drawer, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JButton happy = new JButton("Happy");
        JButton frowny = new JButton("Frowny");
        JButton scary = new JButton("Scary");

        Exercise_18_03 listener = new Exercise_18_03();
        happy.addActionListener(listener);
        frowny.addActionListener(listener);
        scary.addActionListener(listener);

        buttonsPanel.add(happy);
        buttonsPanel.add(frowny);
        buttonsPanel.add(scary);

        frame.getContentPane().add(buttonsPanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        if (buttonText.equals("Happy"))
            Drawer.status = 0;
        else if (buttonText.equals("Frowny"))
            Drawer.status = 1;
        else
            Drawer.status = 2;
        frame.repaint();
    }
}
