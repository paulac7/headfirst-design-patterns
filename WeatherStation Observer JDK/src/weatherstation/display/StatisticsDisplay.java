package weatherstation.display;

import weather.o.rama.jdk.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement
{
    private float tempSum = 0.0f;
    private int numReadings;
    private float minTemp = 200f;
    private float maxTemp = 0.0f;
    private Observable observable;

    public StatisticsDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display()
    {
        System.out.println("Avg/Max/Min temperature: " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherData data)
        {
            float temp = data.getTemperature();
            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            tempSum += temp;
            numReadings++;

            this.display();
        }
    }
}
