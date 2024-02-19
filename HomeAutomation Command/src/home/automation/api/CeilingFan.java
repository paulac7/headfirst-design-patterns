package home.automation.api;

public class CeilingFan
{

    private FanSpeed fanSpeed = FanSpeed.OFF;


    public void high()
    {
        this.fanSpeed = FanSpeed.HIGH;
    }

    public void medium()
    {
        this.fanSpeed = FanSpeed.MEDIUM;
    }

    public void low()
    {
        this.fanSpeed = FanSpeed.LOW;
    }

    public void off()
    {
       this.fanSpeed = FanSpeed.OFF;
    }

    public FanSpeed getSpeed()
    {
        return this.fanSpeed;
    }

}
