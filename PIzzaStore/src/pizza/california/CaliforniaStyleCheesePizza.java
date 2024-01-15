package pizza.california;

import pizza.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza
{
    public CaliforniaStyleCheesePizza()
    {
        this.setName("California Style Cheese Pizza");
        this.setDough("Medium Crust Dough");
        this.setSauce("Cheery Tomato Sauce");

        this.getToppings().add("Extra Mozzarella Cheese");
    }
}
