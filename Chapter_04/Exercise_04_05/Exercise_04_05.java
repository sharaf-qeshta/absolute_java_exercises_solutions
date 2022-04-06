package chapter_four;

/**
 * 5. Define a class called WordCount whose objects count the number of words in a
 * sentence. An object of this class maintains a variable count that is a nonnegative
 * integer. Include methods to set the counter to 0, to increase the count by 1, and to
 * decrease the count by 1 if any word encountered starts with ‘A’ or ‘a’. Be sure that
 * no method allows the value of the counter to become negative. Include an accessor
 * method that returns the current count value and a method that outputs the count
 * to the screen. There should be no input method or other mutator methods. The
 * only method that can set the counter is the one that sets it to 0. Write a program
 * (or programs) to test all the methods in your class definition.
 * 
 * @author Sharaf Qeshta
 * */

public class Exercise_04_05
{
    public static void main(String[] args)
    {
        WordCount wordCount = WordCount.count("Welcome to Java java is a simple programming language");
        wordCount.displayCount(); // the words in the sentence is 8


    }
}
