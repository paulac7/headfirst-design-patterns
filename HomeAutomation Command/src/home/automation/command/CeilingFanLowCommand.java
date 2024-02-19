package home.automation.command;

import home.automation.api.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand
{

    public CeilingFanLowCommand(CeilingFan fan)
    {
        super(fan);
    }

    @Override
    public void execute()
    {
        super.execute();
        this.fan.low();
        this.printSpeed();
    }
}
