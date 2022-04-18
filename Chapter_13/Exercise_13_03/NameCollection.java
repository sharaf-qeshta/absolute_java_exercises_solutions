package chapter_thirteen;

/**
 * NameCollection implements a collection of names using
 * a simple array.
 */

public class NameCollection
{
    String[] names;
    int index = 0;

    /**
     * The list of names is initialized from outside
     * and passed in as an array of strings
     */
    NameCollection(String[] names)
    {
        this.names = names;
    }
    /**
     * getEnumeration should return an instance of a class that
     implements
     * the Enumeration interface where hasNext() and getNext()
     * correspond to data stored within the names array.
     */
    Enumeration getEnumeration ()
    {
        index = 0;
        return new Enumeration()
        {
            @Override
            public boolean hasNext()
            {
                return index < names.length;
            }

            @Override
            public Object getNext()
            {
                return names[index++];
            }
        };
    }
}

