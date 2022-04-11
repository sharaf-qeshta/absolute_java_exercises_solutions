package chapter_ten;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 11. Write a program that takes its input from a binary file of numbers of type double.
 * The file contains nothing but numbers of type double written to the file with
 * writeDouble. The program outputs to the screen the average and standard
 * deviation of the numbers in the file. The standard deviation of a list of numbers n1,
 * n2, n3, and so forth is defined as the square root of the average of the following
 * numbers:
 * (n1 - a)
 * 2, (n2 - a)
 * 2, (n3 - a)
 * 2, and so forth.
 *  The number a is the average of the numbers n1, n2, n3, and so forth. Hint: Write
 * your program so that it first reads the entire file and computes the average of all the
 * numbers, then closes the file, and then reopens the file and computes the standard
 * deviation. You will find it helpful to first do Programming Project 10.8 and then
 * modify that program in order to obtain the program for this project.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_10_11
{
    private static final String filePath = "src/chapter_ten/numbers.dat";
    public static void main(String[] args)
    {
        fillRandom(10);

        /*
        * 0.8719697013628062,
        * 4.44568623000557,
        * 14.362541344606141,
        * 24.86956531632504,
        * 0.08816283073450165,
        * 7.418759321439902,
        * 0.7591785453510339,
        * 17.91686584855197,
        * 6.5932577395356935,
        * 9.551123406289362,
        * */
        printDeviation(calculateAverage());
    }

    public static void fillRandom(int size)
    {
        try (RandomAccessFile file = new RandomAccessFile(new File(filePath), "rw"))
        {
            for (int i = 0; i < size; i++)
                file.writeDouble(Math.random() * (size*2) % size);
        }
        catch (IOException ignored) {}
    }



    public static double calculateAverage()
    {
        double total = 0;
        int count = 0;
        try (RandomAccessFile file = new RandomAccessFile(new File(filePath), "r"))
        {
            while (true)
            {
                total += file.readDouble();
                count++;
            }
        }
        catch (IOException ignored) {}

        return (count == 0)? 0 : total/count;
    }


    public static void printDeviation(double average)
    {
        try (RandomAccessFile file = new RandomAccessFile(new File(filePath), "r"))
        {
            while (true)
            {
                System.out.println(Math.pow(file.readDouble() - average, 2) + ", ");
            }
        }
        catch (IOException ignored) {}
    }


}
