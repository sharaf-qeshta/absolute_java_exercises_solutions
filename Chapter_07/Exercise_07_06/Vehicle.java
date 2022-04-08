package chapter_seven;

public class Vehicle
{
    private String manufacturerName;
    private int numberOfCylinders;
    private Person owner;


    public Vehicle(String manufacturerName,
                   int numberOfCylinders,
                   Person owner)
    {
        this.manufacturerName = manufacturerName;
        this.numberOfCylinders = numberOfCylinders;
        this.owner = owner;
    }


    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }

    public int getNumberOfCylinders()
    {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders)
    {
        this.numberOfCylinders = numberOfCylinders;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }


    public String toString()
    {
        return "Vehicle Manufacturer: " + getManufacturerName()
                + ", Vehicle Cylinders: " + getNumberOfCylinders()
                + ", Vehicle Owner: " + owner.toString();
    }


    public boolean equals(Vehicle other)
    {
        return manufacturerName.equals(other.getManufacturerName())
                && numberOfCylinders == other.getNumberOfCylinders()
                && owner.equals(other.owner);
    }
}
