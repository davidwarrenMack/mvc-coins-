package models;


import java.math.BigDecimal;


public class Quarter
{
    int year;

    public int getQuarterYear()
    {
        return year;
    }
    public Quarter(int year)
    {
        this.year = year;

    }
    public BigDecimal getQuartersFaceValue()
    {
        BigDecimal getValue = new BigDecimal("0.25");
        return getValue;
    }
    public BigDecimal getQuartersCollectibleValue()
    {

        BigDecimal faceValue = getQuartersFaceValue();
        BigDecimal multiplier = new BigDecimal("0.22");

        BigDecimal value;

        if (year < 1923)
        {
            BigDecimal yearsOlder = new BigDecimal(1923 - year);
            BigDecimal extraValue = yearsOlder.multiply(multiplier);
            value = faceValue.add(extraValue);
        } else
        {
            value = faceValue;
        }

        return value;
    }
}
