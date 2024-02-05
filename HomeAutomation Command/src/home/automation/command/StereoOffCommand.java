package home.automation.command;

import home.automation.api.Stereo;

public class StereoOffCommand implements Command
{

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }

    @Override
    public void execute()
    {
        this.stereo.off();
    }

    @Override
    public void undo()
    {
        stereo.on();
    }
}
