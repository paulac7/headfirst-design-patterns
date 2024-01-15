package weatherstation.display;

import weather.o.rama.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private final Observable observable; // WeatherData

    public CurrentConditionsDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherData data)
        {
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            this.display();
        }
    }
}
