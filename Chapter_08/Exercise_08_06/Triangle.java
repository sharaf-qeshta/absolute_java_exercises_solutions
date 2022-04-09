package chapter_eight;

import java.io.IOException;

public class Triangle extends Figure
{
    private int side;

    public Triangle(int side)
    {
        this.side = side;
    }

    public Triangle(int side, int centerX
                    , int centerY)
    {
        this.side = side;
        setCenterX(centerX); setCenterY(centerY);
    }

    @Override
    void center()
    {
        erase();
        draw();
    }

    @Override
    void draw()
    {
        for (int i = 0; i < getCenterY(); i++)
            System.out.println();
        for (int i = 0; i < getCenterX(); i++)
            System.out.print(" ");
        System.out.println("*");
        for (int i = 1; i < side; i++)
        {
            String spaceBefore = "";
            for (int j = 0; j < getCenterX(); j++)
                spaceBefore += " ";
            System.out.print(spaceBefore);
            String spaceBetween = "";
            for (int j = 0; j < i; j++)
                spaceBetween += "  ";
            System.out.print("*" + spaceBetween + "*\n");
        }

        for (int k = 0; k < getCenterX(); k++)
            System.out.print(" ");
        for (int i = 0; i < side; i++)
            System.out.print("* ");

    }

    @Override
    void erase()
    {
        System.out.println(System.lineSeparator().repeat(100));
    }
}

