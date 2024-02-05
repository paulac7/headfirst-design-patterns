package home.automation.command;

import home.automation.api.GarageDoor;

public class GarageDoorOpenCommand implements Command
{
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.up();
    }
}
