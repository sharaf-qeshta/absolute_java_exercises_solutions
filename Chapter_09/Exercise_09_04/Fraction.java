package chapter_nine;

public class Fraction
{
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) throws DenominatorIsZeroException
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction(){}

    public void displayFraction()
    {
        System.out.println(numerator + "/" + denominator);
    }


    public Fraction getLowestTerm() throws DenominatorIsZeroException
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


    public boolean equals(Fraction fraction) throws DenominatorIsZeroException
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

    public void setDenominator(int denominator) throws DenominatorIsZeroException
    {
        if (denominator != 0)
            this.denominator = denominator;
        else
            throw new DenominatorIsZeroException();
    }
}
