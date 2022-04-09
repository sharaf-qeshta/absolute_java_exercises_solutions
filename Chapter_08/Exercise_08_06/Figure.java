package chapter_eight;

import java.io.IOException;

public abstract class Figure
{
    private int centerX;
    private int centerY;

    abstract void center();
    abstract void draw();
    abstract void erase() throws IOException;

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
