/**
 * Copyright © 2024 Lhasa Limited
 * File created: 21/02/2024 by PaulC
 * Creator : PaulC
 */
package home.automation.api;

/**
 * @author PaulC
 * @since 21/02/2024
 */
public class HotTub
{

	public void on()
	{
		System.out.println("Hot Tub is On");
	}

	public void off()
	{
		System.out.println("Hot Tub is Off");
	}

	public void circulate()
	{
		System.out.println("Hot Tub is Circulating");
	}

	public void jetsOn()
	{
		System.out.println("Hot Tub Jets are On");
	}

	public void jetsOff()
	{
		System.out.println("Hot Tub Jets are Off");
	}


	public void setTemperature(int temperature)
	{
		System.out.println("Hot Tub temperature is set to " + temperature);
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