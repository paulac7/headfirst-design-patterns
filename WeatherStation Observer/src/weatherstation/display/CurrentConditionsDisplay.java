package weatherstation.display;

import weatherstation.observer.Observer;
import weatherstation.observer.ObservableSubject;

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private final ObservableSubject weatherData;

    public CurrentConditionsDisplay(ObservableSubject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
