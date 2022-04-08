package chapter_seven;

public class Patient extends Person
{
    private Doctor doctor;

    public Patient(String name,
                   Doctor doctor)
    {
        super(name);
        this.doctor = doctor;
    }

    public Patient(Person person,
                   Doctor doctor)
    {
        super(person);
        this.doctor = doctor;
    }


    public Doctor getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    public String toString()
    {
        return super.toString() + ", Patient Doctor: " + doctor.toString();
    }

    public boolean equals(Patient other)
    {
        return super.equals(other)
                && doctor.equals(other.doctor);
    }
}
