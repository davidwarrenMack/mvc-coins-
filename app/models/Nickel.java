package models;

import java.math.BigDecimal;

public class Nickel
{
    private int year;

    public int getNickelYear()
    {
        return year;
    }
    public Nickel(int year)
    {
        this.year = year;

    }
    public BigDecimal getNickelsFaceValue()
    {
        BigDecimal getValue = new BigDecimal("0.05");
        return getValue;
    }
    public BigDecimal getNickelsCollectibleValue()
    {

        BigDecimal faceValue = getNickelsFaceValue();
        BigDecimal multiplier = new BigDecimal("0.10");

        BigDecimal value;

        if (year < 1935)
        {
            BigDecimal yearsOlder = new BigDecimal(1935 - year);
            BigDecimal extraValue = yearsOlder.multiply(multiplier);
            value = faceValue.add(extraValue);
        } else
        {
            value = faceValue;
        }

        return value;
    }
}
