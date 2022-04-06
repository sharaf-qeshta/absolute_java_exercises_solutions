package chapter_four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 14. A comma-separated values (CSV) file is a simple text format used to store a list of
 * records. A comma is used as a delimiter to separate the fields for each record. This
 * format is commonly used to transfer data between a spreadsheet or database. In
 * this Programming Project, consider a store that sells five products abbreviated as
 * A, B, C, D, and E. Customers can rate each product from 1–5, where 1 is poor
 * and 5 is excellent. The ratings are stored in a CSV file where each row contains
 * the customer’s rating for each product. Here is a sample file with three customer
 * ratings:
 * A,B,C,D,E
 * 3,0,5,1,2
 * 1,1,4,2,1
 * 0,0,5,1,3
 *  In this file format, the first line gives the products. The digit 0 indicates that a
 * customer did not rate a product. In this case, the first customer rated A as 3, C as
 * 5, D as 1, and E as 2. Product B was not rated. The third customer rated C as 5,
 * D as 1, and E as 3. The third customer did not rate A or B.
 *  Create a text file in this format with sample ratings. Then, write a program that
 * reads in this text file and extracts each rating using the StringTokenizer class.
 * Finally, the program should output the average rating for each product. Customers
 * that did not rate a product should not be considered when computing the average
 * rating for that product. Your program can assume there will always be exactly five
 * products but it should work with an arbitrary number of customer ratings.
 *
 * @author Sharaf Qeshta*/


public class Exercise_04_14
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/chapter_four/ratings.txt");
        Scanner fileScanner = new Scanner(file);

        int productASum = 0, productBSum = 0, productCSum = 0, productDSum = 0, productESum = 0;
        int productACustomers = 0, productBCustomers = 0, productCCustomers = 0, productDCustomers = 0, productECustomers = 0;

        while (fileScanner.hasNext())
        {
            String line = fileScanner.nextLine();
            if (line.startsWith("A"))
                continue;
            StringTokenizer st = new StringTokenizer(line, ",");

            int r = Integer.parseInt(st.nextToken());
            productASum += r;
            if (r != 0){
                productACustomers += 1;
            }

            r = Integer.parseInt(st.nextToken());
            productBSum += r;
            if (r != 0){
                productBCustomers += 1;
            }

            r = Integer.parseInt(st.nextToken());
            productCSum += r;
            if (r != 0){
                productCCustomers += 1;
            }

            r = Integer.parseInt(st.nextToken());
            productDSum += r;
            if (r != 0){
                productDCustomers += 1;
            }

            r = Integer.parseInt(st.nextToken());
            productESum += r;
            if (r != 0){
                productECustomers += 1;
            }
        }

        System.out.println("The Average Rating for Product A: " + (productASum * 1.0 / productACustomers)); // 2.0
        System.out.println("The Average Rating for Product B: " + (productBSum * 1.0 / productBCustomers)); // 1.0
        System.out.println("The Average Rating for Product C: " + (productCSum * 1.0 / productCCustomers)); // 4.666666666666667
        System.out.println("The Average Rating for Product D: " + (productDSum * 1.0 / productDCustomers)); // 1.3333333333333333
        System.out.println("The Average Rating for Product E: " + (productESum * 1.0 / productECustomers)); // 2.0
    }

}
