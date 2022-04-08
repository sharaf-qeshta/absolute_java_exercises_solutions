package chapter_seven;

public class Billing
{
    private Doctor doctor;
    private Patient patient;
    private double fees;

    public Billing() {}

    public Billing(Doctor doctor,
                   Patient patient)
    {
        this.doctor = doctor;
        this.patient = patient;
    }


    public Billing(Patient patient)
    {
        this.patient = patient;
    }

    public Billing(Doctor doctor, Patient patient,
                   double fees)
    {
        this.doctor = doctor;
        this.patient = patient;
        this.fees = fees;
    }

    public Billing(Billing billing)
    {
        this.doctor = billing.getDoctor();
        this.patient = billing.getPatient();
        this.fees = billing.getFees();
    }


    public Doctor getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    public Patient getPatient()
    {
        return patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }

    public double getFees()
    {
        return fees;
    }

    public void setFees(double fees)
    {
        this.fees = fees;
    }


    public String toString()
    {
        return doctor.toString() + patient.toString() + ", Fees: $" + fees;
    }

    public boolean equals(Billing other)
    {
        return doctor.equals(other.getDoctor())
                && patient.equals(other.getPatient())
                && fees == other.getFees();
    }
}
