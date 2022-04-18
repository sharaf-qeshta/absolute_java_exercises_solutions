package chapter_thirteen;

public class City implements Comparable<City>
{
    private String cityName;
    private double temperature;

    public City(String cityName, double temperature)
    {
        this.cityName = cityName;
        this.temperature = temperature;
    }


    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City o)
    {
        return (int) (getTemperature() - o.getTemperature());
    }

    public String toString(){
        return "City: " + getCityName() + ", Temperature: " + getTemperature();
    }
}
