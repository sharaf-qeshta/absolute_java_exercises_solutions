package chapter_seventeen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * 2. Develop a simple number game using JFrame that will display a rectangular grid
 * of nine buttons displayed in a 3 : 3 game board. Nine random numbers will be
 * generated, one corresponding to each button. The numbers can be anything in the
 * range of 1 to 50. The buttons will be initially blank and the player will be asked to
 * select any three buttons. As soon as the player selects a button, the corresponding
 * number should be displayed at the bottom of the applet, finally displaying all three
 * numbers selected by the player. If one of the numbers selected is odd, the player
 * gets a prize of $20; if two are odd, the player gets a prize of $50; and if all three
 * numbers are odd, the player gets a prize of $100. Also, if any of the three selected
 * numbers is 50, then there will be a bumper prize of $1000. If any even number is
 * selected then the system should output “Better Luck Next Time!”
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_17_02 implements ActionListener
{
    private static final HashMap<JButton, Integer> buttons = new HashMap<>();
    private static int prize = 0;
    private static int selected = 0;
    private static final ArrayList<Integer> valuesSelected = new ArrayList<>();
    private static JLabel selectionStatus;
    private static JLabel prizeStatus;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel numbersPanel = new JPanel();
        numbersPanel.setLayout(new GridLayout(3, 3));

        Exercise_17_02 listener = new Exercise_17_02();
        for (int i = 0; i < 9; i++)
        {
            JButton button = new JButton();
            button.addActionListener(listener);
            buttons.put(button, (int) ((Math.random() * 100) % 50) + 1);
            numbersPanel.add(button);
        }

        frame.getContentPane().add(numbersPanel, BorderLayout.CENTER);

        selectionStatus = new JLabel("Select 3 boxes");
        frame.getContentPane().add(selectionStatus, BorderLayout.NORTH);

        prizeStatus = new JLabel("Prize: $" + prize);
        frame.getContentPane().add(prizeStatus, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (selected == 3)
        {
            evaluatePrize();
            prizeStatus.setText("Prize : $" + prize);
            return;
        }

        try
        {
            JButton button = (JButton) e.getSource();
            valuesSelected.add(buttons.get(button));
            button.setText(buttons.get(button) + "");
            selectionStatus.setText("Select " + (2 - selected) + " Boxes");
            selected++;
        }
        catch (Exception ignored) { }
    }

    public static void evaluatePrize()
    {
        int odds = 0;
        for (int value: valuesSelected)
        {
            odds += (value % 2 == 1)? 1 : 0;
            if (value == 50)
            {
                prize += 1000;
                continue;
            }
            if (value % 2 == 0)
                System.out.println("Better Luck Next Time!");
        }

        prize += (odds == 1)? 20 : 0;
        prize += (odds == 2)? 50 : 0;
        prize += (odds == 3)? 100 : 0;
    }
}
