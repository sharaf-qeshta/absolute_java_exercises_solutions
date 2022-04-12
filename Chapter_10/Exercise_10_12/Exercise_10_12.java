package chapter_ten;


import java.io.*;
import java.util.Scanner;


/**
 * 12. Change the definition of the class Person in Display 5.19 to be serializable. Note
 * that this requires that you also change the class Date. Then write a program
 * to maintain a binary file of records of people (records of type Person). Allow
 * commands to delete a record specified by the person’s name, to add a record, to
 * retrieve and display a record, and to obtain all records of people within a specified
 * age range. To obtain the age of a person, you need the current date.
 * Your program will ask the user for the current date when the program begins. You can do
 * this with random access files, but do not use random access files for this exercise.
 * Use a file or files that record records with the method writeObject of the class
 * ObjectOutputStream.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_10_12
{
    private static final String filePath = "src/chapter_ten/records.dat";
    private static final Scanner scanner = new Scanner(System.in);
    private static Date currentDate;
    public static void main(String[] args)
    {
        currentDate = getDateFromKeyboard("Current");
        fill(10);

        while (true)
        {
            System.out.println("1.Delete Record");
            System.out.println("2.Add Record");
            System.out.println("3.Display Record");
            System.out.println("4.Display All Records");
            System.out.println("5.Search Within Specified Age Range");
            System.out.println("6.Exit");

            System.out.print("\nEnter A Choice: ");
            int choice = scanner.nextInt();
            handleChoice(choice);
        }
    }


    public static void handleChoice(int choice)
    {
        switch (choice)
        {
            case 1: deleteOption();break;
            case 2: addOption();break;
            case 3: displayRecordOption();break;
            case 4: print(retrieveAllRecords());break;
            case 5: searchOption();break;
            case 6: System.exit(0);
            default:
                System.out.println("Wrong Choice!!");
        }
    }


    public static void deleteOption()
    {
        System.out.print("\n\nEnter Person Name: ");
        String personName = scanner.next();
        delete(personName);
    }

    public static void addOption()
    {
        System.out.print("\n\nEnter Person Name: ");
        String personName = scanner.next();

        Date born = getDateFromKeyboard("Person Born");
        Date die = getDateFromKeyboard("Person Die");

        addRecord(new Person(personName, born, die));
        System.out.println();
    }

    public static void displayRecordOption()
    {
        System.out.print("\n\nEnter Person Name");
        String personName = scanner.next();
        System.out.println("\n" + retrieve(personName));
    }


    public static void searchOption()
    {
        System.out.println("Enter The Range Separated by space (begin end):  ");
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        print(searchRange(begin, end));
    }



    /** obtain all records of people within a specified age range */
    public static Person[] searchRange(int begin, int start)
    {
        Person[] records = retrieveAllRecords();

        for (int i = 0; i < records.length
                && records[i] != null; i++)
        {
            double difference = getDifference(records[i].getBorn());
            if (difference < begin || difference > start)
                records[i] = null;
        }
        return records;
    }


    public static double getDifference(Date date)
    {
        double year = currentDate.getYear() - date.getYear();
        year += (Math.abs(currentDate.getMonth() - date.getMonth()) + 0.0) / 12;
        return year;
    }

    /** Your program will ask the user for the current date when the program begins */
    public static Date getDateFromKeyboard(String keyword)
    {
        Date date = new Date();

        System.out.print("Enter The " + keyword + " Year: ");
        date.setYear(scanner.nextInt());

        System.out.print("Enter The " + keyword + " Month: ");
        date.setMonth(scanner.nextInt());

        System.out.print("Enter The " + keyword + " Day: ");
        date.setDay(scanner.nextInt());

        return date;
    }

    /** add a record */
    public static boolean addRecord(Person person)
    {
        Person[] records = retrieveAllRecords();
        for (int i = 0; i < records.length; i++)
        {

            if (records[i] == null)
            {
                records[i] = person;
                writeAll(records);
                System.out.println(person.getName() + " Added Successfully");
                return true;
            }
            if (records[i].getName().equals(person.getName()))
            {
                System.out.println(person.getName() + " Is Already Exist");
                return false;
            }
        }
        return true; // to make the compiler happy
    }

    /** retrieve and display a record */
    public static Person retrieve(String personName)
    {
        Person[] records = retrieveAllRecords();
        for (int i = 0; i < records.length
                && records[i] != null; i++)
        {
            if (records[i].getName().equals(personName))
            {
                return records[i];
            }
        }
        System.out.println("Person: " + personName + " Was Not Found");
        return null; // in case that the name was not found
    }


    public static void print(Person[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != null)
                System.out.println((i+1) + ". " + array[i]);
        }
    }


    /** delete a record specified by the person’s name */
    public static boolean delete(String personName)
    {

        Person[] records = retrieveAllRecords();
        boolean found = false;
        for (int i = 0; i < records.length
                && records[i] != null; i++)
        {
            if (records[i].getName().equals(personName))
            {
                records[i] = null;
                found = true;
                System.out.println(personName + " Deleted Successfully!!");
                break;
            }

        }
        if (found)
            writeAll(records);
        return found;
    }


    public static void writeAll(Person[] array)
    {
        try (ObjectOutputStream obj =
                     new ObjectOutputStream(new FileOutputStream(new File(filePath))))
        {
           for (int i = 0; i < array.length; i++)
           {
               if (array[i] != null)
                   obj.writeObject(array[i]);
           }
        }
        catch (IOException ignored) {}
    }


    public static Person[] retrieveAllRecords()
    {
        Person[] people = new Person[1000]; // will be changed in the code
        int index = 0;
        try (ObjectInputStream obj =
                     new ObjectInputStream(new FileInputStream(new File(filePath))))
        {
            while (true)
            {
                Person person_ = (Person) obj.readObject();
                people[index++] = person_;
                if (index > people.length-1)
                {
                    // change the array size
                    Person[] temp = new Person[people.length*2];
                    for (int i = 0; i < people.length; i++)
                        temp[i] = people[i];
                    people = temp;
                }
            }
        }
        catch (IOException | ClassNotFoundException ignored) {}
        return people;
    }


    public static void fill(int size)
    {

        try (ObjectOutputStream obj =
                     new ObjectOutputStream(new FileOutputStream(new File(filePath))))
        {
            for (int i = 0; i < size; i++)
            {
                obj.writeObject(new Person("Name"+i,
                        new Date((i % 12) + 1, (i % 31) + 1, (i % 2000) +1000)
                , null));
            }
        }
        catch (IOException ignored) {}
    }




}
