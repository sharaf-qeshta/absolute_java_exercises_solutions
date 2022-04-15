package chapter_twelve;

public class Movie
{
    private String title;
    private int minutes;
    private int year;
    protected double price;

    public Movie(String title, int year, double price)
    {
        this.title = title;
        this.year = year;
        this.price = price;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void printDescription()
    {
        System.out.println("Title: " + title +
                ", Duration (Minutes): " + minutes
                + ", Year: " + year
                + ", Price: $" + price);
    }
}
