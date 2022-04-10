package chapter_nine;

public class DateConverter
{
    private int year, month, day;

    public int getYear()
    {
        return year;
    }

    public void setYear(int year) throws YearException
    {
        if (year > 999 && year < 3001)
            this.year = year;
        else
            throw new YearException();
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month) throws MonthException
    {
        if (month > 0 && month < 13)
            this.month = month;
        else
            throw new MonthException();
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day) throws DayException
    {
        int monthDays = getDays(month);
        if (day > 0 && day < monthDays+1)
            this.day = day;
        else
            throw new DayException("The Day Number Should be between 1 and "
                    +  monthDays  + " (inclusive)");
    }

    public int getDays(int index)
    {
        return switch (index)
        {
            case 1, 12, 8, 7, 5, 10, 3 -> 31;
            case 2 -> (isLeapYear(getYear()))? 29: 28;
            case 4, 11, 9, 6 -> 30;
            default -> -1;
        };
    }

    public static String getMonthName(int index)
    {
        return switch (index)
        {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Index";
        };
    }

    public boolean isLeapYear(int year)
    {
        if (year % 4 != 0)
            return false;
        else if (year % 400 == 0)
            return true;
        else return year % 100 != 0;
    }


    public String toString()
    {
        return getMonthName(month) + ", " + day + ", " + year;
    }
}
