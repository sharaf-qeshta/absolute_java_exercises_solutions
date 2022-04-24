package chapter_fifteen;

/**
 * 8. The hash table from Display 15.34 hashed a string to an integer and stored the
 * same string in the hash table. Modify the program so that instead of storing strings,
 * it stores Employee objects as defined in Display 7.2. Use the name instance variable
 * as the input to the hash function. The modification will require changes to the
 * linked list, because the LinkedList2 class created only linked lists of strings. For
 * the most generality, modify the hash table so that it uses the generic LinkedList3
 * class defined in Display 15.8. You will also need to add a get method that returns
 * the Employee object stored in the hash table that corresponds to the input name.
 * Test your program by adding and retrieving several names, including names that
 * hash to the same slot in the hash table.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_08
{
    public static void main(String[] args)
    {
        HashTable table = new HashTable();
        table.put(new Employee("Sharaf Qeshta"));
        table.put(new Employee("John Smith"));
        table.put(new Employee("Adam Hawkins"));
        table.put(new Employee("Adam Hawkins"));
        table.put(new Employee("Sharaf Qeshta"));
        table.put(new Employee());

        System.out.println(table.containsEmployee(new Employee("Sharaf Qeshta"))); // true
        System.out.println(table.containsEmployee(new Employee("x"))); // false

        /* Sharaf Qeshta January 1, 1000 */
        table.get("Sharaf Qeshta").outputList();
    }
}
