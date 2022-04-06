package chapter_five;

public class Fraction
{
    private int numerator, denominator;

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void displayFraction()
    {
        System.out.println(numerator + "/" + denominator);
    }


    public Fraction getLowestTerm()
    {
        int max = Math.max(numerator, denominator);
        int min = Math.min(numerator, denominator);
        int commonFactor = 1;
        for (int i = max; i >= min; i--)
        {
            if (max % i == 0 && min % i == 0)
            {
                commonFactor = i;
                break;
            }
        }
        return new Fraction(getNumerator()/commonFactor, getDenominator()/commonFactor);
    }


    public boolean equals(Fraction fraction)
    {
        Fraction fraction1 = fraction.getLowestTerm();
        Fraction fraction2 = getLowestTerm();

        return fraction1.getNumerator() == fraction2.getNumerator()
                && fraction1.getDenominator() == fraction2.getDenominator();
    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator)
    {
        if (denominator != 0)
            this.denominator = denominator;
    }
}
