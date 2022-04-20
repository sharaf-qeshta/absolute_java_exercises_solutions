package chapter_fourteen;

public class Trivia
{
    String question;
    String answer;
    int score;

    public Trivia(String question, String answer, int score)
    {
        this.question = question;
        this.answer = answer;
        this.score = score;
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
}
