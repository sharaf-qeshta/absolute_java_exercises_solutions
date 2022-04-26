package chapter_fifteen;


import java.util.Scanner;

/**
 * 11. The following figure is called a graph. The circles are called nodes and the lines are
 * called edges. An edge connects two nodes. You can interpret the graph as a maze of
 * rooms and passages. The nodes can be thought of as rooms, and an edge connects one
 * room to another. Note that each node has at most four edges in the graph that follows.
 *
 * Write a program that implements the previous maze using references to instances
 * of a Node class. Each node in the graph will correspond to an instance of Node.
 * The edges correspond to links that connect one node to another and can be
 * represented in Node as instance variables that reference another Node class. Start
 * the user in node A. The user’s goal is to reach the finish in node L. The program
 * should output possible moves in the north, south, east, or west direction. Sample
 * execution is shown next.
 * You are in room A of a maze of twisty little passages, all
 * alike. You can go east or south.
 * E
 * You are in room B of a maze of twisty little passages, all
 * alike. You can go west or south.
 * S
 * You are in room F of a maze of twisty little passages, all
 * alike. You can go north or east.
 * E
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_11
{
    public static void main(String[] args)
    {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node j = new Node("J");
        Node i = new Node("I");
        Node k = new Node("K");
        Node l = new Node("L");

        a.setDirections(null, e, b, null);
        b.setDirections(null, f, null, a);
        c.setDirections(null, g, d, null);
        d.setDirections(null, null, null, c);
        e.setDirections(a, i, null, null);
        f.setDirections(b, null, g, null);
        g.setDirections(c, k, h, f);
        h.setDirections(null, l, g, null);
        j.setDirections(null, null, i, null);
        i.setDirections(e, null, null, j);
        k.setDirections(g, null, null, null);

        Node currentNode = a;
        Scanner scanner = new Scanner(System.in);
        while (!currentNode.getData().equals("L"))
        {
            System.out.println
            (
                    "You are in room " + currentNode.getData()
                    + " of a maze of twisty little passages, all \n" +
                    "alike. You can go "
                    +  ((currentNode.getNorth() == null)? "": " North")
                    +  ((currentNode.getSouth() == null)? "": " South")
                    +  ((currentNode.getEast() == null)? "": " East")
                    +  ((currentNode.getWest() == null)? "": " West")
                    + ": "
            );
            char choice = scanner.next().toUpperCase().charAt(0);
            if (choice == 'N' && currentNode.getNorth() != null)
                currentNode = currentNode.getNorth();
            else if (choice == 'S' && currentNode.getSouth() != null)
                currentNode = currentNode.getSouth();
            else if (choice == 'W' && currentNode.getWest() != null)
                currentNode = currentNode.getWest();
            else if (choice == 'E' && currentNode.getEast() != null)
                currentNode = currentNode.getEast();
            else
                System.out.println("Invalid Choice!");
        }

        System.out.println("You Exit The Maze!!");

        /*
        * You are in room A of a maze of twisty little passages, all
        * alike. You can go  South East:
        * input: e
        * You are in room B of a maze of twisty little passages, all
        * alike. You can go  South West:
        * input: s
        * You are in room F of a maze of twisty little passages, all
        * alike. You can go  North East:
        * input: e
        * You are in room G of a maze of twisty little passages, all
        * alike. You can go  North South East West:
        * input: e
        * You are in room H of a maze of twisty little passages, all
        * alike. You can go  South East:
        * input: s
        * You Exit The Maze!!
        * */
    }
}
