package chapter_six;

public class CourierAgency
{
    double[] parcels;
    boolean[] deliverInside;

    public CourierAgency(double[] parcels, boolean[] deliverInside)
    {
        if (parcels.length != 5 || deliverInside.length != 5)
            System.exit(0);
        this.parcels = parcels;
        this.deliverInside = deliverInside;
    }

    public double getFees()
    {
        double total = 0;
        for (int i = 0; i < 5; i++)
            total += getFee(i);
        return total;

    }

    public double getFee(int index)
    {
        if (index < 0 || index > 4)
            return 0;
        return (parcels[index] * 2) + ((deliverInside[index])? 20 : 40);
    }
}

