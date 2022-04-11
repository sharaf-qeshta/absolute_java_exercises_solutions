package chapter_ten;


import java.util.Arrays;

/**
 * 7. Write a class that keeps track of the top five high scores that could be used for a
 * video game. Internally, the class should store the top scores in a data structure of
 * your choice (the most straightforward way is to use arrays). Each entry consists of
 * a name and a score. The data stored in memory should be synchronized with a text
 * file for persistent storage. For example, here are the contents of a sample file where
 * Ronaldo has the highest score and Pele has the third highest score
 * Ronaldo
 * 10400
 * Didier
 * 9800
 * Pele
 * 9750
 * Kaka
 * 8400
 * Cristiano
 * 8000
 *  The constructor should test if the file exists. If it does not exist, then the file should
 * be created with blank names for each of the players and a score of 0. If the file does
 * exist, then the data from the file should be read into the class’s instance variables.
 * Along with appropriate constructors, accessors, and mutators, add the following
 * methods:
 * • void playerScore(String name, int score): Whenever a game is over,
 * this method is called with the player’s name and final score. If the name is one
 * of the top five, then it should be added to the list and the lowest score should
 * be dropped out. If the score is not in the top five, then nothing happens.
 * • String[] getTopNames(): Returns an array of the names of the top players,
 * with the top player first, the second best player second, etc.
 * • int[] getTopScores(): Returns an array of the scores of the top players, with
 * the highest score first, the second highest score second, etc.
 *  Test your program with several calls to playerScore and print out the list of top
 * names and scores to ensure that the correct values are stored. When the program
 * is restarted, it should remember the top scores from the last session.
 *
 *
 * @author Sharaf Qeshta*/


public class Exercise_10_07
{
    public static void main(String[] args)
    {
        ScoreRecorder sr = new ScoreRecorder("src/chapter_ten/scores.txt");

        /* [Ronaldo, Didier, Pele, Kaka, Cristiano] */
        System.out.println(Arrays.toString(sr.getTopNames()));

        /* [10400, 9800, 9750, 8400, 8000] */
        System.out.println(Arrays.toString(sr.getTopScores()));

        sr.playerScore("Benzema",  9000);

        /* [Ronaldo, Didier, Pele, Benzema, Kaka] */
        System.out.println(Arrays.toString(sr.getTopNames()));

        /* [10400, 9800, 9750, 9000, 8400] */
        System.out.println(Arrays.toString(sr.getTopScores()));
    }
}
