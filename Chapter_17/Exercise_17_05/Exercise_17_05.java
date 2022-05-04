package chapter_seventeen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 5. Redo or do for the first time the trivia game described in Programming
 * Projects 6.12 and 6.13, except create a GUI for the game interface. Use a layout of
 * your choice with the appropriate text fields, labels, and buttons to implement your
 * design. The game should ask only one question at a time and output the correct
 * answer if the player answers a question incorrectly. When all questions have been
 * answered, show the final score and exit the program.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_17_05 implements ActionListener
{
    private static final String[] questions = {"What is The Capital Of USA? ",
            "What is The Capital of California? ", "In which Year The Civil War End? ",
            "How is The President Of The US During WW2? ", "What is The Highest Mountain In America? "};
    private static final String[] answers = {"Washington", "Sacramento", "1865", "Franklin Roosevelt", "Denali"};

    private static final int[] scores = {1, 2, 3, 3, 4};

    private static final JLabel question = new JLabel(questions[0]);
    private static final JLabel status = new JLabel();
    private static final JTextArea answer = new JTextArea(1, 10);
    private static int currentTrivia = 0;
    private static int achievedScores = 0;

    public static void main(String[] args)
    {
        JFrame frame = getFrame();
        frame.setVisible(true);
    }

    public static JFrame getFrame()
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 200);
        frame.setLayout(new BorderLayout(10, 10));

        Exercise_17_05 listener = new Exercise_17_05();

        JButton submit = new JButton("Submit");
        submit.addActionListener(listener);

        JButton next = new JButton("Next");
        next.addActionListener(listener);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(answer);
        panel.add(submit);
        panel.add(next);

        JPanel questionPanel = new JPanel(new FlowLayout());
        questionPanel.add(question);

        JPanel statusPanel = new JPanel(new FlowLayout());
        statusPanel.add(status);

        frame.getContentPane().add(questionPanel, BorderLayout.NORTH);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(statusPanel, BorderLayout.SOUTH);

        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) e.getSource();

        if (button.getText().equals("Submit"))
        {
            if (answer.getText().equals(answers[currentTrivia]))
            {
                status.setText("Correct");
                achievedScores += scores[currentTrivia];
            }

            else
                status.setText("Incorrect, The Answer is " + answers[currentTrivia]);
        }
        else
        {
            if (currentTrivia+1 >= questions.length)
            {
                System.out.println("You Achieve " + achievedScores);
                System.exit(0);
            }

            question.setText(questions[++currentTrivia]);
            status.setText("");
            answer.setText("");
        }
    }
}
