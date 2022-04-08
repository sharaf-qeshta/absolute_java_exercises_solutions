package chapter_seven;

/**
 * 8. Programming Project 4.10 required adding an instance variable to the Pet class
 * defined in Display 4.15 to indicate if the pet is a dog or cat. A better organization
 * is to define Pet as a superclass of the Dog and Cat classes. This organization
 * eliminates the need for an instance variable to indicate the type of the pet. Do
 * or redo Programming Project 4.10 with inheritance. The acepromazine() and
 * carprofen() methods should be defined in the Pet class to simply return 0. Override
 * both methods in the Dog and Cat classes to calculate the correct dosage. Write
 * a main method with appropriate tests to exercise the changes.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_07_08
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setAge(1);
        dog.setName("Poppy");
        dog.setWeight(20);

        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("Catty");
        cat.setWeight(20);

        /*
         * CAT: Name: Catty Age: 1 years
         * Weight: 20.0 pounds
         * */
        System.out.println(cat);

        /*
         * DOG: Name: Poppy Age: 1 years
         * Weight: 20.0 pounds
         * */
        System.out.println(dog);

        System.out.println(dog.acepromazine()); // 0.02727272727272727
        System.out.println(dog.carprofen()); // 0.37878787878787873

        System.out.println(cat.acepromazine()); // 0.0018181818181818182
        System.out.println(cat.carprofen()); // 0.18939393939393936
    }
}
