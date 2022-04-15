package chapter_twelve;

import java.util.Scanner;

/**
 * The View presents the model’s data to the user.
 * */

public class CounterView
{
    private static final Scanner scanner = new Scanner(System.in);

    public void Display()
    {
        System.out.println(Integer.toBinaryString(CounterModel.counter));
    }

    public static void start()
    {
        System.out.print("Enter Start Value: ");
        int start = scanner.nextInt();

        System.out.print("Enter End Value: ");
        int end = scanner.nextInt();

        CounterController controller = new CounterController(start, end);
        controller.Start();
    }
}
