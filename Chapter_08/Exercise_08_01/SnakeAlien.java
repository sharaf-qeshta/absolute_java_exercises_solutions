package chapter_eight;

public class SnakeAlien extends Alien
{
    private static final int DAMAGE = 10;

    public SnakeAlien(int health, String name)
    {
        setName(name);
        setHealth(health);
    }


    public int getDamage()
    {
        return DAMAGE;
    }
}
