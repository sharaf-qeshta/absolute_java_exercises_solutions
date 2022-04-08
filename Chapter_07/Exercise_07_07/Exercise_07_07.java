package chapter_seven;

/**
 * 7. Give the definition of two classes, Patient and Billing, whose objects are records
 * for a clinic. Patient will be derived from the class Person given in Programming
 * Project 7.6. A Patient record has the patient’s name (inherited from the class
 * Person) and primary physician of type Doctor defined in Programming Project 7.5
 * A Billing object will contain a Patient object, a Doctor object, and an amount
 * due of type double. Be sure your classes have a reasonable complement of constructors,
 * accessor and mutator methods, and suitably defined equals and toString
 * methods. First write a driver program to test all your methods, then write a test
 * program that creates at least two patients, at least two doctors, and at least two
 * Billing records, and then prints out the total income from the Billing records.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_07_07
{
    public static void main(String[] args)
    {
        Doctor doctor1 = new Doctor("Obstetrician", 50);
        Doctor doctor2 = new Doctor("General Practitioner", 80);

        Patient patient1 = new Patient("Sharaf Qeshta", doctor1);
        Patient patient2 = new Patient("John Smith", doctor2);

        Billing billing1 = new Billing(doctor1, patient1, 50);
        Billing billing2 = new Billing(doctor2, patient2, 80);


        /*
        * Person Name Sharaf Qeshta, Patient Doctor: No name January 1, 1000
        * $0.0 per year
        *   Speciality: Obstetrician
        *   Office Visit Fee: $50.0
        * */
        System.out.println(patient1);

        /*
        * Person Name John Smith, Patient Doctor: No name January 1, 1000
        * $0.0 per year
        *   Speciality: General Practitioner
        *   Office Visit Fee: $80.0
        * */
        System.out.println(patient2);


        System.out.println(billing1);
        System.out.println(billing2);

        System.out.println(billing1.equals(billing2)); // false
        System.out.println(patient1.equals(patient2)); // false

    }
}
