package models;

import java.math.BigDecimal;


public class Penny
{
    private int year;

    public int getPennyYear()
    {
        return year;
    }
    public Penny(int year)
    {
        this.year = year;

    }
    public BigDecimal getPenniesFaceValue()
    {
        BigDecimal getValue = new BigDecimal("0.01");
        return getValue;
    }
    public BigDecimal getPenniesCollectibleValue()
    {

        BigDecimal faceValue = getPenniesFaceValue();
        BigDecimal multiplier = new BigDecimal("0.03");

        BigDecimal value;

        if (year < 1945)
        {
            BigDecimal yearsOlder = new BigDecimal(1945 - year);
            BigDecimal extraValue = yearsOlder.multiply(multiplier);
            value = faceValue.add(extraValue);
        } else
        {
            value = faceValue;
        }

        return value;
    }
}

