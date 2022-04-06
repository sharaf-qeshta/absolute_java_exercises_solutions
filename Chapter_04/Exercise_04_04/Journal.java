package chapter_four;

import java.util.Date;

public class Journal
{
    private String author, title;
    private Date date;

    public Journal(String author, String title, Date date)
    {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    public void displayDetails()
    {
        System.out.println(author + ", " + title + ", " + date.toString());
    }

    public String getSubmissionDetails()
    {
        String capitalized = "";
        capitalized +=  Character.toUpperCase(title.charAt(0));
        for (int i = 0; i < title.length()-1; i++){
            if (title.charAt(i) == ' ')
                capitalized += Character.toUpperCase(title.charAt(i+1));
            else
                capitalized += title.charAt(i+1);
        }
        return capitalized;
    }
}
