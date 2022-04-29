package chapter_sixteen;

import java.util.HashSet;

public class User
{
    private String userName;
    private HashSet<User> links = new HashSet<>();

    public User(String userName)
    {
        this.userName = userName;
    }

    public boolean addLink(User user)
    {
        return links.add(user);
    }

    public String getUserName()
    {
        return userName;
    }

    public HashSet<User> getLinks()
    {
        return links;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        for (int i = 0; i < userName.length(); i++)
            hash += userName.charAt(i);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        User user = (User) obj;
        return getUserName().equals(user.getUserName());
    }

    @Override
    public String toString()
    {
        return userName;
    }
}
