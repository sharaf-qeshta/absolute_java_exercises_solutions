package chapter_ten;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScoreRecorder
{
    private final String[] names = new String[5];
    private final int[] scores = new int[5];
    private String fileName = "";

    public ScoreRecorder()
    {
        initialize();
    }

    public ScoreRecorder(String fileName)
    {
        readFrom(fileName);
        this.fileName = fileName;
    }


    public String[] getTopNames()
    {
        sort();
        return names;
    }

    public String getName(int rank)
    {
        sort();
        if (rank < 1 || rank > names.length)
            return "";
        return names[rank-1];
    }

    public int[] getTopScores()
    {
        sort();
        return scores;
    }

    public int getScore(int rank)
    {
        sort();
        if (rank < 1 || rank > names.length)
            return -1;
        return scores[rank-1];
    }


    public void sort()
    {
        boolean needNextIterate = true;
        while (needNextIterate)
        {
            needNextIterate = false;
            for (int i = 0; i < scores.length-1; i++)
            {
                if (scores[i] < scores[i+1])
                {
                    int temp = scores[i];
                    String tempName = names[i];

                    scores[i] = scores[i+1];
                    names[i] = names[i+1];

                    scores[i+1] = temp;
                    names[i+1] = tempName;

                    needNextIterate = true;
                }
            }
        }
        writeTo(fileName);
    }


    public boolean readFrom(String fileName)
    {
        File file = new File(fileName);
        if (!file.exists())
            return false;

        int index = 0;
        try (Scanner scanner = new Scanner(file))
        {
                while (scanner.hasNext() && index < 5)
                {
                    names[index] = scanner.nextLine();
                    scores[index++] = Integer.parseInt(scanner.nextLine());
                }
        }
        catch (IOException ignored) {}
        return true;
    }


    public boolean writeTo(String fileName)
    {
        File file = new File(fileName);
        if (!file.exists())
            return false;

        try (PrintWriter writer = new PrintWriter(file))
        {

            for (int i = 0; i < names.length; i++)
            {
                writer.write(names[i] + "\n");
                writer.write(scores[i] + "\n");
            }
        }
        catch (IOException ignored) {}

        return true;
    }


    public void initialize()
    {
        for (int i = 0; i < scores.length; i++)
        {
            names[i] = "";
            scores[i] = 0;
        }
    }


    public void playerScore(String name, int score)
    {
        sort();
        if (scores[scores.length-1] < score)
        {
            scores[scores.length-1] = score;
            names[names.length-1] = name;
            sort();
        }
    }

}
