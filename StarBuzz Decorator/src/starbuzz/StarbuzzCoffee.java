package starbuzz;

import starbuzz.coffee.DarkRoast;
import starbuzz.coffee.Espresso;
import starbuzz.coffee.HouseBlend;
import starbuzz.condiments.Mocha;
import starbuzz.condiments.Soy;
import starbuzz.condiments.Whip;

public class StarbuzzCoffee
{
    public static void main(String[] args)
    {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(BeverageSize.VENTI);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

    }
}