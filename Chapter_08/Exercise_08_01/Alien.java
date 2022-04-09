package chapter_eight;

public abstract class Alien
{
    private int health; // 0=dead, 100=full strength
    private String name;

    abstract public int getDamage();


    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
