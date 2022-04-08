package chapter_seven;

public class MarshmallowManAlien extends Alien
{
    private static final int DAMAGE = 2;

    public MarshmallowManAlien(int health, String name)
    {
        super(health, name);
    }


    public int getDamage()
    {
        return DAMAGE;
    }
}
