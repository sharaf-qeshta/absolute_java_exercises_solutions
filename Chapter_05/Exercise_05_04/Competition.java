package chapter_five;

public class Competition
{
    String competitionName;
    String winner;
    String runnerUp;
    int year;

    public Competition(String competitionName, String winner,
                       String runnerUp, int year)
    {
        this.competitionName = competitionName;
        this.winner = winner;
        this.runnerUp = runnerUp;
        this.year = year;
    }


    public String getString(){
        return getCompetitionName() + " : first place " + winner + ", second place" + runnerUp + ": Year: " + year;
    }


    public String getCompetitionName()
    {
        return competitionName;
    }

    public void setCompetitionName(String competitionName)
    {
        this.competitionName = competitionName;
    }

    public String getWinner()
    {
        return winner;
    }

    public void setWinner(String winner)
    {
        this.winner = winner;
    }

    public String getRunnerUp()
    {
        return runnerUp;
    }

    public void setRunnerUp(String runnerUp)
    {
        this.runnerUp = runnerUp;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}
