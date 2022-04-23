package chapter_fifteen;

/**
 * 5. Complete the definition of the binary search tree class IntTree in Display 15.39
 * by adding the following: Make IntTree implement the Cloneable interface,
 * including the definition of a clone method; add a copy constructor; add an
 * equals method; add a method named sameContents as described later in this
 * project; add a toString method; and add a method to produce an iterator. Define
 * equals so that two trees are equal if (and only if) the two trees have the exact same
 * shape and have the same numbers in corresponding nodes. The clone method and
 * the copy constructor should each produce a deep copy that is equal to the original
 * list according to the equals method. The boolean valued method sameContents
 * has one parameter of type IntTree and returns true if the calling object and the
 * argument tree contain exactly the same numbers, and returns false otherwise.
 * Note that equals and sameContents are not the same. Also, write a suitable
 * test program.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_05
{
    public static void main(String[] args)
    {
        IntTree tree = new IntTree();
        tree.add(11);
        tree.add(12);
        tree.add(13);
        tree.add(14);
        tree.add(15);
        tree.add(16);

        /* 11 12 13 14 15 16 */
        System.out.println(tree.toString());

        IntTree tree1 = new IntTree(tree); // copy constructor
        System.out.println(tree.equals(tree1)); // true


        IntTree tree2 = new IntTree();
        tree.add(16);
        tree.add(15);
        tree.add(14);
        tree.add(13);
        tree.add(12);
        tree.add(11);

        System.out.println(tree1.equals(tree2)); // false

        System.out.println(tree1.sameContents(tree2)); // true

        IntTree tree3 = tree.clone();
        System.out.println(tree3.equals(tree)); // true

    }
}
