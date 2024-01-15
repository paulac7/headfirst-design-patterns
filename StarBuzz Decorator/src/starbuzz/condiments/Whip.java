package starbuzz.condiments;

import starbuzz.Beverage;
import starbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator
{

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost()
    {
        return getWhipCost() + beverage.cost();
    }

    private double getWhipCost()
    {
        switch (beverage.getSize())
        {
            case TALL -> { return 0.05; }
            case GRANDE -> { return 0.10; }
            case VENTI -> { return 0.15; }
            case null -> { return 0.00; }
        }
    }
}
