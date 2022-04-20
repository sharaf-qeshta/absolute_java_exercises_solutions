package chapter_fourteen;

import java.util.ArrayList;

public class Dictionary
{
    private String word;
    private String synonyms;

    public Dictionary(String word, String synonyms)
    {
        this.word = word;
        this.synonyms = synonyms;
    }


    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getSynonyms()
    {
        return synonyms;
    }

    public void setSynonyms(String synonyms)
    {
        this.synonyms = synonyms;
    }

    public boolean equals(Object dictionary)
    {
        Dictionary x = (Dictionary) dictionary;
        return x.getWord().equals(getWord()) && x.getSynonyms().equals(getSynonyms());
    }

    public String toString()
    {
        return "Word: " + word + ", Synonyms: " + synonyms;
    }

}
