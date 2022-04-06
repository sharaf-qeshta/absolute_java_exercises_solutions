package chapter_four;

public class Specie
{
    private String specieName;
    private int population;
    private double growthRate;


    public Specie()
    {
    }

    public Specie(String specieName, int population, double growthRate)
    {
        setSpecieName(specieName);
        setPopulation(population);
        setGrowthRate(growthRate);
    }


    public boolean endangered()
    {
        return growthRate < 0;
    }


    public String toString()
    {
        return "Name: " + specieName + ", Population: " + population + ", Growth Rate: " + growthRate + "%";
    }

    public boolean equals(Specie otherSpecie)
    {
        return specieName.equals(otherSpecie.specieName)
                && population == otherSpecie.population
                && growthRate - otherSpecie.growthRate < 0.00001;
    }


    public void setSpecieName(String specieName)
    {
        this.specieName = specieName;
    }

    public void setPopulation(int population)
    {
        this.population = Math.max(population, 0);
    }

    public void setGrowthRate(double growthRate)
    {
        this.growthRate = growthRate;
    }


    public String getSpecieName()
    {
        return specieName;
    }

    public int getPopulation()
    {
        return population;
    }

    public double getGrowthRate()
    {
        return growthRate;
    }
}
