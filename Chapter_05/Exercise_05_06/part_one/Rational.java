package chapter_five;

public class Rational
{
    private int numerator, denominator;

    public Rational(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
        normalize();
    }

    public Rational(int numerator) {
        setNumerator(numerator);
        setDenominator(1);
        normalize();
    }

    private void normalize()
    {
        if (getDenominator() < 0)
        {
            setDenominator(getDenominator() * -1);
            setNumerator(getNumerator() * -1);
        }
    }

    public boolean equals(Rational rational)
    {
        return getDenominator() * rational.getNumerator()
                == getNumerator() * rational.getDenominator();
    }

    public String toString()
    {
        return getNumerator() + "/" + getDenominator();
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

    // Arithmetic operations
    public static Rational add(Rational r1, Rational r2)
    {
        return new Rational(r1.getDenominator() * r2.getNumerator()
                +  r1.getNumerator() * r2.getDenominator(), r1.getDenominator() * r2.getDenominator());
    }

    public static Rational subtract(Rational r1, Rational r2)
    {
        return new Rational(r1.getDenominator() * r2.getNumerator()
                -  r1.getNumerator() * r2.getDenominator(), r1.getDenominator() * r2.getDenominator());
    }

    public static Rational multiply(Rational r1, Rational r2)
    {
        return new Rational(r1.getNumerator() * r2.getNumerator(), r1.getDenominator() * r2.getDenominator());
    }

    public static Rational divide(Rational r1, Rational r2)
    {
        return new Rational(r1.getNumerator() * r2.getDenominator(), r1.getDenominator() * r2.getNumerator());
    }

}
