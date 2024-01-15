package pizzastore;

import pizza.Pizza;

public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // factory method
    public abstract Pizza createPizza(String type);
}
