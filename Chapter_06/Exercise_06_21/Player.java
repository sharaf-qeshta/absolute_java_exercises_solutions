package chapter_six;

public class Player
{
    private String name;
    private int scores;

    public Player(String name, int scores)
    {
        this.name = name;
        this.scores = scores;
    }

    public Player() {}

    public String getName()
    {
        return name;
    }

    public int getScores()
    {
        return scores;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setScores(int scores)
    {
        this.scores = scores;
    }
}
