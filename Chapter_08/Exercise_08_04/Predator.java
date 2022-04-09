package chapter_eight;

public class Predator extends Organism
{
    int movesWithoutEat = 0;
    int moves = 0;
    public Predator(int x, int y, boolean live)
    {
        super(x, y, live);
    }


    public boolean move(int x, int y, Cell[][] grid)
    {
        if (Exercise_08_04.validMovePredator(x, y))
        {
            if (grid[x][y].getFill().equals("o"))
                movesWithoutEat = 0;
            else
            {
                if (++movesWithoutEat == 3)
                {
                    // starving
                    grid[getX()][getY()] = new Cell();
                    return false;
                }

            }

            grid[x][y].setOccupier(this);
            grid[getX()][getY()] = new Cell();

            setX(x); setY(y);
            moves++;

            if (moves == 8) // breeding
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
                grid[x-1][y] = new Cell(new Predator(x-1, y, true));
                return true;
            }
        }
        // down
        if (Exercise_08_04.validMove(x+1, y))
        {
            if (!grid[x+1][y].isOccupied())
            {
                grid[x+1][y] = new Cell(new Predator(x+1, y, true));
                return true;
            }
        }

        // right
        if (Exercise_08_04.validMove(x, y+1))
        {
            if (!grid[x][y+1].isOccupied())
            {
                grid[x][y+1] = new Cell(new Predator(x, y+1, true));
                return true;
            }
        }

        // left
        if (Exercise_08_04.validMove(x, y-1))
        {
            if (!grid[x][y-1].isOccupied())
            {
                grid[x][y-1] = new Cell(new Predator(x, y-1, true));
                return true;
            }
        }

        return false;
    }
}

