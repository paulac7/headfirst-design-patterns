package home.automation.api;

public class Light
{

    private final String light;

    public Light()
    {
        this.light = "";
    }

    public Light(String light)
    {
        this.light = light;
    }

    public void on()
    {
        System.out.println(this.light + "Light is on!");
    }

    public void off()
    {
        System.out.println(this.light + "Light is off");
    }
}
