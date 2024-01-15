package weather.o.rama;

import weatherstation.observer.ObservableSubject;
import weatherstation.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements ObservableSubject
{

    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obs)
    {
        this.observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs)
    {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers()
    {
        this.observers.forEach(obs -> obs.update(temperature, humidity, pressure));
    }

    public void measurementsChanged()
    {
        this.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure)
    {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
