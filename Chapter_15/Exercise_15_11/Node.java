package chapter_fifteen;

public class Node
{
    private String data;
    private Node north, south, east, west;

    public Node(String data)
    {
        this.data = data;
    }

    public String getData()
    {
        return data;
    }

    public Node getNorth()
    {
        return north;
    }

    public Node getSouth()
    {
        return south;
    }

    public Node getEast()
    {
        return east;
    }

    public Node getWest()
    {
        return west;
    }

    public void setDirections(Node north, Node south,
                         Node east, Node west)
    {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

}
