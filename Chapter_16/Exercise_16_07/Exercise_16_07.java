package chapter_sixteen;

import java.io.File;
import java.util.*;

/**
 * 7. In social networking websites, people link to their friends to form a social network.
 * Write a program that uses HashMaps to store the data for such a network. Your
 * program should read from a file that specifies the network connections for different
 * usernames. The file should have the following format to specify a link:
 *  source_usernamefriend_username
 *  There should be an entry for each link, one per line. Here is a sample file for five
 * usernames:
 * iba java_guru
 * iba crisha
 * iba ducky
 * crisha java_guru
 * crisha iba
 * ducky java_guru
 * ducky iba
 * java_guru iba
 * java_guru crisha
 * java_guru ducky
 * wittless java_guru
 *  In this network, everyone links to java_guru as a friend. iba is friends with java_
 * guru, crisha, and ducky. Note that links are not bidirectional; wittless links
 * with java_guru but java_guru does not link with wittless.
 *  First, create a User class that has an instance variable to store the user’s name
 * and another instance variable that is of type HashSet<User>. The HashSet<User>
 * variable should contain references to the User objects that the current user links
 * to. For example, for the user iba there would be three entries, for java_guru,
 * crisha, and ducky. Second, create a HashMap<String,User> instance variable
 * in your main class that is used to map from a username to the corresponding User
 * object. Your program should do the following:
 * • Upon startup, read the data file and populate the HashMap and HashSet data
 * structures according to the links specified in the file.
 *
 * • Allow the user to enter a name.
 * • If the name exists in the map, then output all usernames that are one link away
 * from the user entered.
 * • If the name exists in the map, then output all usernames that are two links away
 * from the user entered. To accomplish this in a general way, you might consider
 * writing a recursive subroutine.
 *  Do not forget that your User class must override the hashCode and equals methods
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_16_07
{
    public static final HashMap<String, User> DATA = new HashMap<>();
    public static final String FILE_PATH = "src/chapter_sixteen/connections.txt";
    public static void main(String[] args)
    {
        // one link away from user x ('friends of user x')
        // two links away from user x ('friends of friends of user x')
        /*
        * Enter A Name: java_guru
        * One Link Away: [ducky, crisha, iba]
        * Two Links Away:
        * From Link ducky We Have: [java_guru, iba]
        * From Link crisha We Have: [java_guru, iba]
        * From Link iba We Have: [ducky, java_guru, crisha]
        * */
        readData();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter A Name: ");
            String name = scanner.next().trim();
            if (DATA.containsKey(name))
            {
                // one link a way
                System.out.println("One Link Away: " + DATA.get(name).getLinks());
                // two links Away
                System.out.println("Two Links Away: ");
                printTwoLinks(DATA.get(name).getLinks().iterator());
            }
            else
                System.out.println("Invalid Name!!");
        }
    }

    public static void readData()
    {
        try (Scanner scanner = new Scanner(new File(FILE_PATH)))
        {
            while (scanner.hasNext())
            {
                String[] link = scanner.nextLine().split(" ");
                if (!DATA.containsKey(link[0]))
                {
                    User user = new User(link[0]);
                    DATA.put(link[0], user);
                }
                DATA.get(link[0]).addLink((DATA.containsKey(link[1]))?
                        DATA.get(link[1]) : new User(link[1]));
            }
        }
        catch (Exception ignored){}
    }

    public static void printTwoLinks(Iterator<User> iterator)
    {
        if (!iterator.hasNext())
           return;

        User user = iterator.next();
        System.out.println("From Link " + user.getUserName() + " We Have: " + user.getLinks());
        printTwoLinks(iterator);
    }
}
