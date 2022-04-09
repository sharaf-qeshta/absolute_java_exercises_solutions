package chapter_eight;

public class Triangle extends Figure
{
    private int side1, side2, side3;

    public Triangle(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(int side1, int side2,
                    int side3, int centerX
                    , int centerY)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setCenterX(centerX); setCenterY(centerY);
    }

    @Override
    void center()
    {
        System.out.println("center() called from Triangle");
        erase();
        draw();
    }

    @Override
    void draw()
    {
        System.out.println("draw() called from Triangle");
    }

    @Override
    void erase()
    {
        System.out.println("erase() called from Triangle");
    }
}

