package chapter_five;

import java.text.DecimalFormat;

public class InternationalCall
{
    String sourcePhoneNumber;
    String destinationPhoneNumber;
    String sourceCountryCode;
    String destinationCountryCode;
    int currentCallDuration; // seconds
    int totalCallsDuration; // seconds
    double currentCallPrice;
    double totalCallsPrice;

    public InternationalCall(String sourcePhoneNumber, String destinationPhoneNumber,
                             String sourceCountryCode, String destinationCountryCode,
                             int currentCallDuration)
    {
        setSourcePhoneNumber(sourcePhoneNumber);
        setDestinationPhoneNumber(destinationPhoneNumber);
        setSourceCountryCode(sourceCountryCode);
        setDestinationCountryCode(destinationCountryCode);
        setCurrentCallDuration(currentCallDuration);
        setTotalCallsDuration(currentCallDuration + getTotalCallsDuration());
        setTotalCallsPrice(getCurrentCallPrice() + getTotalCallsPrice());
    }


    public void makeCall(String sourcePhoneNumber, String destinationPhoneNumber,
                         String sourceCountryCode, String destinationCountryCode,
                         int currentCallDuration)
    {
        setSourcePhoneNumber(sourcePhoneNumber);
        setDestinationPhoneNumber(destinationPhoneNumber);
        setSourceCountryCode(sourceCountryCode);
        setDestinationCountryCode(destinationCountryCode);
        setCurrentCallDuration(currentCallDuration);
        setTotalCallsDuration(currentCallDuration + getTotalCallsDuration());
        setTotalCallsPrice(getCurrentCallPrice() + getTotalCallsPrice());
    }


    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Total Calls Duration " + getTotalCallsDuration() + ", Total Cost $" + df.format(getTotalCallsPrice());
    }

    public String getSourcePhoneNumber()
    {
        return sourcePhoneNumber;
    }


    public void setSourcePhoneNumber(String sourcePhoneNumber)
    {
        if (!sourcePhoneNumber.isEmpty())
            this.sourcePhoneNumber = sourcePhoneNumber;
    }

    public String getDestinationPhoneNumber()
    {
        return destinationPhoneNumber;
    }

    public void setDestinationPhoneNumber(String destinationPhoneNumber)
    {
        if (!destinationPhoneNumber.isEmpty())
            this.destinationPhoneNumber = destinationPhoneNumber;
    }

    public String getSourceCountryCode()
    {
        return sourceCountryCode;
    }

    public void setSourceCountryCode(String sourceCountryCode)
    {
        if (!sourceCountryCode.isEmpty())
            this.sourceCountryCode = sourceCountryCode;
    }

    public String getDestinationCountryCode()
    {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode)
    {
        if (!destinationCountryCode.isEmpty())
            this.destinationCountryCode = destinationCountryCode;
    }

    public int getCurrentCallDuration()
    {
        return currentCallDuration;
    }

    public void setCurrentCallDuration(int currentCallDuration)
    {
        if (currentCallDuration > 0)
            this.currentCallDuration = currentCallDuration;
    }

    public int getTotalCallsDuration()
    {
        return totalCallsDuration;
    }

    private void setTotalCallsDuration(int totalCallsDuration)
    {
        if (totalCallsDuration > 0)
            this.totalCallsDuration = totalCallsDuration;
    }

    public double getCurrentCallPrice()
    {
        int minutes = currentCallDuration / 60;
        double price;
        if (minutes <= 1)
            price = 0.60;
        else if (minutes <= 2)
            price = 0.40;
        else
            price = 0.20;

        double discount = 0;
        if (minutes > 10 && minutes <= 20)
            discount = 0.08;
        else if (minutes > 20)
            discount = 0.1;

        double totalPrice = (currentCallDuration / 60.0) * price;
        return totalPrice - (totalPrice * discount);
    }

    private void setCurrentCallPrice(double currentCallPrice)
    {
        if (currentCallPrice > 0)
            this.currentCallPrice = currentCallPrice;
    }

    public double getTotalCallsPrice()
    {
        return totalCallsPrice;
    }

    private void setTotalCallsPrice(double totalCallsPrice)
    {
        if (totalCallsPrice > 0)
            this.totalCallsPrice = totalCallsPrice;
    }
}
