package chapter_eight;

import java.util.Random;

public class LoadedDice extends Random
{
    /**
     * it`s like flip a coin either head or tail
     * but the problem that i encounter here is that
     * the chance to get exactly 50% for num-1
     * is impossible (if we roll it randomly)
     * but you will get a result near 50%
     * i don`t want to make it static 50-50
     * to make it more realistic*/
    public int nextInt(int num)
    {
        return (super.nextInt(2) == 0)? num-1 : super.nextInt(num-1);
    }
}
