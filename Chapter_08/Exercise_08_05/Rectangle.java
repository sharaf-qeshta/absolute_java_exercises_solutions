package chapter_eight;

public class Rectangle extends Figure
{
    private int width, height;


    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height,
                    int centerX, int centerY)
    {
        this.width = width;
        this.height = height;
        setCenterX(centerX); setCenterY(centerY);
    }


    @Override
    void center()
    {
        System.out.println("center() called from Rectangle");
        erase();
        draw();
    }

    @Override
    void draw()
    {
        System.out.println("draw() called from Rectangle");
    }

    @Override
    void erase()
    {
        System.out.println("erase() called from Rectangle");
    }
}
