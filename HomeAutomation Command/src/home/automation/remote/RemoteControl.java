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
            builder.append(String.format("%-10.10s %-70.70s %-60.60s%n", "[slot " + i + "]", onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
        }
        builder.append(String.format(String.format("%-10.10s %-70.70s", "[undo]", undoCommand.getClass().getName())));
        return builder.toString();
    }

}
