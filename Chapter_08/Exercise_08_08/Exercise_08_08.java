package chapter_eight;


/**
 * 8. Programming Project 7.8 required rewriting the solution to Programming Project 4.10
 * with inheritance. Redo or do Programming Project 7.8, but instead define the Pet
 * class as an abstract class. The acepromazine() and carprofen() methods should
 * be defined as abstract methods.
 *  In your main method, define an array of type Pet and add two instances of cats
 * and two instances of dogs to the array. Iterate through the array and output how
 * much carprofen and acepromazine each pet would require.
 *
 * @author Sharaf Qeshta */

public class Exercise_08_08
{

    public static void main(String[] args)
    {
        Pet[] pets = new Pet[4];
        pets[0] = new Cat("Catty", 3, 10);
        pets[1] = new Cat("Jasmine", 2, 6);

        pets[2] = new Dog("Max", 2, 12);
        pets[3] = new Dog("Shiba", 1, 5);

        /*
        * Catty Need carprofen: 0.09469696969696968 mg
        * Catty Need acepromazine: 9.090909090909091E-4 mg
        * Jasmine Need carprofen: 0.05681818181818181 mg
        * Jasmine Need acepromazine: 5.454545454545455E-4 mg
        * Max Need carprofen: 0.22727272727272724 mg
        * Max Need acepromazine: 0.01636363636363636 mg
        * Shiba Need carprofen: 0.09469696969696968 mg
        * Shiba Need acepromazine: 0.006818181818181818 mg
        * */

        for (int i = 0; i < pets.length; i++)
        {
            System.out.println(pets[i].getName()
                    + " Need carprofen: " + pets[i].carprofen() + " mg");
            System.out.println(pets[i].getName()
                    + " Need acepromazine: " + pets[i].acepromazine() + " mg");
        }


    }
}
