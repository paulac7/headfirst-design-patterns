package home.automation.remote.simple;

import home.automation.command.Command;

public class SimpleRemoteControl
{

    private Command slot;

    public SimpleRemoteControl()
    {
    }

    public void setCommand(Command command)
    {
        this.slot = command;
    }

    public void buttonPressed()
    {
        slot.execute();
    }

}
