package home.automation.command;

import home.automation.api.CeilingFan;

public class CeilingFanOffCommand implements Command
{

    private final CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute()
    {
       this.fan.off();
    }

    @Override
    public void undo() {
        this.fan.high();
    }
}
