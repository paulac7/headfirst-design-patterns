package home.automation.command;

import home.automation.api.GarageDoor;

public class GarageDoorOpenCommand implements Command
{
    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.up();
    }

    @Override
    public void undo()
    {
        garageDoor.down();
    }
}
