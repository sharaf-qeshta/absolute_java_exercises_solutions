package chapter_six;

/**
 * 9. Enhance the definition of the class PartiallyFilledArray (Display 6.5) in the
 * following way: When the user attempts to add one additional element and there
 * is no room in the array instance variable a, the user is allowed to add the element.
 * The object creates a second array that is twice the size of the array a, copies values
 * from the array a to the user’s new array, makes this array (or more precisely its
 * reference) the new value of a, and then adds the element to this new larger array a.
 * Hence, this new class should have no limit (other than the physical size of the computer)
 * to how many numbers it can hold. The instance variable maxNumberOfElements
 * remains and the method getMaxCapacity is unchanged, but these now refer to the
 * currently allocated memory and not to an absolute upper bound. Write a suitable
 * test program.
 *
 * @author Sharaf Qeshta
 * */



public class Exercise_06_09
{
    public static void main(String[] args)
    {
        PartiallyFilledArray array = new PartiallyFilledArray(); // initial size 10
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);

        array.add(43.0); // eleventh element

        System.out.println(array.getMaxCapacity()); // 20
        System.out.println(array.getNumberOfElements()); // 11
        System.out.println(array.getElement(10)); // 43.0

        array.deleteLast();

        System.out.println(array.getNumberOfElements()); // 10
    }
}
