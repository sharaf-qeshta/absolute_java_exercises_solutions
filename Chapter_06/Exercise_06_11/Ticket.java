package chapter_six;

public class Ticket
{
    private String id;
    private boolean taken = false;

    public Ticket(String id)
    {
        this.id = id;
    }

    public void setTaken(boolean taken)
    {
        this.taken = taken;
    }

    public String getId()
    {
        return id;
    }

    public boolean isTaken()
    {
        return taken;
    }
}
