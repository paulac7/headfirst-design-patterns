package home.automation.command;

import home.automation.api.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand
{

    public CeilingFanMediumCommand(CeilingFan fan)
    {
        super(fan);
    }

    @Override
    public void execute()
    {
        super.execute();
        this.fan.medium();
        this.printSpeed();
    }
}
