package pizza.chicago;

import pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza
{
    public ChicagoStyleCheesePizza()
    {
        this.setName("Chicago Style Deep Dish Cheese Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");

        this.getToppings().add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
