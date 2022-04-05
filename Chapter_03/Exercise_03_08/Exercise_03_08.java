package chapter_three;


/**
 * 8. In a certain code language, numerals are each represented by a symbol or a letter.
 * They are as follows
 * Numeral      0 1 2 3 4 5 6 7 8 9
 * Symbol code  * B E A @ F K % R M
 *  Numerals are to be coded as per the codes in the table and the following conditions:
 *  a. If the first and the last digits are odd, both are to be coded as ‘X’.
 *  b. If the first and the last digits are even, both are to be coded as ‘$’.
 *  c. If the last digit is ‘0’, it is to be coded as ‘#’.
 *  For example, 487692 is coded as $R%KM$
 *  Write a program that takes as input a sequence of numbers and displays the corresponding code to represent it.
 *
 *  @author Sharaf Qeshta
 *  */


import java.util.Scanner;

public class Exercise_03_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Sequence Of Numbers: ");
        String value = scanner.next();

        // creating output
        char[] output = new char[value.length()];
        for (int i = 0; i < output.length; i++){
            int digit = Integer.parseInt(value.charAt(i)+ "");
            output[i] = switch (digit) {
                case 0 -> '*';
                case 1 -> 'B';
                case 2 -> 'E';
                case 3 -> 'A';
                case 4 -> '@';
                case 5 -> 'F';
                case 6 -> 'K';
                case 7 -> '%';
                case 8 -> 'R';
                case 9 -> 'M';
                default -> ' ';
            };

        }

        int firstDigit = Integer.parseInt(value.charAt(0) + "");
        int lastDigit = Integer.parseInt(value.charAt(value.length()-1) + "");

        if (lastDigit == 0){
            output[value.length()-1] = '#';
        }
        if (firstDigit % 2 == 1 && lastDigit % 2 == 1){
            output[0] = 'X'; output[value.length()-1] = 'X';
        }else if (firstDigit % 2 == 0 && lastDigit % 2 == 0) {
            output[0] = '$';output[value.length() - 1] = '$';
        }

        System.out.println(output);

    }
}
