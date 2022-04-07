package chapter_six;

public class BoxOfProduce
{
    private String[] bundles = new String[3];
    private int capacity = 3;

    public BoxOfProduce(int capacity)
    {
        setCapacity(capacity);
    }

    public BoxOfProduce() {}

    public void setCapacity(int capacity)
    {
        if (capacity > 0)
        {
            this.capacity = capacity;
            String[] temp = new String[capacity];

            for (int i = 0; i < temp.length && i < bundles.length; i++)
                temp[i] = bundles[i];
            bundles = temp;
        }
    }

    public String getBundle(int index)
    {
        if (index > -1 && index < bundles.length)
            return bundles[index];
        return "";
    }




    public void setBundle(String bundle, int index)
    {
        if (index > -1 && index < bundles.length)
            bundles[index] = bundle;
    }



    public String toString()
    {
       String description = "";
       for (int i = 0; i < bundles.length; i++)
           description += "Item " + (i+1) + ": " + bundles[i] + ", ";
       return description;
    }
}
