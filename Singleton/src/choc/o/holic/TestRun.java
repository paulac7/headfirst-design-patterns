/**
 * Copyright © 2024 Lhasa Limited
 * File created: 23/01/2024 by PaulC
 * Creator : PaulC
 */
package choc.o.holic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author PaulC
 * @since 23/01/2024
 */
public class TestRun
{
	public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException
	{
		System.out.println("Using class to create two ChocolateBoilerClass instances...");
		ChocolateBoilerClass boiler = ChocolateBoilerClass.getInstance();
		ChocolateBoilerClass boiler2 = ChocolateBoilerClass.getInstance();

		System.out.println("Same instance using reference check " + (boiler == boiler2));
		System.out.println("Same instance using equals " + (boiler.equals(boiler2)));

		System.out.println("Using reflection to create an instance of ChocolateBoilerClass...");
		Constructor<ChocolateBoilerClass> pcc = ChocolateBoilerClass.class.getDeclaredConstructor();
		pcc.setAccessible(true);
		ChocolateBoilerClass boilerReflect = pcc.newInstance();

		System.out.println("Comparing to previously created singleton. Different instances " + !boiler.equals(boilerReflect));

		System.out.println();
		System.out.println("Using enum to create ChocolateBoilerClass...");
		ChocolateBoilerEnum eBoiler = ChocolateBoilerEnum.INSTANCE;
		ChocolateBoilerEnum eBoiler2 = ChocolateBoilerEnum.INSTANCE;

		System.out.println("enums cannot be instantiated so safer......");
		System.out.println("Same instance using reference check " + (eBoiler == eBoiler2));
		System.out.println("Same instance using equals " + (eBoiler.equals(eBoiler2)));
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