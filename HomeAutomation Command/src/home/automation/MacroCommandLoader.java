/**
 * Copyright © 2024 Lhasa Limited
 * File created: 21/02/2024 by PaulC
 * Creator : PaulC
 */
package home.automation;

import home.automation.api.HotTub;
import home.automation.api.Light;
import home.automation.api.Stereo;
import home.automation.api.TV;
import home.automation.command.Command;
import home.automation.command.HotTubOffCommand;
import home.automation.command.HotTubOnCommand;
import home.automation.command.LightOffCommand;
import home.automation.command.LightOnCommand;
import home.automation.command.MacroCommand;
import home.automation.command.StereoOffCommand;
import home.automation.command.StereoOnWithCDCommand;
import home.automation.command.TVOffCommand;
import home.automation.command.TVOnCommand;
import home.automation.remote.RemoteControl;

/**
 * @author PaulC
 * @since 21/02/2024
 */
public class MacroCommandLoader
{

	public static void main(String[] args)
	{
		RemoteControl remote = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		TV tv  = new TV("Living Room");
		Stereo stereo = new Stereo();
		HotTub hotTub = new HotTub();

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		TVOnCommand tvOnCommand = new TVOnCommand(tv);
		HotTubOnCommand hotTubOnCommand = new HotTubOnCommand(hotTub);

		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOffCommand = new TVOffCommand(tv);
		HotTubOffCommand hotTubOffCommand = new HotTubOffCommand(hotTub);

		Command[] partyOn = {livingRoomLightOn, stereoOnWithCD, tvOnCommand, hotTubOnCommand};
		Command[] partyOff = {livingRoomLightOff, stereoOff, tvOffCommand, hotTubOffCommand};

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remote.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println(remote);
		System.out.println();
		System.out.println("--- Pushing Macro On ---");
		remote.onButtonPressed(0);
		System.out.println();
		System.out.println("--- Pushing Macro Off ---");
		remote.offButtonPressed(0);
		System.out.println();
		System.out.println("--- Pushing Macro Undo ---");
		remote.undoButtonPressed();

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