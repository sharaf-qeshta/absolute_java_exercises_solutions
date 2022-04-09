package chapter_eight;

public class Prey extends Organism
{
    int moves = 0;
    public Prey(int x, int y, boolean live)
    {
        super(x, y, live);
    }

    public boolean move(int x, int y, Cell[][] grid)
    {

        if (Exercise_08_04.validMovePrey(x, y))
        {
            grid[x][y].setOccupier(this);
            grid[getX()][getY()] = new Cell();

            setX(x); setY(y);

            if (++moves == 3) // breeding
            {
                moves = 0;
                breed(grid, getX(), getY());
            }
            return true;
        }
        return false;
    }

    public boolean breed(Cell[][] grid, int x, int y)
    {
        // up
        if (Exercise_08_04.validMove(x-1, y))
        {
            if (!grid[x-1][y].isOccupied())
            {
                grid[x-1][y] = new Cell(new Prey(x-1, y, true));
                return true;
            }
        }
        // down
        if (Exercise_08_04.validMove(x+1, y))
        {
            if (!grid[x+1][y].isOccupied())
            {
                grid[x+1][y] = new Cell(new Prey(x+1, y, true));
                return true;
            }
        }

        // right
        if (Exercise_08_04.validMove(x, y+1))
        {
            if (!grid[x][y+1].isOccupied())
            {
                grid[x][y+1] = new Cell(new Prey(x, y+1, true));
                return true;
            }
        }

        // left
        if (Exercise_08_04.validMove(x, y-1))
        {
            if (!grid[x][y-1].isOccupied())
            {
                grid[x][y-1] = new Cell(new Prey(x, y-1, true));
                return true;
            }
        }

        return false;
    }
}
