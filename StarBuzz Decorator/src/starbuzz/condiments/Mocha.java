package starbuzz.condiments;

import starbuzz.Beverage;
import starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator
{
    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost()
    {
        return getMochaCost() + beverage.cost();
    }

    private double getMochaCost()
    {
        switch (beverage.getSize())
        {
            case TALL -> { return 0.15; }
            case GRANDE -> { return 0.20; }
            case VENTI -> { return 0.25; }
            case null -> { return 0.00; }
        }
    }
}
