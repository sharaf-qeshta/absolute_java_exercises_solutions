package chapter_ten;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 9. Write a program that will search a binary file of numbers of type int and write
 * the largest and the smallest numbers to the screen. The file contains nothing but
 * numbers of type int written to the file with writeInt.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_10_09
{
    private static final String filePath = "src/chapter_ten/numbers.dat";
    public static void main(String[] args)
    {
        fillRandom(10000);

        /*
        * The Largest Number in The File: 9997
        * The Smallest Number in The File: 0
        * */
        printMaxAndMin();
    }

    public static void fillRandom(int size)
    {
        try (RandomAccessFile file = new RandomAccessFile(new File(filePath), "rw"))
        {
            for (int i = 0; i < size; i++)
                file.writeInt((int) (Math.random() * (size*2) % size));
        }
        catch (IOException ignored) {}
    }

    public static void printMaxAndMin()
    {
        int max = 0, min = 0;
        try (RandomAccessFile file = new RandomAccessFile(new File(filePath), "r"))
        {
            max = file.readInt(); min = max;
            while (true)
            {
                int number = file.readInt();
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            }
        }
        catch (IOException ignored) {}

        System.out.println("The Largest Number in The File: " + max);
        System.out.println("The Smallest Number in The File: " + min);
    }


}
