package chapter_four;

/**
 * 9. Define a class whose objects are records on animal species. The class should have
 * instance variables for the species name, population, and growth rate. The growth
 * rate is a percentage that can be positive or negative and can exceed 100%. Include
 * a suitable collection of constructors, mutator methods, and accessor methods.
 * Include a toString method and an equals method. Include a boolean valued
 * method named endangered that returns true when the growth rate is negative
 * and returns false otherwise. Write a test program (or programs) that tests each
 * method in your class definition.
 *
 * @author Sharaf Qeshta*/

public class Exercise_04_09
{
    public static void main(String[] args)
    {
        Specie specie1 = new Specie();
        specie1.setSpecieName("Panda");
        specie1.setPopulation(800);
        specie1.setGrowthRate(-0.9);

        Specie specie2 = new Specie("Elephant", 10000000, 0.8);

        System.out.println(specie1.equals(specie2)); // false
        System.out.println(specie1.endangered()); // true
        System.out.println(specie2.endangered()); // false

        System.out.println(specie1.getSpecieName()); // Panda
        System.out.println(specie1.getPopulation()); // 800
        System.out.println(specie1.getGrowthRate()); // -0.9

        System.out.println(specie1); // Name: Panda, Population: 800, Growth Rate: -0.9%
        System.out.println(specie2); // Name: Elephant, Population: 10000000, Growth Rate: 0.8%
    }
}
