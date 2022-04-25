package chapter_fifteen;


/**
 * 10. Change the Set<T> class of Display 15.37 so that internally it uses a hash table
 * to store its data instead of a linked list. The headers of the public methods should
 * remain the same so that a program such as the demonstration in Display 15.38
 * should still work without requiring any changes. Add a constructor that allows the
 * user of the new Set<T> class to specify the size of the hash table array.
 * For an additional challenge, implement the set using both a hash table and a
 * linked list. Items added to the set should be stored using both data structures. Any
 * operation requiring lookup of an item should use the hash table, and any operation
 * requiring iteration through the items should use the linked list
 *
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_10
{
    public static void main(String[] args)
    {
        // Round things
        Set<String> round = new Set<>();
        // Green things
        Set<String> green = new Set<>();
        // Add some data to both sets
        round.add("peas");
        round.add("ball");
        round.add("pie");
        round.add("grapes");
        green.add("peas");
        green.add("grapes");
        green.add("garden hose");
        green.add("grass");
        System.out.println("Contents of set round: ");
        round.output( );
        System.out.println("Contents of set green: ");
        green.output( );
        System.out.println( );
        System.out.println("ball in set round? " +
            round.contains("ball"));
        System.out.println("ball in set green? " +
            green.contains("ball"));
        System.out.println("ball and peas in same set? " +
            ((round.contains("ball") &&
            (round.contains("peas"))) ||
            (green.contains("ball") &&
            (green.contains("peas")))));
        System.out.println("pie and grass in same set? " +
            ((round.contains("pie") &&
            (round.contains("grass"))) ||
            (green.contains("pie") &&
            (green.contains("grass")))));
            System.out.print("Union of green and round: ");
            round.union(green).output( );

        System.out.print("Intersection of green and round: ");
        round.intersection(green).output( );


        /*
        * Contents of set round:
        * grapes peas pie ball
        * Contents of set green:
        * garden hose grass grapes peas

        * ball in set round? true
        * ball in set green? false
        * ball and peas in same set? true
        * pie and grass in same set? false
        * Union of green and round: garden hose grass grapes peas pie ball
        * Intersection of green and round: grapes peas
        * */

    }
}
