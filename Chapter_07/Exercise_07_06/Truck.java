package chapter_seven;

public class Truck extends Vehicle
{
    private double loadCapacity;
    private int towingCapacity;


    public Truck(String manufacturerName,
                 int numberOfCylinders,
                 Person owner)
    {
        super(manufacturerName, numberOfCylinders, owner);
    }

    public Truck(String manufacturerName, int numberOfCylinders,
                 Person owner, double loadCapacity,
                 int towingCapacity)
    {
        super(manufacturerName, numberOfCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }


    public double getLoadCapacity()
    {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity)
    {
        this.loadCapacity = loadCapacity;
    }

    public int getTowingCapacity()
    {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity)
    {
        this.towingCapacity = towingCapacity;
    }

    public String toString()
    {
        return super.toString() + ", Load Capacity: " + loadCapacity
                + ", Towing Capacity: " + towingCapacity;
    }


    public boolean equals(Truck other)
    {
        return super.equals(other)
                && loadCapacity == other.getLoadCapacity()
                && towingCapacity == other.getTowingCapacity();
    }
}
