package chapter_eight;

public class Cat extends Pet
{
    private static final double ACEPROMAZINE_RATIO = 0.002;
    private static final double CARPROFEN_RATIO = 0.25;

    public double acepromazine()
    {
        return (getWeight() / 2.2) * (ACEPROMAZINE_RATIO / 10);
    }

    public double carprofen()
    {
        return (getWeight() / 2.2) * (CARPROFEN_RATIO / 12);
    }

    public String toString()
    {
        return "CAT: " + super.toString();
    }

    public Cat(String initialName, int initialAge, double initialWeight)
    {
        setName(initialName);
        setAge(initialAge);
        setWeight(initialWeight);
    }

    public Cat(){}
}
