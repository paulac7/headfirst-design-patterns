package home.automation.command;

import home.automation.api.GarageDoor;

public class GarageDoorCloseCommand implements Command
{
    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.down();
    }

    @Override
    public void undo()
    {
        garageDoor.up();
    }
}
