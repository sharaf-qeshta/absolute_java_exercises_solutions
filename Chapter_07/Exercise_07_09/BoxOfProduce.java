package chapter_seven;

public class BoxOfProduce
{
    private Produce[] bundles = new Produce[3];
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
            Produce[] temp = new Produce[capacity];

            for (int i = 0; i < temp.length && i < bundles.length; i++)
                temp[i] = bundles[i];
            bundles = temp;
        }
    }

    public Produce getBundle(int index)
    {
        if (index > -1 && index < bundles.length)
            return bundles[index];
        return null;
    }




    public void setBundle(Produce bundle, int index)
    {
        if (index > -1 && index < bundles.length)
            bundles[index] = bundle;
    }



    public String toString()
    {
       String description = "";
       for (int i = 0; i < bundles.length
               && bundles[i] != null; i++)
           description += "Item " + (i+1) + ": " + bundles[i].toString() + ", ";
       return description;
    }


    public static String getFruitAndVegetableCount(BoxOfProduce box)
    {
        int fruitCount = 0;
        for (int i = 0; i < box.bundles.length
                && box.bundles[i] != null; i++)
        {
            if (box.bundles[i] instanceof Fruit)
                fruitCount++;
        }

        return "Fruits Count: " + fruitCount + ", Vegetables Count: " + (box.bundles.length - fruitCount);
    }
}
