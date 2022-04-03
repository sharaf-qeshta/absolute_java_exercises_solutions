package chapter_one;


/**
 * Write a program that starts with the string variable first set to your first name
 * and the string variable last set to your last name. Both names should be all lowercase.
 * Your program should then create a new string that contains your full name in
 * pig latin with the first letter capitalized for the first and last name. Use only the pig
 * latin rule of moving the first letter to the end of the word and adding “ay.” Output
 * the pig latin name to the screen. Use the substring and toUpperCase methods
 * to construct the new name.
 *  For example, given
 *  first = "walt";
 *  last = "savitch";
 *  the program should create a new string with the text “Altway Avitchsay” and print it.
 *
 * @author Sharaf Qeshta
 *  */

public class Exercise_01_03
{
    public static void main(String[] args)
    {
       String firstName = "walt";
       String lastName = "savitch";

       String newFirstName = Character.toUpperCase(firstName.charAt(1)) + firstName.substring(2)
               + firstName.charAt(0) + "ay";
        String newLastName = Character.toUpperCase(lastName.charAt(1)) + lastName.substring(2)
                + lastName.charAt(0) + "ay";

        System.out.println(newFirstName + " " + newLastName);

    }
}