package pizzastore.franchise;

import ingredients.factory.NYPizzaIngedientFactory;
import ingredients.factory.PizzaIngredientsFactory;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.VeggiePizza;
import pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore
{

    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientsFactory factory = new NYPizzaIngedientFactory();

		switch (type)
		{
			case "cheese" ->
			{
				pizza = new CheesePizza(factory);
				pizza.setName("New York Style Cheese Pizza");
			}
			case "pepperoni" ->
			{
				pizza = new PepperoniPizza(factory);
				pizza.setName("New York Style Pepperoni Pizza");
			}
			case "clam" ->
			{
				pizza = new ClamPizza(factory);
				pizza.setName("New York Style Clam Pizza");
			}
			case "veggie" ->
			{
				pizza = new VeggiePizza(factory);
				pizza.setName("New York Style Veggie Pizza");
			}
		}
        return pizza;
    }
}
