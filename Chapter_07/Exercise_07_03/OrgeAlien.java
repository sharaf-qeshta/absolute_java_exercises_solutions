package chapter_seven;

public class OrgeAlien extends Alien
{
    private static final int DAMAGE = 6;

    public OrgeAlien(int health, String name)
    {
        super(health, name);
    }


    public int getDamage()
    {
        return DAMAGE;
    }
}
