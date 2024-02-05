package home.automation.command;

import home.automation.api.Light;

public class LightOnCommand implements Command
{

    private Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.on();
    }
}
