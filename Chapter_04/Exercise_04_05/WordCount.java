package chapter_four;

public class WordCount
{
    private int count;

    public WordCount(){
        count = 0;
    }

    public void increase(){
        count++;
    }

    public void decrease(){
        if (count-1 > -1)
            count--;
    }

    public int getCount(){
        return count;
    }

    public void displayCount(){
        System.out.println("the words in the sentence is " + count);
    }


    public static WordCount count(String sentence)
    {
        WordCount counter = new WordCount();
        counter.increase(); // the first word
        for (int i = 1; i < sentence.length()-1; i++)
        {
            if (sentence.charAt(i) == ' ')
                counter.increase();
            if (Character.toUpperCase(sentence.charAt(i)) == 'A'
                    && sentence.charAt(i-1) == ' ' && sentence.charAt(i+1) == ' ')
                    counter.decrease();
        }
        return counter;
    }
}
