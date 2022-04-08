package chapter_seven;

public class Alien
{
    private int health; // 0=dead, 100=full strength
    private String name;

    protected Alien(int health, String name)
    {
        this.health = health;
        this.name = name;
    }

    public int getDamage()
    {
        return 0;
    }

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
