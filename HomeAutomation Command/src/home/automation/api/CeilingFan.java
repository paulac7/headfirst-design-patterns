package home.automation.api;

public class CeilingFan
{

    private FanSpeed fanSpeed;


    public void high()
    {
        this.fanSpeed = FanSpeed.HIGH;
        getSpeed();
    }

    public void medium()
    {
        this.fanSpeed = FanSpeed.MEDIUM;
        getSpeed();
    }

    public void low()
    {
        this.fanSpeed = FanSpeed.LOW;
        getSpeed();
    }

    public void off()
    {
        System.out.println("Fan is off");
    }

    public void getSpeed()
    {
        System.out.println("Fan is on " + this.fanSpeed.toString().toLowerCase());
    }

}
