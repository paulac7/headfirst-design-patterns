/**
 * Copyright © 2024 Lhasa Limited
 * File created: 17/01/2024 by PaulC
 * Creator : PaulC
 */
package pizza;

import ingredients.factory.PizzaIngredientsFactory;

/**
 * @author PaulC
 * @since 17/01/2024
 */
public class ClamPizza extends Pizza
{

	PizzaIngredientsFactory ingredientsFactory;

	public ClamPizza(PizzaIngredientsFactory ingredientsFactory)
	{
		this.ingredientsFactory = ingredientsFactory;
	}

	@Override
	public void prepare()
	{
		System.out.println("Preparing " + getName());
		dough = ingredientsFactory.createDough();
		sauce = ingredientsFactory.createSauce();
		cheese = ingredientsFactory.createCheese();
		clams = ingredientsFactory.createClam();

		System.out.println("Ingredients:");
		System.out.println(dough.toString());
		System.out.println(sauce.toString());
		System.out.println(cheese.toString());
		System.out.println(clams.toString());
		System.out.println();
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