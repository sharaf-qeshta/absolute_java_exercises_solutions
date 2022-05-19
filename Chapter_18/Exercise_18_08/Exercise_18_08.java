package chapter_eighteen;

import javax.swing.*;
import java.awt.*;

/**
 * 8. Write a program that graphically displays a vertical bar chart to display the analysis
 * of your last five months’ mobile bill. The first input is an array of String that
 * represents month name. The second input is an array of double that represents billing
 * amount. The Y axis will represent Billing Amount and the X axis will represent
 * Month. Display the following data using the bar chart.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_18_08 extends JFrame
{
    public static final String[] MONTHS = {"Month", "January", "February", "March", "April", "May"};
    public static final Object[] BILLINGS = {"Billing Amount", 230.5, 310.7, 370.0, 245.9, 117.1};

    public static void main(String[] args)
    {
        Exercise_18_08 frame = new Exercise_18_08();
    }

    public Exercise_18_08()
    {
        super();
        setSize(500, 500);
        setLayout(new GridLayout(MONTHS.length, 2, 0, 0));
        for (int i = 0; i < MONTHS.length; i++)
        {
            JLabel month = new JLabel(String.format("%30s", MONTHS[i])); // left padding
            JLabel billing = new JLabel(String.format("%30s", BILLINGS[i].toString()));

            month.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // drawing borders
            billing.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            getContentPane().add(month);
            getContentPane().add(billing);
        }
        setTitle("Exercise_18_08");
        setVisible(true);
    }
}
