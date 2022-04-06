package chapter_five;


import chapter_four.Date;

/**
 * Class for a person with a name and dates for birth and death.
 * Class invariant: A Person always has a date of birth, and if the Person
 * has a date of death, then the date of death is equal to or later than the
 * date of birth.
 *
 * @author Sharaf Qeshta
 * @version 1.0
 * */

public class Person
{
    /** person name */
    private String name;
    /** the date where the person born */
    private Date born;
    /** if null person alive */
    private Date died;

    /**
     * @param initialName the name of the person
     * @param birthDate the birthdate of the person
     * @param deathDate if the date is null he still alive
     * */
    public Person(String initialName, Date birthDate, Date deathDate)
    {
        if (consistent(birthDate, deathDate))
        {
            name = initialName;
            born = new Date(birthDate);
            if (deathDate == null)
                died = null;
            else
                died = new Date(deathDate);
        }
        else
        {
            System.out.println("Inconsistent dates.Aborting.");
            System.exit(0);
        }
    }


    /**
     * @param original copy info from original*/
    public Person(Person original)
    {
        if (original == null)
        {
            System.out.println("Fatal error.");
            System.exit(0);
        }

        name = original.name;
        born = new Date(original.born);
        if (original.died == null)
            died = null;
        else
            died = new Date(original.died);
    }

    /**
     * @return String suitable string represent the object
     * contains the name, birthDate, diedDate if the person die
     * */

    public String toString()
    {
        String diedString;
        if (died == null)
            diedString = ""; //Empty string
        else
            diedString = died.toString();
        return (name + ", " + born + "-" + diedString);
    }

    /**
     * @param otherPerson to compare with the current object
     * @return boolean
     * if the objects equals return true otherwise return false*/
    public boolean equals(Person otherPerson)
    {
        if (otherPerson == null)
            return false;
        else
            return (name.equals(otherPerson.name)
                    && born.equals(otherPerson.born)
                    && datesMatch(died, otherPerson.died) );
    }

    /**
     * To match, date1 and date2 either must be the same date or must both be null.
     * @param date1 first date to be compared with date2
     * @param date2 to be compared with date1
     * @return boolean (date1 == date2)
     * */
    private static boolean datesMatch(Date date1, Date date2)
    {
        if (date1 == null)
            return (date2 == null);
        else if (date2 == null) //&& date1 != null
            return false ;
        else //Both dates are not null.
            return (date1.equals(date2));
    }


    /**
     * Precondition: newDate is a consistent date of birth.
     * Postcondition: Date of birth of the calling object is newDate.
     * @param newDate to be set as the birth date
     * */
    public void setBirthDate(Date newDate)
    {
        if (consistent(newDate, died))
            born = new Date(newDate);
        else
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    /**
     * Precondition: newDate is a consistent date of death.
     * Postcondition: Date of death of the calling object is newDate.
     * @param newDate to be set as the death date
     * */
    public void setDeathDate(Date newDate)
    {
        if (!consistent(born, newDate))
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }

        if (newDate == null)
            died = null ;
        else
            died = new Date(newDate);
    }

    /**
     * set the name of the object
     * @param newName the new name*/
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Precondition: The date of birth has been set, and changing the year
     * part of the date of birth will give a consistent date of birth.
     * Postcondition: The year of birth is (changed to) newYear.
     * @param newYear set a new year to born object
     * */
    public void setBirthYear(int newYear)
    {
        if (born == null) //Precondition is violated.
        {
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        born.setYear(newYear);
        if (!consistent(born, died))
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    /**
     * Precondition: The date of death has been set, and changing the year
     * part of the date of death will give a consistent date of death.
     * Postcondition: The year of death is (changed to) newYear.
     * @param newYear set a new year to die object if the die object is null
     *               it will exit
     * */
    public void setDeathYear(int newYear)
    {
        if (died == null) //Precondition is violated.
        {
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        died.setYear(newYear);
        if (!consistent(born, died))
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    /**
     * @return the name of the object*/
    public String getName()
    {
        return name;
    }

    /**
     * @return return a new Date object represent the born date.
     * */
    public Date getBorn()
    {
        return new Date(born);
    }

    /**
     * @return return null if died object is null otherwise it will return
     * a new Date object represent the died date*/
    public Date getDied()
    {
        if (died == null)
            return null;
        else
            return new Date(died);
    }

    /**
     * To be consistent, birthDate must not be null. If there is no date of
     * death (deathDate == null), that is consistent with any birthDate.
     * Otherwise, the birthDate must come before or be equal to the deathDate.
     * @param birthDate the date which the person born.
     * @param deathDate the date which the person die.
     * @return true if the birthDate came before deathDate.
     * */
    private static boolean consistent(Date birthDate, Date deathDate)
    {
        if (birthDate == null)
            return false;
        else if (deathDate == null)
            return true;
        else
            return (birthDate.precedes(deathDate)
                    || birthDate.equals(deathDate));
    }

}
