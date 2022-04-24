package chapter_fifteen;

/**
 * 6. Write an addSorted method for the generic linked list from Display 15.8 such
 * that the method adds a new node in the correct location so that the list remains
 * in sorted order. Note that this will require that the type parameter T extend the
 * Comparable interface. Write a suitable test program.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_06
{
    public static void main(String[] args)
    {
        // test addToStart
        LinkedList3<Integer> list = new LinkedList3<>();

        list.addSorted(11);
        list.addSorted(11);
        list.addSorted(3);
        list.addSorted(8);
        list.addSorted(9);
        list.addSorted(-2);
        list.addSorted(250);

        /*
        * 250
        * 11
        * 11
        * 9
        * 8
        * 3
        * -2
        * */
        list.outputList();
    }
}
