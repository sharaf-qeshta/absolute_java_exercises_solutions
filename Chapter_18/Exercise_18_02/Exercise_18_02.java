package chapter_eighteen;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2. The file named humphrey-img.txt contained with the website for this book holds
 * raw image data3 of a Martian rock called “Humphrey” that was taken by the Mars
 * Exploration Rover Spirit. The format of this text file is as follows:
 *  First line: single number indicating the height and width of the image (in this
 * case, 461).
 *  Lines 2–462: A row of 461 numbers each separated by a space. Each number
 * represents a pixel in grayscale and ranges from 0 to 255 where 0 is black and 255
 * is white.
 *  For example, the following data describes a 3 * 3 square where every pixel is white
 * except for a black line along the diagonal from the upper-left corner to the bottomright corner:
 * 3
 *  0 255 255
 *  255 0 255
 *  255 255 0
 *  a) Write a program to read in the data from the file and display it in a JFrame
 * window. To draw a single pixel at coordinate (X,Y), use the drawLine method
 * where the start and endpoints are both (X,Y). For speed, the contents of the
 * file should be read into an array once and the array data used in the paint()
 * method to draw the image.
 *  b) In this particular image, only about 2/3 of the shades of gray are used. For
 * example, if the image consists entirely of shades in the range from 150–160,
 * then the entire image would appear to be almost the same shade of gray. One
 * method to enhance such an image is to scale the shade of each pixel to the
 * entire range from 0 to 255. Pixels that were originally at value 150 would be
 * drawn with the value 0, pixels that were originally 151 would be drawn with
 * the value 25, and so on up to pixels of the shade 160, which would be drawn
 * with the value 255. This technique spaces out the shading so the details are
 * easier to see.
 *  To compute the new shade for a pixel at coordinate (i, j), do the following:
 *  NewShade1i, j2 = 255 * 1OriginalShade1i, j2 - MinOriginalShade2
 * 1MaxOriginalShade - MinOriginalShade2
 *  MinOriginalShade is the smallest scale of gray in the original image and
 * MaxOriginalShade is the largest scale of gray in the original image.
 *  Modify your program so that the image is drawn using the scaling technique
 * described above. The brightness and details in the resulting image should be a
 * little bit easier to distinguish.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_18_02 extends JPanel
{
    public static final String FILE_PATH = "src/chapter_eighteen/humphrey-img.txt";
    public static final ArrayList<ArrayList<Integer>> pixels = new ArrayList<>();
    public static int size = 0;
    public static final int MIN_ORIGINAL_SHADE = 0;
    public static final int MAX_ORIGINAL_SHADE = 255;

    public static void main(String[] args)
    {
        readFromFile();
        JFrame f = new JFrame("Exercise_18_02");
        f.getContentPane().add(new Exercise_18_02());
        f.setSize(500, 500);
        f.setVisible(true);
    }

    /** generate a random data
     * since i don`t find the file
     * */
    public static void fillInfile(int size)
    {
        int[] pixelValues = {0, 255};
        try (PrintWriter writer = new PrintWriter(new File(FILE_PATH)))
        {
            for (int i = 0; i < size; i++)
            {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < size; j++)
                    line.append(pixelValues[(int) ((Math.random() * 10) % 2)]).append(" ");
                writer.write(line.toString() + "\n");

            }
        }
        catch (Exception ignored) { }
    }

    public static void readFromFile()
    {
        try (Scanner reader = new Scanner(new File(FILE_PATH)))
        {
            size = Integer.parseInt(reader.nextLine());
            while (reader.hasNext())
            {
                pixels.add(new ArrayList<>());
                Scanner scanner = new Scanner(reader.nextLine());
                while (scanner.hasNext())
                    pixels.get(pixels.size()-1).add(scanner.nextInt());
            }
        }
        catch (Exception ignored) { }
    }



    public void paint(Graphics g)
    {
        for (int i = 0; i < pixels.size(); i++)
        {
            for (int j = 0; j < pixels.get(i).size(); j++)
            {
                int pixel = pixels.get(i).get(j);
                int newShade = (255 * (pixel - MIN_ORIGINAL_SHADE))
                        / (MAX_ORIGINAL_SHADE - MIN_ORIGINAL_SHADE);

                g.setColor(new Color(pixel, pixel, pixel, newShade));
                g.drawLine(i, j, i, j);
            }
        }
    }
}
