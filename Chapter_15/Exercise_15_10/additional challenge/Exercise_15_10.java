package chapter_fifteen;


/**
 * For an additional challenge, implement the set using both a hash table and a
 * linked list. Items added to the set should be stored using both data structures. Any
 * operation requiring lookup of an item should use the hash table, and any operation
 * requiring iteration through the items should use the linked list
 *
 * @author Sharaf Qeshta */


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
        * grapes pie ball peas
        * Contents of set green:
        * grass garden hose grapes peas

        * ball in set round? true
        * ball in set green? false
        * ball and peas in same set? true
        * pie and grass in same set? false
        * Union of green and round: garden hose grass peas ball pie grapes
        * Intersection of green and round: peas grapes
        * */

    }
}
