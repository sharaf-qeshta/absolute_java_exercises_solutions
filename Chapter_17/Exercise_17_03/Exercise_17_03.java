package chapter_seventeen;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 3. Design and code a Swing GUI calculator. You can use Display 17.19 as a starting
 * point, but your calculator will be more sophisticated. Your calculator will have
 * two text fields that the user cannot change: One labeled "Result" will contain the
 * result of performing the operation, and the other labeled "Operand" will be for
 * the user to enter a number to be added, subtracted, and so forth from the
 * result. The user enters the number for the "Operand" text field by clicking buttons
 * labeled with the digits 0 through 9 and a decimal point, just as in a real calculator.
 * Allow the operations of addition, subtraction, multiplication, and division. Use a
 * GridLayout manager to produce a button pad that looks similar to the keyboard
 * on a real calculator.
 *  When the user clicks a button for an operation, the following occurs: the operation
 * is performed, the "Result" text field is updated, and the "Operand" text field is
 * cleared. Include a button labeled "Reset" that resets the "Result" to 0.0. Also
 * include a button labeled "Clear" that resets the "Operand" text field so it is blank.
 *  Hint: Define an exception class named DivisonByZeroException. Have your
 * code throw and catch a DivisonByZeroException if the user attempts to “divide
 * by zero.” Your code will catch the DivisonByZeroException and output a
 * suitable message to the "Operand" text field. The user may then enter a new subs
 * number in the "Operand" text field. Because values of type double are, in effect,
 * approximate values, it makes no sense to test for equality with 0.0. Consider an
 * operand to be “equal to zero” if it is in the range -1.0e-10 to +1.0e-10
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_17_03 implements ActionListener
{
    private static final JTextField OPERAND = new JTextField(15);
    private static final JTextField OPERATOR = new JTextField(15);
    private static final ArrayList<String> OTHER_BUTTONS
            = new ArrayList<>(Arrays.asList("+", "*", "-", "/", ".", "AC"));

    private static double previous_value = 0.0;
    private static boolean operate = false;

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;


    public static void main(String[] args)
    {
        JFrame calculator = new JFrame();
        calculator.setLayout(new BorderLayout());
        calculator.setSize(WIDTH, HEIGHT);

        // DESIGN I/O
        JPanel output = new JPanel();
        output.setLayout(new FlowLayout());

        output.add(new JLabel("Operand"));
        OPERAND.setEditable(false);
        output.add(OPERAND);

        output.add(new JLabel("Operator"));
        OPERATOR.setEditable(false);
        output.add(OPERATOR);
        calculator.getContentPane().add(output, BorderLayout.NORTH);

        // DESIGN BOARD
        JPanel board = new JPanel();
        board.setLayout(new GridLayout(4, 4));
        Exercise_17_03 listener = new Exercise_17_03();
        for (int i = 0; i < 10; i++)
        {
            JButton button = new JButton(i + "");
            button.addActionListener(listener);
            board.add(button);
        }

        for (String x: OTHER_BUTTONS)
        {
            JButton button = new JButton(x);
            button.addActionListener(listener);
            board.add(button);
        }

        calculator.getContentPane().add(board, BorderLayout.CENTER);

        calculator.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (operate)
        {
            operate = false;
            OPERAND.setText("");
        }
        JButton button = (JButton) e.getSource();
        String text = button.getText();
        try
        {
            int value = Integer.parseInt(text);
            OPERAND.setText(OPERAND.getText() + value);
        }
        catch (Exception exception)
        {
            if (text.equals("."))
                OPERAND.setText(OPERAND.getText() + ".");
            else if (text.equals("AC"))
            {
                OPERAND.setText("");
                OPERATOR.setText("");
                previous_value = 0.0;
            }
            else
            {
                operate = true;
                OPERATOR.setText(text);
                double value;
                try
                {
                    value = Double.parseDouble(OPERAND.getText());
                }
                catch (Exception error)
                {
                    OPERAND.setText("Error");
                    OPERATOR.setText("Error");
                    return;
                }
                switch (text)
                {
                    case "+" ->
                    {
                        double newValue = previous_value + value;
                        previous_value = newValue;
                        OPERAND.setText(newValue + "");
                    }
                    case "*" ->
                    {
                        double newValue = previous_value * value;
                        previous_value = newValue;
                        OPERAND.setText(newValue + "");
                    }
                    case "-" ->
                    {
                        double newValue = previous_value - value;
                        previous_value = newValue;
                        OPERAND.setText(newValue + "");
                    }
                    default ->
                    {
                        if (value == 0)
                        {
                            OPERAND.setText("Error");
                            OPERATOR.setText("Error");
                            return;
                        }
                        double newValue = previous_value / value;
                        previous_value = newValue;
                        OPERAND.setText(newValue + "");
                    }
                }
            }
        }
    }
}
