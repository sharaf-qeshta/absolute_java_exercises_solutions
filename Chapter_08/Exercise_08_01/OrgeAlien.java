package chapter_eight;

public class OrgeAlien extends Alien
{
    private static final int DAMAGE = 6;

    public OrgeAlien(int health, String name)
    {
        setName(name);
        setHealth(health);
    }


    @Override
    public int getDamage() {
        return DAMAGE;
    }


}
