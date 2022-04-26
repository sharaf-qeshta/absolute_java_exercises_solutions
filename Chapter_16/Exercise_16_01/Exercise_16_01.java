package chapter_sixteen;

import java.util.Vector;

/**
 * 1. Redo Programming Project 6.8 in Chapter 6, but this time do it for a vector of
 * strings to be sorted into lexicographic order.
 *
 * @author Sharaf Qeshta */


public class Exercise_16_01
{
    public static void main(String[] args)
    {
        Vector<String> vector = new Vector<>();
        vector.add("College Algebra");
        vector.add("Calculus");
        vector.add("Linear Algebra");
        vector.add("Discrete Mathematics");
        vector.add("Abstract Algebra");
        vector.add("Geometry");
        vector.add("Topology");
        vector.add("Differential Equations");
        vector.add("Complex Variables");
        vector.add("Analysis");

        BubbleSort.sort(vector);

        /*  [Abstract Algebra, Analysis, Calculus, College Algebra,
            Complex Variables, Differential Equations, Discrete Mathematics,
            Geometry, Linear Algebra, Topology]
          */
        System.out.println(vector);
    }
}
