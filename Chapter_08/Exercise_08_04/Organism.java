package chapter_eight;

public class Organism
{
    private int x, y;
    private boolean live;

    public Organism(int x, int y,
                    boolean live)
    {
        this.x = x;
        this.y = y;
        this.live = live;
    }


    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public boolean isLive()
    {
        return live;
    }

    public void setLive(boolean live)
    {
        this.live = live;
    }

    public boolean move(int x, int y, Cell[][] grid){ return true; }
}
