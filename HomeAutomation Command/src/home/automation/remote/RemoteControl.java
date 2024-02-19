package home.automation.remote;

import home.automation.command.Command;
import home.automation.command.NoCommand;

public class RemoteControl
{

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public RemoteControl()
    {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < this.onCommands.length; i++)
        {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }

        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand)
    {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot)
    {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonPressed(int slot)
    {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonPressed()
    {
        this.undoCommand.undo();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++)
        {
            builder.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "\t\t\t\t" + offCommands[i].getClass().getName() + "\n");
        }
        builder.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return builder.toString();
    }

}
