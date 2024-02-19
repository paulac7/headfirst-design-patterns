package home.automation.command;

import home.automation.api.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand
{

    public CeilingFanHighCommand(CeilingFan fan)
    {
        super(fan);
    }

    @Override
    public void execute()
    {
        super.execute();
        this.fan.high();
        this.printSpeed();
    }
}
