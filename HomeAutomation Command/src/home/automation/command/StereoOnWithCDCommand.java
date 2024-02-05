package home.automation.command;

import home.automation.api.Stereo;

public class StereoOnWithCDCommand implements Command
{

    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }

    @Override
    public void execute()
    {
        this.stereo.on();
        this.stereo.setCd();
        this.stereo.setVolume(11);
    }

    @Override
    public void undo()
    {

    }
}
