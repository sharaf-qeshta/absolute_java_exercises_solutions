package chapter_seven;

public class Person
{
    String name;

    public Person()
    {
        name = "No Name Yet";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public Person(Person person)
    {
        this.name = person.getName();
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String toString()
    {
        return "Person Name " + name;
    }


    public boolean equals(Person other)
    {
        return name.equals(other.getName());
    }
}
