package chapter_four;

import java.text.DecimalFormat;

public class CalAge
{
    private String date;
    private String currentDate;


    private static final CalAge instance = new CalAge();

    public static CalAge getInstance(){ return instance; }

    private CalAge() {}

    public void setDate(String date, String currentDate)
    {
        this.date = date;
        this.currentDate = currentDate;
    }

    public String getYears()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(calcDays()/365.0);
    }

    public String getMonths()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(calcDays()/30.0);
    }

    public String getWeeks()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(calcDays()/7.0);
    }

    public String getDays()
    {
        return calcDays() + "";
    }

    public long getHours()
    {
        return calcDays() * 24;
    }

    public long getMinutes()
    {
        return getHours() * 60;
    }

    public long getSeconds()
    {
        return getMinutes() * 60;
    }

    private int calcDays()
    {
        int days = 0;
        try {
            int startYear = Integer.parseInt(date.substring(0, 4));
            int endYear = Integer.parseInt(currentDate.substring(0, 4));
            int startMonth = Integer.parseInt(date.substring(5, 7));
            int endMonth = Integer.parseInt(currentDate.substring(5, 7));
            int startDay = Integer.parseInt(date.substring(8));
            int endDay = Integer.parseInt(currentDate.substring(8));

            if (startMonth == endMonth && endYear == startYear){
                return endDay - startDay;
            }
            days += getMonthDays(startMonth, startYear) - startDay;
            days += endDay;

            startMonth++;
            while (true)
            {
                if (startMonth == endMonth && endYear == startYear)
                    break;
                days += getMonthDays(startMonth, startYear);
                startMonth++;
                if (startMonth % 13 == 0)
                {
                    startYear++;
                    startMonth = 1;
                }
            }


        }catch (Exception e){
            throw new IllegalArgumentException("Invalid Date Format");
        }
        return days;
    }


    private int getMonthDays(int month, int year)
    {
        int days_ = 31;
         switch (month)
         {
            case 2 -> days_ = (isLeapYear(year))? 29 : 28;
            case 4, 6, 9, 11 -> days_ = 30;
         }
         return days_;
    }



    private boolean isLeapYear(int year)
    {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }





}
