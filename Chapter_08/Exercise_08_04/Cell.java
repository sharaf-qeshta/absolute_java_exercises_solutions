package chapter_eight;

public class Cell
{
    private Organism occupier;

    public Cell() {}

    public Cell(Organism occupier)
    {
        this.occupier = occupier;
    }

    public Organism getOccupier()
    {
        return occupier;
    }

    public void setOccupier(Organism occupier)
    {
        this.occupier = occupier;
    }

    public String getFill()
    {
        if (occupier == null)
            return "+";
        if (occupier instanceof Prey)
            return "o";
        return "X";
    }

    public boolean isOccupied()
    {
        return occupier != null;
    }
}
