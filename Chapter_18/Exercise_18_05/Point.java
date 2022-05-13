package chapter_eighteen;

public class Point
{
    private int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
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

    public double distance(Point otherPoint)
    {
        return Math.sqrt(Math.pow(x - otherPoint.getX(), 2)
                + Math.pow(y - otherPoint.getY(), 2));
    }

    public Point getMidPoint(Point otherPoint)
    {
        return new Point((otherPoint.getX() + x) / 2, (otherPoint.getY() + y) / 2);
    }
}
