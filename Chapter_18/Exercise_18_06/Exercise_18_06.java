package chapter_eighteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 6. Create a swing program to make use of FontDemo class. The program will display
 * text in at least three different fonts such as SansSerif, Arial, and Serif. Allow the
 * user to enter a sentence in aTextField. Add a Preview button to display the text
 * in different fonts, point size and style (bold or italics).
 *
 * @author Sharaf Qeshta
 */

public class Exercise_18_06 implements ActionListener
{
    private static final JTextField TEXT = new JTextField(10);
    private static final JLabel PREVIEW = new JLabel("PREVIEW");
    private static final JTextField SIZE = new JTextField(5);
    static int style = Font.BOLD;
    static int size = 20;
    static String font = "SansSerif";

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Exercise_18_06");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel textContainer = new JPanel(new FlowLayout());
        textContainer.add(TEXT);
        textContainer.add(PREVIEW);
        frame.getContentPane().add(textContainer, BorderLayout.NORTH);

        Exercise_18_06 listener = new Exercise_18_06();

        JPanel fontsButtonsController = new JPanel(new FlowLayout());
        JButton sansSerif = new JButton("SansSerif");
        JButton serif = new JButton("Serif");
        JButton arial = new JButton("Arial");
        sansSerif.addActionListener(listener);
        serif.addActionListener(listener);
        arial.addActionListener(listener);
        fontsButtonsController.add(sansSerif);
        fontsButtonsController.add(serif);
        fontsButtonsController.add(arial);


        JLabel sizeLabel = new JLabel("Size");

        JPanel sizeContainer = new JPanel(new FlowLayout());
        sizeContainer.add(sizeLabel);
        sizeContainer.add(SIZE);

        JButton bold = new JButton("Bold");
        JButton italic = new JButton("Italic");
        bold.addActionListener(listener);
        italic.addActionListener(listener);

        JPanel styleButtonsContainer = new JPanel(new FlowLayout());
        styleButtonsContainer.add(bold);
        styleButtonsContainer.add(italic);

        JPanel options = new JPanel(new FlowLayout());
        options.add(fontsButtonsController);
        options.add(sizeContainer);
        options.add(styleButtonsContainer);

        frame.getContentPane().add(options, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("SansSerif") || button.getText().equals("Serif")
                || button.getText().equals("Arial"))
            font = button.getText();
        else if (button.getText().equals("Bold"))
            style = Font.BOLD;
        else
            style = Font.ITALIC;

        try
        {
            size = Integer.parseInt(SIZE.getText());
        }
        catch (Exception ignored) { }

        applyChanges();
    }


    public void applyChanges()
    {
        PREVIEW.setText(TEXT.getText());
        PREVIEW.setFont(new Font(font, style, size));
    }
}
