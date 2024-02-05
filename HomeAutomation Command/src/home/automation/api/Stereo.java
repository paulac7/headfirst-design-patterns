package home.automation.api;

public class Stereo
{
    public void on()
    {
        System.out.println("Stereo is on!");
    }

    public void off()
    {
        System.out.println("Stereo is off");
    }

    public void setCd()
    {
        System.out.println("Stereo set to play CD");
    }

    public void setDvd()
    {
        System.out.println("Stereo set to play DVD");
    }

    public void setRadio()
    {
        System.out.println("Stereo set to play RADIO");
    }

    public void setVolume(int volume)
    {
        System.out.println("Volume set to " + volume);
    }
}
