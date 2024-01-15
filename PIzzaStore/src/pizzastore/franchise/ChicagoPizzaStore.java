package pizzastore.franchise;

import pizza.Pizza;
import pizza.chicago.ChicagoStyleCheesePizza;
import pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore
{

    @Override
    public Pizza createPizza(String type)
    {
        if (type.equals("cheese"))
        {
            return new ChicagoStyleCheesePizza();
        }
//        else if (type.equals("pepperoni"))
//        {
//            return new ChicagoStylePepperoniPizza();
//        }
//        else if (type.equals("clam"))
//        {
//            return new ChicagoStyleClamPizza();
//        }
//        else if (type.equals("veggie"))
//        {
//            return new ChicagoStyleVeggiePizza();
//        }
        return null;
    }
}
