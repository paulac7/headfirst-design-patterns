/**
 * Copyright © 2024 Lhasa Limited
 * File created: 21/02/2024 by PaulC
 * Creator : PaulC
 */
package home.automation.command;

/**
 * @author PaulC
 * @since 21/02/2024
 */
public class MacroCommand implements Command
{

	private final Command[] commands;

	public MacroCommand(Command[] commands)
	{
		this.commands = commands;
	}

	@Override
	public void execute()
	{
		for (Command command : commands)
		{
			command.execute();
		}
	}

	@Override
	public void undo()
	{
		for(int i = commands.length - 1; i >= 0; i--)
		{
			commands[i].undo();
		}
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