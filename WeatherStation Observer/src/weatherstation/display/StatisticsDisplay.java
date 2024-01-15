package weatherstation.display;

import weatherstation.observer.Observer;
import weatherstation.observer.ObservableSubject;

public class StatisticsDisplay implements Observer, DisplayElement
{
    private float tempSum = 0.0f;
    private int numReadings;
    private float minTemp = 200f;
    private float maxTemp = 0.0f;
    private final ObservableSubject weatherData;

    public StatisticsDisplay(ObservableSubject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display()
    {
        System.out.println("Avg/Max/Min temperature: " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        if (temp > this.maxTemp)
        {
            this.maxTemp = temp;
        }

        if (temp < this.minTemp)
        {
            this.minTemp = temp;
        }

        this.tempSum += temp;
        this.numReadings++;

        this.display();
    }
}
