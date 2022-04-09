package chapter_eight;

public abstract class Figure
{
    private int centerX;
    private int centerY;

    abstract void center();
    abstract void draw();
    abstract void erase();

    public int getCenterX()
    {
        return centerX;
    }

    public void setCenterX(int centerX)
    {
        this.centerX = centerX;
    }

    public int getCenterY()
    {
        return centerY;
    }

    public void setCenterY(int centerY)
    {
        this.centerY = centerY;
    }
}
