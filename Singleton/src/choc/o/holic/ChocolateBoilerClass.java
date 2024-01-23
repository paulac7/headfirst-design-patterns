/**
 * Copyright © 2024 Lhasa Limited
 * File created: 23/01/2024 by PaulC
 * Creator : PaulC
 */
package choc.o.holic;

/**
 * Example of the Singleton Pattern.
 *
 * Note that for thread safety there are alternative approaches
 * 1) Eagerly create the object (still using the getInstance() static factory method)
 * 2) Synchronize the getInstance() method in its entirety
 *
 * Each method has its pros/cons
 * If object creation is expensive then 1) may not be optimum
 * If the singleton getInstance() method is on a high throughout code path, then this is not the most
 * performant example, and double-checked locking is preferred
 */
public class ChocolateBoilerClass
{

	// volatile keyword needed to ensure double-check locking idiom works
	private static volatile ChocolateBoilerClass instance;

	private boolean empty;
	private boolean boiled;

	public static ChocolateBoilerClass getInstance()
	{
		// uses double-checked locking idiom to ensure single instance in multi-threaded scenarios
		if (instance == null)
		{
			synchronized (ChocolateBoilerClass.class)
			{
				if (instance == null)
				{
					instance = new ChocolateBoilerClass();
				}
			}
		}
		return instance;
	}

	// creation is controlled via the getInstance() method
	private ChocolateBoilerClass()
	{
		empty = true;
		boiled = false;
	}

	public void fill()
	{
		if (isEmpty())
		{
			empty = false;
			boiled = false;
		}
	}

	public void drain()
	{
		if (!isEmpty() && isBoiled())
		{
			empty = true;
		}
	}

	public void boil()
	{
		if (!isEmpty() && !isBoiled())
		{
			boiled = true;
		}
	}

	public boolean isBoiled()
	{
		return boiled;
	}

	public boolean isEmpty()
	{
		return empty;
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