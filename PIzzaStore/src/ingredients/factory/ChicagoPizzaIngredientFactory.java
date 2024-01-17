/**
 * Copyright © 2024 Lhasa Limited
 * File created: 17/01/2024 by PaulC
 * Creator : PaulC
 */
package ingredients.factory;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Vegetable;
import ingredients.impl.FrozenClams;
import ingredients.impl.Mozzarella;
import ingredients.impl.PlumTomatoSauce;
import ingredients.impl.SlicedPepperoni;
import ingredients.impl.ThickCrustDough;

/**
 * @author PaulC
 * @since 17/01/2024
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientsFactory
{
	@Override public Dough createDough()
	{
		return new ThickCrustDough();
	}

	@Override public Sauce createSauce()
	{
		return new PlumTomatoSauce();
	}

	@Override public Cheese createCheese()
	{
		return new Mozzarella();
	}

	@Override public Vegetable[] createVeggies()
	{
		return new Vegetable[0];
	}

	@Override public Pepperoni createPepperoni()
	{
		return new SlicedPepperoni();
	}

	@Override public Clams createClam()
	{
		return new FrozenClams();
	}
}
/* ---------------------------------------------------------------------*
 * This software is the confidential and proprietary
 * information of Lhasa Limited
 * Granary Wharf House, 2 Canal Wharf, Leeds, LS11 5PS
 * ---
 * No part of this confidential information shall be disclosed
 * and it shall be used only in accordance with the terms of a
 * written license agreement entered into by holder of the information
 * with LHASA Ltd.
 * --------------------------------------------------------------------- */