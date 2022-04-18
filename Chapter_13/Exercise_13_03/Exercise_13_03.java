package chapter_thirteen;

/**
 * 3. Listed next is a code skeleton for an interface called Enumeration and a class
 * called NameCollection. Enumeration provides an interface to sequentially
 * iterate through some type of collection. In this case, the collection will be the class
 * NameCollection that simply stores a collection of names using an array of strings.
 * interface Enumeration
 * {
 *     // Returns true if another element in the collection exists
 *     public boolean hasNext();
 *     // Returns the next element in the collection as an Object
 *     public Object getNext();
 * }
 *
 *  * NameCollection implements a collection of names using
 *  * a simple array.
 *
 * class NameCollection
 * {
 *     String[] names;
 *      * The list of names is initialized from outside
 *      * and passed in as an array of strings
 *
 *     NameCollection(String[] names)
 *     {
 *         this.names = names;
 *     }
 *
 *      * getEnumeration should return an instance of a class that
 *      implements
 *      * the Enumeration interface where hasNext() and getNext()
 *      * correspond to data stored within the names array.
 *
 *     Enumeration getEnumeration ()
 *     {
 *         // Complete code here using an inner class
 *     }
 * }
 * Complete the method getEnumeration() so that it returns an anonymous inner
 * class that corresponds to the Enumeration interface for the names array in
 * NamesCollection. Then write a main method that creates a NamesCollection
 * object with a sample array of strings, retrieves the Enumeration for this class via
 * getEnumeration(), and then iterates through the enumeration outputting each
 * name using the getNext() method.
 *
 * @author Sharaf Qeshta */

public class Exercise_13_03
{
    public static void main(String[] args)
    {
        String[] names = {"Sharaf", "John", "Adam", "Noah"};
        NameCollection nameCollection = new NameCollection(names);

        /*
        * Sharaf
        * John
        * Adam
        * Noah
        * */
        Enumeration iterator = nameCollection.getEnumeration();
        while (iterator.hasNext())
            System.out.println(iterator.getNext());
    }


}





