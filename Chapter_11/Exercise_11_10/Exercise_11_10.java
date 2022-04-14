package chapter_eleven;


/**
 * 10. Given the definition of a 2-D array such as the following:
 * String[][] data = {
 *  {"A", "B"},
 *  {"1", "2"},
 *  {"XX","YY","ZZ"}
 * };
 * write a recursive program that outputs all combinations of each sub array in order.
 * In the previous example, the desired output (although it does not have to be in
 * this order) is
 * A 1 XX
 * A 1 YY
 * A 1 ZZ
 * A 2 XX
 * A 2 YY
 * A 2 ZZ
 * B 1 XX
 * B 1 YY
 * B 1 ZZ
 * B 2 XX
 * B 2 YY
 * B 2 ZZ
 * Your program should work with arbitrarily sized arrays in either dimension. For
 * example, the following data
 * String[][] data = {
 *  {"A"},
 *  {"1"},
 *  {"2"},
 *  {"XX","YY"}
 * };
 * should output
 * A 1 2 YY
 * A 1 2 YY
 *
 * @author Sharaf Qeshta */

public class Exercise_11_10
{

    public static void main(String[] args)
    {
        String[][] data = {
                {"A", "B"},
                {"1", "2"},
                {"XX","YY","ZZ"}
        };
        /*
        * A 1 XX
        * A 1 YY
        * A 1 ZZ
        * A 2 XX
        * A 2 YY
        * A 2 ZZ
        * B 1 XX
        * B 1 YY
        * B 1 ZZ
        * B 2 XX
        * B 2 YY
        * B 2 ZZ
        * */
        printCombinations(data, 0, "");

        System.out.println();

        String[][] data2 = {
                {"A"},
                {"1"},
                {"2"},
                {"XX","YY"}
        };
        /*
        * A 1 2 XX
        * A 1 2 YY
        * */
        printCombinations(data2, 0, "");
    }

    public static void printCombinations(String[][] array, int index, String pre)
    {
        if (index == array.length)
        {
            System.out.println(pre);
            return;
        }
        for (int i = 0; i < array[index].length; i++)
            printCombinations(array, index+1, pre + array[index][i] + " ");
    }

}
