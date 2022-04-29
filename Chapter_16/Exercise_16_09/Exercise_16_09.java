package chapter_sixteen;

/**
 * 9. The file words.txt included on the website contains a list of 87,314 English words.
 * Write a program that uses this word list to implement a simple spell-checker. First,
 * read all of the words into a HashSet<String> object. Then, allow the user to enter
 * the name of a text file that contains written English. The program should output
 * all of the words that are not in the set as potentially misspelled words.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_16_09
{
    public static void main(String[] args)
    {
        /*
        * words.txt
        * included
        * website
        * contains
        * 87,314
        * english
        * words.
        * programe
        * thats
        * usees
        * spell-checker
        * words
        * hashset<string>
        * taxt
        * filee
        * thata
        * contains
        * written
        * englisha
        * output
        * wordes
        * are
        * misspelled
        * words
        * */
        SpellChecker.printMisspelledWords("src/chapter_sixteen/text.txt");
    }
}
