package chapter_five;

/**
 * 4. You are interested in keeping track of the team members and competition
 * information for your school’s annual entries in computer science programming competitions.
 * Each team consists of exactly four team members. Every year your team
 * competes in two competitions. As an initial start for your database, create a class
 * named Team that has the following instance variables:
 *  // Name for the team
 *  String teamName;
 *  // Names for each team members.
 *  String name1, name2, name3, name4;
 *  // Info on each competition
 *  Competition competition1, competition2;
 *  Note that there is a much better way to represent the team members and competitions
 *  using arrays; this is covered in a subsequent chapter. The class should also
 * have a method that outputs the names of all team members and the competition
 * information to the console.
 *  The Competition class contains variables to track the following:
 *  String: Name of the competition, Name of the winning team, Name of the runner-up
 *  Integer: Year of the competition
 *  Implement the Team and Competition classes with appropriate constructor, accessor,
 * and mutator methods. In entering data for past competitions, you note that an entry
 * is usually very similar to the previous year’s entry. To help with the data entry, create
 * a deep copy constructor for the Team class. Test your copy constructor by creating a
 * copy of an existing team object, changing the competition information for the copy,
 * and outputting the data for the original and the copy. The original object should be
 * unchanged if your deep copy constructor is working properly.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_05_04
{
    public static void main(String[] args)
    {
        Team team = new Team("Detroit HighSchool", "Adam", "Noah",
                "John", "Jim");
        Team team1 = new Team(team);
        team1.setTeamName("Austin School");

        Competition competition1 = new Competition("SkyGeeks", "Detroit HighSchool",
                "Austin School", 2022);
        Competition competition2 = new Competition("LA Hackathon", "Austin School",
                "Detroit HighSchool", 2023);

        team.setCompetition1(competition1);
        team.setCompetition2(competition2);

        team1.setCompetition1(competition1);
        team1.setCompetition2(competition2);

        /*
        * Detroit HighSchool Members: Adam, Noah, John, Jim
        * Competitions: first Competition( SkyGeeks : first place Detroit HighSchool, second placeAustin School: Year: 2022 )
        * Competitions: second Competition( LA Hackathon : first place Austin School, second placeDetroit HighSchool: Year: 2023 )
        * */
        team.display();

        /*
        * Austin School Members: Adam, Noah, John, Jim
        * Competitions: first Competition( SkyGeeks : first place Detroit HighSchool, second placeAustin School: Year: 2022 )
        * Competitions: second Competition( LA Hackathon : first place Austin School, second placeDetroit HighSchool: Year: 2023 )
        * */
        team1.display();
    }
}
