package chapter_nineteen;

public class Buzzer extends Thread implements MonitorTime
{
    private long delay;
    private int loop;

    @Override
    public void setBuzzerTime(long delay)
    {
        this.delay = delay;
    }

    @Override
    public void setBuzzerLoop(int times)
    {
        this.loop = times;
    }

    public void blowBuzzer()
    {
        for (int i = 0; i < loop; i++)
        {
            try
            {
                sleep(delay);
            }
            catch (Exception ignored) { }
            System.out.println("Ring......");
        }
    }
}
