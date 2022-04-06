package chapter_four;

/**
 * 10. Your vet’s office is using the Pet class defined in Display 4.15 and would like to
 * include a way to calculate the dosage amount for drugs that are commonly administered
 * for dogs and cats. Make the following modifications to the class:
 * • Add an instance variable that indicates if the type of the pet is a dog or a cat.
 * • Modify the constructor and the set method to include the type of pet (i.e.,
 * dog or cat).
 * • Add a method named acepromazine( ) that returns as a double the dosage
 * in ml for the sedative acepromazine.
 * • Add a method named carprofen( ) that returns as a double the dosage in
 * ml for the pain killer carprofen.
 *  The dosage calculation is
 * Dosage1ml2 = Weight
 * 2.2
 * * mg per kg
 * mg per ml
 *  Weight is in pounds.
 * • For acepromazine, use mg per ml = 10, and mg per kg = 0.03 for dogs and
 * 0.002 for cats.
 * • For carprofen, use mg per ml = 12, and mg per kg = 0.5 for dogs and 0.25 for cats.
 *  Modify the main method in Display 4.16 to include tests of the new methods.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_04_10
{
    public static void main(String[] args)
    {
       Pet dog = new Pet("Doggy", 5, 30.0, 1);
       Pet cat = new Pet("Catty", 3, 10.0, 0);

        System.out.println(dog.acepromazine()); // 0.04090909090909091
        System.out.println(dog.carprofen()); // 0.5681818181818181

        System.out.println(cat.acepromazine()); // 9.090909090909091E-4
        System.out.println(cat.carprofen()); // 0.09469696969696968

        /*
        * Name: Doggy Age: 5 years
        * Weight: 30.0 pounds Type: Dog
        * */
        System.out.println(dog);

        /*
        * Name: Catty Age: 3 years
        * Weight: 10.0 pounds Type: Cat
        * */
        System.out.println(cat);
    }
}
