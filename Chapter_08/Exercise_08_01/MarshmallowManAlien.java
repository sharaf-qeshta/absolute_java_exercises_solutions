package chapter_eight;

public class MarshmallowManAlien extends Alien
{
    private static final int DAMAGE = 2;

    public MarshmallowManAlien(int health, String name)
    {
        setName(name);
        setHealth(health);
    }


    public int getDamage()
    {
        return DAMAGE;
    }
}
