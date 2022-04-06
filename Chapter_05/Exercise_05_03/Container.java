package chapter_five;

public class Container
{
    private double maxCapacity;
    private double currentCapacity;
    private String scale = "Liters";


    public Container(double maxCapacity)
    {
        setMaxCapacity(maxCapacity);
    }

    public void completelyFill()
    {
        setCurrentCapacity(maxCapacity);
    }

    public void emptyContainer()
    {
        setCurrentCapacity(0);
    }

    public boolean transfer(Container container)
    {
        if (add(container.getCurrentCapacity()))
        {
            container.emptyContainer();
            return true;
        }
        return false;
    }

    public boolean add(double amount)
    {
        if (getCurrentCapacity() + amount <= maxCapacity
               && getCurrentCapacity() + amount >= 0)
        {
            setCurrentCapacity(getCurrentCapacity() + amount);
            return true;
        }
        return false;
    }

    public double leftover()
    {
        return getMaxCapacity() - getCurrentCapacity();
    }


    public double getMaxCapacity()
    {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity)
    {
        if (maxCapacity > 0)
            this.maxCapacity = maxCapacity;
    }

    public double getCurrentCapacity()
    {
        return currentCapacity;
    }

    public void setCurrentCapacity(double currentCapacity)
    {
        if (currentCapacity >= 0 && currentCapacity <= maxCapacity)
            this.currentCapacity = currentCapacity;
    }


    public void displayContainer(){
        System.out.println("The Container Contains " + getCurrentCapacity() + " " + scale);
    }
}
