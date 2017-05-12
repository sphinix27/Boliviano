package org.fundacionjala.at04.boliviano;

/**
 * Created by Zero on 11/5/2017.
 */
public class Boliviano {

    private double amount;

    public Boliviano()
    {
        this(0);
    }

    public Boliviano(double amount)
    {
        this.amount = (int) amount;
    }

    @Override
    public String toString()
    {
        return String.format("Bs %.2f",  amount);
    }

    @Override
    public boolean equals(Object o)
    {
        return (o instanceof Boliviano);
    }

    public Boliviano minus(Boliviano substractedValue)
    {
        return amount - substractedValue.amount;
    }
}
