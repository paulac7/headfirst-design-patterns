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
import ingredients.impl.BruschettaSauce;
import ingredients.impl.Calamari;
import ingredients.impl.GoatsCheese;
import ingredients.impl.SlicedPepperoni;
import ingredients.impl.VeryThinCrustDough;
import ingredients.impl.veggies.Broccoli;
import ingredients.impl.veggies.EggPlant;
import ingredients.impl.veggies.Mushroom;
import ingredients.impl.veggies.RedOnion;

/**
 * @author PaulC
 * @since 17/01/2024
 */
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientsFactory
{
	@Override public Dough createDough()
	{
		return new VeryThinCrustDough();
	}

	@Override public Sauce createSauce()
	{
		return new BruschettaSauce();
	}

	@Override public Cheese createCheese()
	{
		return new GoatsCheese();
	}

	@Override public Vegetable[] createVeggies()
	{
		return new Vegetable[] { new Mushroom(), new EggPlant(), new Broccoli(), new RedOnion() };
	}

	@Override public Pepperoni createPepperoni()
	{
		return new SlicedPepperoni();
	}

	@Override public Clams createClam()
	{
		return new Calamari();
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