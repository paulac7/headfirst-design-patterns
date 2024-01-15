package starbuzz.condiments;

import starbuzz.Beverage;
import starbuzz.BeverageSize;
import starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator
{

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public BeverageSize getSize()
    {
        return beverage.getSize();
    }

    @Override
    public double cost()
    {
        return getSoyCost() + beverage.cost();
    }

    private double getSoyCost()
    {
        switch (this.getSize())
        {
            case TALL -> { return 0.10; }
            case GRANDE -> { return 0.15; }
            case VENTI -> { return 0.20; }
            case null -> { return 0.00; }
        }
    }
}
