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
import ingredients.impl.ReggianoCheese;
import ingredients.Sauce;
import ingredients.impl.ThinCrustDough;
import ingredients.Vegetable;
import ingredients.impl.FreshClams;
import ingredients.impl.veggies.Garlic;
import ingredients.impl.MarinaraSauce;
import ingredients.impl.veggies.Mushroom;
import ingredients.impl.veggies.Onion;
import ingredients.impl.veggies.RedPepper;
import ingredients.impl.SlicedPepperoni;

/**
 * @author PaulC
 * @since 17/01/2024
 */
public class NYPizzaIngedientFactory implements PizzaIngredientsFactory
{
	@Override
	public Dough createDough()
	{
		return new ThinCrustDough();
	}

	@Override public Sauce createSauce()
	{
		return new MarinaraSauce();
	}

	@Override public Cheese createCheese()
	{
		return new ReggianoCheese();
	}

	@Override public Vegetable[] createVeggies()
	{
		return new Vegetable[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
	}

	@Override public Pepperoni createPepperoni()
	{
		return new SlicedPepperoni();
	}

	@Override public Clams createClam()
	{
		return new FreshClams();
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