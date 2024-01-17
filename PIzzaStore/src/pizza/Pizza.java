package pizza;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Vegetable;

public abstract class Pizza
{

    private String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Vegetable[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public abstract void prepare();

    public void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
