package chapter_seventeen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driving implements ActionListener
{
    private static int respondYes = 0;
    private static int respondNo = 0;

    private final JButton no;
    private final JButton yes;
    private final JLabel question;
    private final JLabel status;

    public Driving()
    {
        no = new JButton("No");
        no.addActionListener(this);
        yes = new JButton("Yes");
        yes.addActionListener(this);

        question = new JLabel("Are you an excellent driver? ");
        status = new JLabel(respondYes + " users say yes, and " + respondNo + " users say no");

        getFrame().setVisible(true);
    }

    public JFrame getFrame()
    {
        JFrame frame = new JFrame("Exercise_17_04");
        frame.setSize(200, 200);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(no);
        buttonsPanel.add(yes);

        frame.getContentPane().add(question, BorderLayout.NORTH);
        frame.getContentPane().add(buttonsPanel, BorderLayout.CENTER);
        frame.getContentPane().add(status, BorderLayout.SOUTH);

        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) e.getSource();

        if (button.getText().equals("Yes"))
        {
            respondYes++;
            question.setText("We need you!");
        }
        else
        {
            respondNo++;
            question.setText("You need to practice!");
        }
        status.setText(respondYes + " users say yes, and " + respondNo + " users say no");
    }
}
