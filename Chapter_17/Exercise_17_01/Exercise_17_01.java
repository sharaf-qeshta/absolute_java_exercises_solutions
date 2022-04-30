package chapter_seventeen;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Design and code a Swing GUI to translate text that is input in English into Pig
 * Latin. You can assume that the sentence contains no punctuation. The rules for
 * Pig Latin are as follows:
 *  a. For words that begin with consonants, move the leading consonant to the end
 * of the word and add “ay.” Thus, “ball” becomes “allbay”; “button” becomes
 * “uttonbay”; and so forth.
 *  b. For words that begin with vowels, add “way” to the end of the word. Thus,
 * “all” becomes “allway”; “one” becomes “oneway”; and so forth.
 *
 * Use a FlowLayout with a JTextArea for the source text and a separate JTextArea
 * for the translated text. Add a JButton with an event to perform the translation.
 * A sample application is shown next with the text translated to Pig Latin.
 *  To parse the source text, note that you can use the Scanner class on a String. For
 * example the following code:
 *  Scanner scan = new Scanner("foo bar zot");
 *  while (scan.hasNext())
 *  {
 *  System.out.println(scan.next());
 *  }
 *  will output
 *  foo
 *  bar
 *  zot
 *
 *  @author Sharaf Qeshta
 *  */

public class Exercise_17_01 implements ActionListener
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 200;
    private static final ArrayList<Character> VOWELS
            = new ArrayList<>(Arrays.asList('a', 'A', 'e', 'E',
            'i', 'I','o', 'O', 'u', 'U'));
    public static JTextArea english;
    public static JTextArea latin;

    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setSize(WIDTH, HEIGHT);

        FlowLayout layout = new FlowLayout();

        JLabel englishLabel = new JLabel("English");
        english = new JTextArea(5, 15);

        JLabel latinLabel = new JLabel("Latin");
        latin = new JTextArea(5, 15);
        latin.setEditable(false);


        JButton translate = new JButton("Translate");
        Exercise_17_01 translator = new Exercise_17_01();
        translate.addActionListener(translator);

        window.add(englishLabel);
        window.add(english);

        window.add(latinLabel);
        window.add(latin);

        window.add(translate);

        window.setLayout(layout);
        window.setVisible(true);
    }


    public static String getLatin(String word)
    {
        if (VOWELS.contains(word.charAt(0)))
            return word + "way";

        word = word + word.charAt(0) + "ay";
        return word.substring(1);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String latinString = "";
        Scanner scanner = new Scanner(english.getText().trim());
        while (scanner.hasNext())
            latinString += getLatin(scanner.next()) + " ";
        latin.setText(latinString);
    }
}


