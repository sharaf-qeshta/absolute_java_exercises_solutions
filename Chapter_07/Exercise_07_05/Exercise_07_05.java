package chapter_seven;

/**
 * 5. Give the definition of a class named Doctor whose objects are records for a clinic’s
 * doctors. This class will be a derived class of the class SalariedEmployee given in
 * Display 7.5. A Doctor record has the doctor’s specialty (such as "Pediatrician",
 * "Obstetrician", "General Practitioner", and so forth; so use the type String)
 * and office visit fee (use type double). Be sure your class has a reasonable complement
 * of constructors, accessor, and mutator methods, and suitably defined equals and
 * toString methods. Write a program to test all your methods.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_07_05
{
    public static void main(String[] args)
    {
        Doctor doctor1 = new Doctor("Obstetrician", 50);
        Doctor doctor2 = new Doctor("General Practitioner", 80);



        /*
        * No name January 1, 1000
        * $0.0 per year
        *  Speciality: Obstetrician
        *  Office Visit Fee: $50.0
        * */
        System.out.println(doctor1);

        /*
        * No name January 1, 1000
        * $0.0 per year
        *  Speciality: General Practitioner
        *  Office Visit Fee: $80.0
        * */
        System.out.println(doctor2);

        Doctor doctor3 = new Doctor("Obstetrician", 50);

        System.out.println(doctor1.equals(doctor2)); // false
        System.out.println(doctor1.equals(doctor3)); // true

    }

}
