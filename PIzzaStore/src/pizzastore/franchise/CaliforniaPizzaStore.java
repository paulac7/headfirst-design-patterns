package pizzastore.franchise;

import ingredients.factory.CaliforniaPizzaIngredientFactory;
import ingredients.factory.PizzaIngredientsFactory;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.VeggiePizza;
import pizzastore.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore
{

    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientsFactory factory = new CaliforniaPizzaIngredientFactory();

		switch (type)
		{
			case "cheese" ->
			{
				pizza = new CheesePizza(factory);
				pizza.setName("California Style Cheese Pizza");
			}
			case "pepperoni" ->
			{
				pizza = new PepperoniPizza(factory);
				pizza.setName("California Style Pepperoni Pizza");
			}
			case "clam" ->
			{
				pizza = new ClamPizza(factory);
				pizza.setName("California Style Clam Pizza");
			}
			case "veggie" ->
			{
				pizza = new VeggiePizza(factory);
				pizza.setName("California Style Veggie Pizza");
			}
		}
        return pizza;
    }
}
