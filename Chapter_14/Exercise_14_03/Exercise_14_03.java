package chapter_fourteen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 3. Many Global Positioning Satellite (GPS) units can record waypoints. The waypoint
 * marks the coordinates of a location on a map along with a timestamp. Consider a
 * GPS unit that stores waypoints in terms of an (X,Y) coordinate on a map together
 * with a timestamp t that records the number of seconds that have elapsed since the
 * unit was turned on. Write a program that allows the user to enter as many
 * waypoints as desired, storing each waypoint in an ArrayList, where each waypoint is
 * represented by a class that you design. Each waypoint represents a successive sample
 * point during a hike along some route. The coordinates should be input as doubles,
 * and the timestamp as an integer. Have your program compute the total distance
 * traveled and the average speed in miles per hour. Use the map scaling factor of
 * 1 = 0.1 miles. For example, if the only two waypoints are (X=1,Y=1,T=0) and
 * (X=2,Y=1,T=3600), then the hiker traveled a distance of 0.1 miles in 3,600 seconds,
 * or 0.1 miles per hour.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_14_03
{
    private static final ArrayList<Waypoint> waypoints = new ArrayList<>();


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter x, y and timestamp separated by space: ");
            double x, y;
            int t;
            try
            {
                x = scanner.nextDouble();
                y = scanner.nextDouble();
                t = scanner.nextInt();
            }
            catch (Exception exception)
            {
                System.out.println("Invalid Input");
                continue;
            }

            waypoints.add(new Waypoint(x, y, t));

            if (waypoints.size() == 1)
                continue;

            int timeElapsed = 0;
            for (Waypoint point: waypoints )
                timeElapsed += point.getT();
            System.out.println(waypoints.get(0).getOutput(waypoints.get(waypoints.size()-1), timeElapsed));
        }
    }

}
