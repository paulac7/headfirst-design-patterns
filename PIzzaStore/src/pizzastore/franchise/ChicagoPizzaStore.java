package pizzastore.franchise;

import ingredients.factory.ChicagoPizzaIngredientFactory;
import ingredients.factory.PizzaIngredientsFactory;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.VeggiePizza;
import pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore
{

    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientsFactory factory = new ChicagoPizzaIngredientFactory();

		switch (type)
		{
			case "cheese" ->
			{
				pizza = new CheesePizza(factory);
				pizza.setName("Chicago Style Cheese Pizza");
			}
			case "pepperoni" ->
			{
				pizza = new PepperoniPizza(factory);
				pizza.setName("Chicago Style Pepperoni Pizza");
			}
			case "clam" ->
			{
				pizza = new ClamPizza(factory);
				pizza.setName("Chicago Style Clam Pizza");
			}
			case "veggie" ->
			{
				pizza = new VeggiePizza(factory);
				pizza.setName("Chicago Style Veggie Pizza");
			}
		}
        return pizza;
    }
}
