package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoinCollection
{
    List<Penny> pennies = new ArrayList<>();
    List<Nickel> nickels = new ArrayList<>();
    List<Dime> dimes = new ArrayList<>();
    List<Quarter> quarters = new ArrayList<>();

    public List<Penny> getPennies()
    {
        return pennies;
    }

    public List<Nickel> getNickels()
    {
        return nickels;
    }

    public List<Dime> getDimes()
    {
        return dimes;
    }

    public List<Quarter> getQuarters()
    {
        return quarters;
    }




    public CoinCollection(int quarterCount, int dimeCount, int nickelCount, int pennyCount)
    {

        for (int i = 0; i < pennyCount; i++)
        {
            Penny penny = new Penny(1935);
            pennies.add(penny);
        }

        for (int i = 0; i < nickelCount; i++)
        {
            Nickel nickel = new Nickel(1925);
            nickels.add(nickel);
        }

        for (int i = 0; i < dimeCount; i++)
        {
            Dime dime = new Dime(2017);
            dimes.add(dime);
        }

        for (int i = 0; i < quarterCount; i++)
        {
            Quarter quarter = new Quarter(1913);
            quarters.add(quarter);
        }
    }
    public void addPenny(int year)
    {
        Penny penny = new Penny(year);
        pennies.add(penny);
    }
    public void addNickel(int year)
    {
        Nickel nickel = new Nickel(year);
        nickels.add(nickel);
    }
    public void addDime(int year)
    {
        Dime dime = new Dime(year);
        dimes.add(dime);
    }
    public void addQuarter(int year)
    {
        Quarter quarter = new Quarter(year);
        quarters.add(quarter);
    }




    public BigDecimal getPenniesFaceValue()
    {
        BigDecimal pennyValue = new BigDecimal("0");
        for (Penny pennyListValue : pennies)
        {
            pennyValue = pennyValue.add(pennyListValue.getPenniesFaceValue());

        }
        return pennyValue;

    }
    public BigDecimal getNickelsFaceValue()
    {
        BigDecimal nickelValue = new BigDecimal("0");
        for (Nickel nickelListValue : nickels)
        {
            nickelValue = nickelValue.add(nickelListValue.getNickelsFaceValue());

        }
        return nickelValue;
    }
    public BigDecimal getDimesFaceValue()
    {
        BigDecimal dimeValue = new BigDecimal("0");
        for (Dime dimeListValue : dimes)
        {
            dimeValue = dimeValue.add(dimeListValue.getDimesFaceValue());

        }
        return dimeValue;
    }
    public BigDecimal getQuartersFaceValue()
    {
        BigDecimal quarterValue = new BigDecimal("0");
        for (Quarter quarterListValue : quarters)
        {
            quarterValue = quarterValue.add(quarterListValue.getQuartersFaceValue());

        }
        return quarterValue;
    }
    public BigDecimal getPenniesCollectibleValue()
    {
        BigDecimal pennyValue = new BigDecimal("0");
        for (Penny pennyListValue : pennies)
        {
            pennyValue = pennyValue.add(pennyListValue.getPenniesCollectibleValue());

        }
        return pennyValue;
    }
    public BigDecimal getNickelsCollectibleValue()
    {
        BigDecimal nickelValue = new BigDecimal("0");
        for (Nickel nickelListValue : nickels)
        {
            nickelValue = nickelValue.add(nickelListValue.getNickelsCollectibleValue());

        }
        return nickelValue;
    }
    public BigDecimal getDimesCollectibleValue()
    {
        BigDecimal dimeValue = new BigDecimal("0");
        for (Dime dimeListValue : dimes)
        {
            dimeValue = dimeValue.add(dimeListValue.getDimesCollectibleValue());

        }
        return dimeValue;
    }
    public BigDecimal getQuartersCollectibleValue()
    {
        BigDecimal quarterValue = new BigDecimal("0");
        for (Quarter quarterListValue : quarters)
        {
            quarterValue = quarterValue.add(quarterListValue.getQuartersCollectibleValue());

        }
        return quarterValue;
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal result = null;
        result = getPenniesFaceValue().add(getNickelsFaceValue());
        result = result.add(getDimesFaceValue());
        result = result.add(getQuartersFaceValue());

        return result;
    }
    public BigDecimal getCollectibleValue()
    {
        BigDecimal result = null;
        result = getPenniesCollectibleValue().add(getNickelsCollectibleValue());
        result = result.add(getDimesCollectibleValue());
        result = result.add(getQuartersCollectibleValue());

        return result;
    }

}

