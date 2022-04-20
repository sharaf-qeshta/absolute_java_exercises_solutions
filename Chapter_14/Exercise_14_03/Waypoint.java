package chapter_fourteen;

public class Waypoint
{
    private double x, y;
    private int t;

    public Waypoint(double x, double y, int t)
    {
        this.x = x;
        this.y = y;
        this.t = t;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public int getT()
    {
        return t;
    }

    public void setT(int t)
    {
        this.t = t;
    }

    public double computeDistance(Waypoint waypoint)
    {
        return Math.sqrt(Math.pow(getX() - waypoint.getX(), 2)
                + Math.pow(getY() - waypoint.getY(), 2)) / 10.0;  // scaling factor
    }

    public String getOutput(Waypoint waypoint, int timeElapsed)
    {
        return "the hiker traveled a distance of " + computeDistance(waypoint) + " Miles in " + timeElapsed + " Seconds";
    }


}
