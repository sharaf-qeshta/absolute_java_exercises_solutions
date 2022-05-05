package chapter_seventeen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 6. Create a simple text editor by using the component JTextArea that allows the user
 * to enter text. The program should have two buttons. The first button should save
 * the content of editor to a file, while the other should be to clear the contents of the
 * editor.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_17_06 implements ActionListener
{
    private static final JTextArea EDITOR = new JTextArea(15, 15);
    private static final String FILE_PATH = "src/chapter_seventeen/output.txt";


    public static void main(String[] args)
    {
        Exercise_17_06 main = new Exercise_17_06();
        main.getFrame().setVisible(true);
    }

    public JFrame getFrame()
    {
        JFrame frame = new JFrame("Exercise_17_06");
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);

        frame.getContentPane().add(EDITOR, BorderLayout.CENTER);

        JButton save = new JButton("Save");
        save.addActionListener(this);

        JButton clear = new JButton("Clear");
        clear.addActionListener(this);

        JPanel buttonsContainer = new JPanel(new FlowLayout());
        buttonsContainer.setSize(500, 200);
        buttonsContainer.add(save); buttonsContainer.add(clear);

        frame.getContentPane().add(buttonsContainer, BorderLayout.SOUTH);

        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) e.getSource();

        if (button.getText().equals("Save"))
        {
            try (PrintWriter writer = new PrintWriter(new File(FILE_PATH)))
            {
                Scanner scanner = new Scanner(EDITOR.getText());
                while (scanner.hasNext())
                    writer.write(scanner.nextLine() + "\n");
            }
            catch (Exception ignored) { }
        }
        else
            EDITOR.setText("");
    }
}
