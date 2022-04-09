package chapter_eight;


import java.util.Scanner;

/**
 * 4. The goal for this programming project is to create a simple 2D predator–prey
 * simulation. In this simulation, the prey is ants, and the predators are doodlebugs.
 * These critters live in a world composed of a 20 3 20 grid of cells. Only one critter
 * may occupy a cell at a time. The grid is enclosed, so a critter is not allowed to move
 * off the edges of the grid. Time is simulated in time steps. Each critter performs
 * some action every time step.
 *  The ants behave according to the following model:
 * • Move. Every time step, randomly try to move up, down, left, or right. If the
 * cell in the selected direction is occupied or would move the ant off the grid,
 * then the ant stays in the current cell.
 * • Breed. If an ant survives for three time steps, then at the end of the third time
 * step (i.e., after moving), the ant will breed. This is simulated by creating a new
 * ant in an adjacent (up, down, left, or right) cell that is empty. If there is no
 * empty cell available, no breeding occurs. Once an offspring is produced, the
 * ant cannot produce an offspring until three more time steps have elapsed.
 *  The doodlebugs behave according to the following model:
 * • Move. Every time step, if there is an adjacent cell (up, down, left, or right)
 * occupied by an ant, then the doodlebug will move to that cell and eat the ant.
 * Otherwise, the doodlebug moves according to the same rules as the ant. Note
 * that a doodlebug cannot eat other doodlebugs.
 * • Breed. If a doodlebug survives for eight time steps, then at the end of the time
 * step, it will spawn off a new doodlebug in the same manner as the ant.
 * • Starve. If a doodlebug has not eaten an ant within the last three time steps,
 * then at the end of the third time step, it will starve and die. The doodlebug
 * should then be removed from the grid of cells.
 *  During one turn, all the doodlebugs should move before the ants.
 *  Write a program to implement this simulation and draw the world using ASCII
 * characters of “o” for an ant and “X” for a doodlebug. Create a class named
 * Organism that encapsulates basic data common to both ants and doodlebugs.
 *  This class should have an overridden method named move that is defined in the
 * derived classes of Ant and Doodlebug. You may need additional data structures to
 * keep track of which critters have moved.
 *  Initialize the world with 5 doodlebugs and 100 ants. After each time step, prompt
 * the user to press Enter to move to the next time step. You should see a cyclical
 * pattern between the population of predators and prey, although random perturbations
 * may lead to the elimination of one or both species.
 *
 * @author Sharaf Qeshta
 * * */

public class Exercise_08_04
{
    private static final Cell[][] grid = new Cell[20][20];
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        fill();
        while (true)
        {
            display();
            System.out.println("\n\n\n");
            moveEach();

            System.out.print("\n\nPress Enter to Move to The next Step: ");
            scanner.nextLine();
        }


    }

    public static void fill()
    {
        int status = 0;
        int preyCount = 0;
        int predatorCount = 0;
        for (int i = 0; i < grid.length; i++)
        {
            if (i == 5)
                status = 1;
            for (int j = 0; j < grid[i].length; j++)
            {
                if (status == 0)
                {
                    grid[i][j] = new Cell(new Prey(i, j, true));
                    if (++preyCount == 100)
                        status = 1;
                }
                else if (status == 1)
                {
                    grid[i][j] = new Cell(new Predator(i, j, true));
                    if (++predatorCount == 5)
                        status = 2;
                }
                else
                    grid[i][j] = new Cell();
            }
        }
    }

    public static void display()
    {
        for (int i = 0; i < grid.length; i++)
        {
            System.out.println("-----------------------------------------------------------------------------");
            for (int j = 0; j < grid[i].length; j++)
                System.out.print(grid[i][j].getFill() + "\t");
            System.out.println();
        }
    }


    public static void moveEach()
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {

                // move up
                if (validMove(i-1, j) && grid[i][j].getOccupier() != null)
                {
                    if (grid[i][j].getOccupier().move(i-1, j, grid))
                        continue;
                }

                // move down
                if (validMove(i+1, j) && grid[i][j].getOccupier() != null)
                {
                    if (grid[i][j].getOccupier().move(i+1, j, grid))
                        continue;
                }


                // move right
                if (validMove(i, j+1) && grid[i][j].getOccupier() != null)
                {
                    if (grid[i][j].getOccupier().move(i, j+1, grid))
                        continue;
                }

                // move left
                if (validMove(i, j-1) && grid[i][j].getOccupier() != null)
                    grid[i][j].getOccupier().move(i, j-1, grid);
            }
        }
    }


    public static boolean validMove(int x, int y)
    {
        return x > -1 && x < 20 && y > -1 && y < 20;
    }

    public static boolean validMovePrey(int x, int y)
    {
        return !grid[x][y].isOccupied();
    }

    public static boolean validMovePredator(int x, int y)
    {
        return !grid[x][y].isOccupied() || grid[x][y].getFill().equals("o");
    }


}
