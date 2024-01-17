package pizzastore.franchise;

import ingredients.factory.NYPizzaIngedientFactory;
import ingredients.factory.PizzaIngredientsFactory;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore
{

    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientsFactory factory = new NYPizzaIngedientFactory();

        if (type.equals("cheese"))
        {
            pizza = new CheesePizza(factory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (type.equals("pepperoni"))
        {
            pizza = new PepperoniPizza(factory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        else if (type.equals("clam"))
        {
            pizza = new ClamPizza(factory);
            pizza.setName("New York Style Clam Pizza");
        }
//        else if (type.equals("veggie"))
//        {
//            return new NYStyleVeggiePizza();
//        }
        return pizza;
    }
}
