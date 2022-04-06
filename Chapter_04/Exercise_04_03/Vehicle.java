package chapter_four;

public class Vehicle
{
    private double initTankSize, fuelInTank, initEfficiency;

    public Vehicle(double initTankSize, double fuelInTank, double initEfficiency)
    {
        this.initTankSize = initTankSize;
        this.fuelInTank = fuelInTank;
        this.initEfficiency = initEfficiency;
    }

    public double addPetrol(double amount)
    {
        if (fuelInTank + amount > 0 && fuelInTank + amount < initTankSize)
        {
            fuelInTank += amount;
            return 0;
        }
        else
            return amount;
    }

    public double driveTo()
    {
        return fuelInTank / initEfficiency; // km
    }

    public double getInitTankSize() {
        return initTankSize;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    public double getInitEfficiency() {
        return initEfficiency;
    }
}
