package chapter_five;

public class Rational
{
    private int numerator, denominator;

    public Rational(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Rational(int numerator)
    {
        setNumerator(numerator);
        setDenominator(1);
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
        normalize();
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator)
    {
        if (denominator != 0)
            this.denominator = denominator;
        normalize();
    }

    // Arithmetic operations
    public static Rational add(Rational r1, Rational r2)
    {
        return new Rational(r1.getDenominator() * r2.getNumerator()
                +  r1.getNumerator() * r2.getDenominator(), r1.getDenominator() * r2.getDenominator());
    }

    public Rational add(Rational r)
    {
        return new Rational(getDenominator() * r.getNumerator()
                +  getNumerator() * r.getDenominator(), getDenominator() * r.getDenominator());
    }


    public static Rational subtract(Rational r1, Rational r2)
    {
        return new Rational(r1.getDenominator() * r2.getNumerator()
                -  r1.getNumerator() * r2.getDenominator(), r1.getDenominator() * r2.getDenominator());
    }

    public Rational subtract(Rational r)
    {
        return new Rational(getDenominator() * r.getNumerator()
                -  getNumerator() * r.getDenominator(), getDenominator() * r.getDenominator());
    }

    public static Rational multiply(Rational r1, Rational r2)
    {
        return new Rational(r1.getNumerator() * r2.getNumerator(), r1.getDenominator() * r2.getDenominator());
    }

    public Rational multiply(Rational r)
    {
        return new Rational(getNumerator() * r.getNumerator(), getDenominator() * r.getDenominator());
    }

    public static Rational divide(Rational r1, Rational r2)
    {
        return new Rational(r1.getNumerator() * r2.getDenominator(), r1.getDenominator() * r2.getNumerator());
    }

    public Rational divide(Rational r)
    {
        return new Rational(getNumerator() * r.getDenominator(), getDenominator() * r.getNumerator());
    }

}
