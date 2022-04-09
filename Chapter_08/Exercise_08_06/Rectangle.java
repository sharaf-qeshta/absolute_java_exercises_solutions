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

        for (int i = 0; i < width; i++)
            System.out.print("* ");

        System.out.println();
        for (int i = 0; i < height-2; i++)
        {
            for (int k = 0; k < getCenterX(); k++)
                System.out.print(" ");
            System.out.print("* ");
            for (int j = 0; j < width-2; j++)
                System.out.print("  ");
            System.out.print("* \n");
        }

        for (int k = 0; k < getCenterX(); k++)
            System.out.print(" ");
        for (int i = 0; i < width; i++)
            System.out.print("* ");
    }

    @Override
    void erase()
    {
        System.out.println(System.lineSeparator().repeat(100));
    }
}
