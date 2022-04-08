package chapter_seven;

public class Doctor extends SalariedEmployee
{
    private String specialty;
    private double officeVisitFee;

    public Doctor(String specialty,
                  double officeVisitFee)
    {
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    public Doctor(String theName, Date theDate,
                  double theSalary, String specialty,
                  double officeVisitFee)
    {
        super(theName, theDate, theSalary);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }


    public Doctor(SalariedEmployee originalObject,
                  String specialty, double officeVisitFee)
    {
        super(originalObject);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public double getOfficeVisitFee()
    {
        return officeVisitFee;
    }

    public void setOfficeVisitFee(double officeVisitFee)
    {
        this.officeVisitFee = officeVisitFee;
    }

    public boolean equals(Doctor other)
    {
        return super.equals(other)
                && getSpecialty().equals(other.getSpecialty())
                && getOfficeVisitFee() == other.getOfficeVisitFee();
    }


    public String toString()
    {
        return super.toString()
                + "\n Speciality: " + getSpecialty()
                + "\n Office Visit Fee: $" + getOfficeVisitFee();
    }
}

