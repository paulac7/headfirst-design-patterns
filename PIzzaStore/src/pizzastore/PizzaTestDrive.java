package pizzastore;

import pizza.Pizza;
import pizzastore.franchise.CaliforniaPizzaStore;
import pizzastore.franchise.ChicagoPizzaStore;
import pizzastore.franchise.NYPizzaStore;

public class PizzaTestDrive
{
    public static void main(String[] args)
    {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaPizzaStore.orderPizza("pepperoni");
        System.out.println("Paul ordered a " + pizza.getName() + "\n");

    }
}