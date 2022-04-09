package chapter_eight;

public class MultiItemSale
{
    private Sale[] items = new Sale[50];
    private int index = 0;

    public MultiItemSale() {}

    public void add(Sale sale, int index)
    {
        if (index > -1 && index < 50)
            items[index] = sale;
    }

    public void add(Sale sale)
    {
        if (index+1 > 49)
            return;
        items[index++] = sale;
    }

    public double getBill()
    {
        double total = 0;
        for (int i = 0; i < items.length; i++)
        {
            if (items[i] == null)
                continue;
            total += items[i].bill();
        }
        return total;
    }


    public void printAllItems()
    {
        for (int i = 0; i < items.length; i++)
        {
            if (items[i] == null)
                continue;
            System.out.println(items[i]);
        }
    }
}
