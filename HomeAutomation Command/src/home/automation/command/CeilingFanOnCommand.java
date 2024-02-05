package home.automation.command;

import home.automation.api.CeilingFan;

public class CeilingFanOnCommand implements Command
{

    private final CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute()
    {
       this.fan.high();
    }

    @Override
    public void undo() {
        this.fan.off();
    }
}
