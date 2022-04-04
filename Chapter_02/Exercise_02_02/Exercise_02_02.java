package chapter_two;

import java.util.Scanner;

/**
 * 2. (This is a version with input of an exercise from Chapter 1.) Write a program that
 * inputs two string variables, first and last, which the user should enter with his or
 * her name. First, convert both strings to all lowercase. Your program should then create
 * a new string that contains the full name in pig latin with the first letter capitalized
 * for the first and last name. Use only the pig latin rule of moving the first letter to the
 * end of the word and adding “ay.” Output the pig latin name to the screen. Use the
 * substring and toUpperCase methods to construct the new name.
 *  For example, if the user inputs “Walt” for the first name and “Savitch” for the
 * last name, then the program should create a new string with the text “Altway
 * Avitchsay” and print it.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_02_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a first name: ");
        String firstName = scanner.next();

        System.out.print("enter a last name: ");
        String lastName = scanner.next();

        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();

        String newFirstName = Character.toUpperCase(firstName.charAt(1)) + firstName.substring(2)
                + firstName.charAt(0) + "ay";
        String newLastName = Character.toUpperCase(lastName.charAt(1)) + lastName.substring(2)
                + lastName.charAt(0) + "ay";

        System.out.println(newFirstName + " " + newLastName);

    }
}
