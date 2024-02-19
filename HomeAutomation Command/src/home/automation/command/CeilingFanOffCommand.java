package home.automation.command;

import home.automation.api.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand
{

    public CeilingFanOffCommand(CeilingFan fan)
    {
        super(fan);
    }

    @Override
    public void execute()
    {
        super.execute();
        this.fan.off();
        this.printSpeed();
    }
}
