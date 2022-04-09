package chapter_eight;

public class Dog extends Pet
{
    private static final double ACEPROMAZINE_RATIO = 0.03;
    private static final double CARPROFEN_RATIO = 0.5;

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
        return "DOG: " + super.toString();
    }

    public Dog(String initialName, int initialAge, double initialWeight)
    {
        setName(initialName);
        setAge(initialAge);
        setWeight(initialWeight);
    }

    public Dog(){}
}
