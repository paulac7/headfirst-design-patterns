package home.automation;

import home.automation.api.GarageDoor;
import home.automation.api.Light;
import home.automation.command.GarageDoorOpenCommand;
import home.automation.command.LightOnCommand;
import home.automation.remote.simple.SimpleRemoteControl;

public class SimpleRemoteControlTest
{

    public static void main(String[] args)
    {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonPressed();
        remote.setCommand(doorOpen);
        remote.buttonPressed();
    }

}
