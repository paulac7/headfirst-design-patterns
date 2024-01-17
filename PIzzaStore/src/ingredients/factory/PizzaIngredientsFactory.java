package ingredients.factory;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Vegetable;

/**
 * Copyright © 2024 Lhasa Limited
 * File created: 17/01/2024 by PaulC
 * Creator : PaulC
 */
public interface PizzaIngredientsFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Vegetable[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
