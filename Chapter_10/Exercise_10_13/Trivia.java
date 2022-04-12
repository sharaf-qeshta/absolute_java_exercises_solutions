package chapter_ten;

public class Trivia implements java.io.Serializable
{
    String id;
    String question;
    String answer;
    int score;

    public Trivia(String id, String question, String answer, int score)
    {
        this.question = question;
        this.answer = answer;
        this.score = score;
        this.id = id;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getAnswer()
    {
        return answer;
    }

    public int getScore()
    {
        return score;
    }

    public String getId()
    {
        return id;
    }
}
