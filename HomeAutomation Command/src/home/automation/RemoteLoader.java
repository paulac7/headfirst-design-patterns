package home.automation;

import home.automation.api.CeilingFan;
import home.automation.api.GarageDoor;
import home.automation.api.Light;
import home.automation.api.Stereo;
import home.automation.command.*;
import home.automation.remote.RemoteControl;

public class RemoteLoader
{

    public static void main(String[] args)
    {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenRoomLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remote);

        System.out.println("Light undo test.....");
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        System.out.println(remote);
        remote.undoButtonPressed();
        remote.offButtonPressed(0);
        remote.onButtonPressed(0);
        System.out.println(remote);
        remote.undoButtonPressed();

        System.out.println("\n" + "Other appliances.....");
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
    }
}
