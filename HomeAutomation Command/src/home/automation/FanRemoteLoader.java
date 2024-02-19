package home.automation;

import home.automation.api.CeilingFan;
import home.automation.command.CeilingFanHighCommand;
import home.automation.command.CeilingFanMediumCommand;
import home.automation.command.CeilingFanOffCommand;
import home.automation.remote.RemoteControl;

public class FanRemoteLoader
{

    public static void main(String[] args)
    {
        RemoteControl remote = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan();

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remote.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(2, ceilingFanHigh, ceilingFanOff);

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        System.out.println(remote);
        remote.undoButtonPressed();

        remote.onButtonPressed(2);
        System.out.println(remote);
        remote.undoButtonPressed();
    }
}
