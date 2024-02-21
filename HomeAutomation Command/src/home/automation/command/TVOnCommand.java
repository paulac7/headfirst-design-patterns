/**
 * Copyright © 2024 Lhasa Limited
 * File created: 21/02/2024 by PaulC
 * Creator : PaulC
 */
package home.automation.command;

import home.automation.api.TV;

/**
 * @author PaulC
 * @since 21/02/2024
 */
public class TVOnCommand implements Command
{
	private final TV tv;

	public TVOnCommand(TV tv)
	{
		this.tv = tv;
	}

	@Override public void execute()
	{
		tv.on();
	}

	@Override public void undo()
	{
		tv.off();
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