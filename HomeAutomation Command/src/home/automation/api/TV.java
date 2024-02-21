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
public class TV
{

	private final String tvType;

	public TV(String tvType)
	{
		this.tvType = tvType;
	}

	public void on()
	{
		System.out.println(this.tvType + " TV is On");
	}

	public void off()
	{
		System.out.println(this.tvType + " TV is Off");
	}

	public void setInputChannel(int channel)
	{
		System.out.println(this.tvType + " TV is set to channel " + channel);
	}

	public void setVolume(int volume)
	{
		System.out.println(this.tvType + " TV volume is set to " + volume);
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