package chapter_fifteen;

import java.util.LinkedList;

public class WordLinkedList
{
    private final LinkedList<String> words = new LinkedList<>();

    public void insert(String word)
    {
        words.add(0, word);
    }

    public void insert(String word, int index)
    {
        words.add(index, word);
    }

    public String delete()
    {
        return words.remove();
    }

    public String delete(int index)
    {
        return words.remove(index);
    }

    public void displayCompleteList()
    {
        for (int i = 0; i < words.size(); i++)
            System.out.println((i+1) + ". " + words.get(i));
    }


    public int search(String word)
    {
        return words.indexOf(word);
    }
}
