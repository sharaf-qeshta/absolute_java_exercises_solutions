package chapter_seven;

public class SnakeAlien extends Alien
{
    private static final int DAMAGE = 10;

    public SnakeAlien(int health, String name)
    {
        super(health, name);
    }


    public int getDamage()
    {
        return DAMAGE;
    }
}
