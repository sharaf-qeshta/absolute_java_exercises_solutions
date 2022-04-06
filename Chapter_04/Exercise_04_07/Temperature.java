package chapter_four;

import java.text.DecimalFormat;

public class Temperature
{
    private double degree = 0.0;
    private char scale = 'C';


    public Temperature(char scale){ this.scale = scale; }

    public Temperature(double degree){ this.degree = degree; }

    public Temperature(double degree, char scale){ this.degree = degree; this.scale = scale; }

    public Temperature(){}


    public double getCelsius()
    {
        // DegreesC = 5(degreesF - 32)/9
        if (scale == 'C')
            return degree;
        return 5 * (degree - 32) / 9;
    }


    public double getFahrenheit()
    {
        // DegreesF = (9(degreesC)/5) + 32;
        if (scale == 'F')
            return degree;
        return (9*(degree)/5) + 32;
    }

    public void setDegree(double degree){
        this.degree = degree;
    }

    public void setScale(char scale){
        this.scale = scale;
    }

    public void set(double degree, char scale){
        this.degree = degree;
        this.scale = scale;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Temperature){
            return Math.abs(getCelsius()  - ((Temperature) o).getCelsius()) < 0.00001;
        }
        return false;
    }


    public boolean lessThan(Temperature temperature)
    {
        return getCelsius() - temperature.getCelsius() < 0;
    }

    public boolean greaterThan(Temperature temperature)
    {
        return getCelsius() - temperature.getCelsius() > 0;
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(degree) + " degrees " + scale;
    }
}
