package chapter_seven;

public class Administrator extends SalariedEmployee
{
    String title, responsibility, immediateSupervisor;

    public Administrator(String title, String responsibility,
                         String immediateSupervisor)
    {
        this.title = title;
        this.responsibility = responsibility;
        this.immediateSupervisor = immediateSupervisor;
    }


    public Administrator(String theName, Date theDate, double theSalary,
                         String title, String responsibility,
                         String immediateSupervisor)
    {
        super(theName, theDate, theSalary);
        this.title = title;
        this.responsibility = responsibility;
        this.immediateSupervisor = immediateSupervisor;
    }


    public Administrator(SalariedEmployee originalObject, String title,
                         String responsibility, String immediateSupervisor)
    {
        super(originalObject);
        this.title = title;
        this.responsibility = responsibility;
        this.immediateSupervisor = immediateSupervisor;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getResponsibility()
    {
        return responsibility;
    }

    public void setResponsibility(String responsibility)
    {
        this.responsibility = responsibility;
    }

    public String getImmediateSupervisor()
    {
        return immediateSupervisor;
    }

    public void setImmediateSupervisor(String immediateSupervisor)
    {
        this.immediateSupervisor = immediateSupervisor;
    }


    public String toString()
    {
        return (super.toString() +
                "\n" + getTitle() + "\n" + getImmediateSupervisor()
                + "\n" + getResponsibility());
    }

    public boolean equals(Administrator other)
    {
        return (super.equals(other)
                && getTitle().equals(other.getTitle())
                && getResponsibility().equals(other.getResponsibility())
                && getImmediateSupervisor().equals(other.getImmediateSupervisor()));
    }
}
