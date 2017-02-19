package models;

import java.math.BigDecimal;

public class Dime
{
    int year;
    public int getDimeYear()
    {
        return year;
    }
    Dime(int year)
    {
        this.year = year;

    }
    public BigDecimal getDimesFaceValue()
    {
        BigDecimal getValue = new BigDecimal("0.10");
        return getValue;
    }
    public BigDecimal getDimesCollectibleValue()
    {


        return getDimesFaceValue();
    }
}
