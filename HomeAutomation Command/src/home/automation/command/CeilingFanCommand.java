package home.automation.command;

import home.automation.api.CeilingFan;
import home.automation.api.FanSpeed;

public class CeilingFanCommand implements Command
{

    protected final CeilingFan fan;
    private FanSpeed previousSpeed;

    public CeilingFanCommand(CeilingFan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute()
    {
        this.previousSpeed = this.fan.getSpeed();
    }

    @Override
    public void undo() {
        switch (this.previousSpeed) {
            case FanSpeed.HIGH:
                this.fan.high();
                break;
            case FanSpeed.MEDIUM:
                this.fan.medium();
                break;
            case FanSpeed.LOW:
                this.fan.low();
                break;
            case FanSpeed.OFF:
                this.fan.off();
                break;
        }
        printSpeed();
    }

    protected void printSpeed()
    {
        if (!(this.fan.getSpeed().equals(FanSpeed.OFF))) {
            System.out.println("Fan is on " + this.fan.getSpeed().toString().toLowerCase());
        }
        else {
            System.out.println("Fan is " + this.fan.getSpeed().toString().toLowerCase());
        }
    }
}
