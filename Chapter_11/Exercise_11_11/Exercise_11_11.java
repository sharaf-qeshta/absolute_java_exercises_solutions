package chapter_eleven;


import java.util.Scanner;

/**
 * 11. Simulate a simple word game. Begin with a start word and then rearrange its letters
 * to note down all the possible word combinations that can be generated from the
 * word start following the criteria mentioned below.
 *  a. Each word entered by the user must be a three-letter word.
 *  b. Each word generated must be a three-letter word.
 *  c. No letter should be repeated in the word entered by the use. For example, “bee”
 * is an invalid word, but “cat” is a valid word.
 *  d. The program should not only give valid English words but also all
 *      combinations. For example, if the given word is eat, then the output of the program
 * should list all the possible permutations:
 *  tea, tae, ate, aet, eta
 *  Write a recursive program to find the list of words and also letter combinations
 * by keeping in mind all the criteria mentioned above.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_11_11
{

    public static void main(String[] args)
    {
        /*
        * Enter A Word: eat
        * eat, eta, aet, ate, tea, tae,
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Word: ");
        String word = scanner.next();

        if (isValid(word))
            printAllPermutations(word, "");
        else
            System.out.println("Invalid Word :(");
    }


    public static void printAllPermutations(String word, String permutation)
    {
         if (word.length() == 0)
         {
             System.out.print(permutation + ", ");
             return;
         }
        for (int i = 0; i < word.length(); i++)
            printAllPermutations(word.substring(0, i) + word.substring(i+1),
                    permutation + word.charAt(i));
    }


    public static boolean isValid(String word)
    {
        // a. Each word entered by the user must be a three-letter word
        if (word.length() != 3)
            return false;
        if (!(Character.isLetter(word.charAt(0))
                && Character.isLetter(word.charAt(1))
                && Character.isLetter(word.charAt(2))))
            return false;
        // c. No letter should be repeated in the word entered by the use.
        return word.charAt(0) != word.charAt(1) && word.charAt(1) != word.charAt(2)
                && word.charAt(0) != word.charAt(2);
    }
}
