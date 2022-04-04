package chapter_two;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * 10. Write a program that inputs the name, quantity, and price of three items. The
 * name may contain spaces. Output a bill with a tax rate of 6.25%. All prices should
 * be output to two decimal places. The bill should be formatted in columns with
 * 30 characters for the name, 10 characters for the quantity, 10 characters for the
 * price, and 10 characters for the total. Sample input and output are shown as follows:
 *  Input name of item 1:
 *  lollipops
 *  Input quantity of item 1:
 *  10
 *  Input price of item 1:
 *  0.50
 *  Input name of item 2:
 *  diet soda
 *  Input quantity of item 2:
 *  3
 *  Input price of item 2:
 *  1.25
 *  Input name of item 3:
 *  chocolate bar
 *  Input quantity of item 3:
 *  20
 *  Input price of item 3:
 *  0.75
 *  Your bill:
 * Item Quantity Price Total
 * lollipops 10 0.50 5.00
 * diet soda 3 1.25 3.75
 * chocolate bar 20 0.75 15.00
 * Subtotal 23.75
 * 6.25% sales tax 1.48
 * Total 25.23
 *
 * @author Sharaf Qeshta*/


public class Exercise_02_10
{
    private static final double SWEETENER_RATE = 0.001;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Input name of item 1: ");
        String item1Name = scanner.nextLine();

        System.out.println("Input quantity of item 1: ");
        int item1Quantity = scanner.nextInt();

        System.out.println("Input quantity of item 1: ");
        double item1Price = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Input name of item 2: ");
        String item2Name = scanner.nextLine();

        System.out.println("Input quantity of item 2: ");
        int item2Quantity = scanner.nextInt();

        System.out.println("Input quantity of item 2: ");
        double item2Price = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Input name of item 3: ");
        String item3Name = scanner.nextLine();

        System.out.println("Input quantity of item 3: ");
        int item3Quantity = scanner.nextInt();

        System.out.println("Input quantity of item 3: ");
        double item3Price = scanner.nextDouble();



        DecimalFormat df = new DecimalFormat(".00");

        double total = item1Price * item1Quantity
                + item2Price * item2Quantity + item3Price * item3Quantity;
        double tax = total * 0.0625;


        System.out.print("Item                          ");
        System.out.print("Quantity  ");
        System.out.print("Price     ");
        System.out.print("Total     ");

        System.out.println();

        System.out.print(item1Name);
        System.out.print(item1Quantity);
        System.out.print(df.format(item1Price));
        System.out.print(df.format(item1Price * item1Quantity));

        System.out.println();

        System.out.print(item2Name);
        System.out.print(item2Quantity);
        System.out.print(df.format(item2Price));
        System.out.print(df.format(item2Price * item2Quantity));

        System.out.println();

        System.out.print(item3Name);
        System.out.print(item3Quantity);
        System.out.print(df.format(item3Price));
        System.out.print(df.format(item3Price * item3Quantity));


        System.out.println();

        System.out.print("6.25% sales tax                                   ");
        System.out.print(df.format(tax));

        System.out.println();

        System.out.print("Total                                             ");
        System.out.print(df.format(total));

    }
}
