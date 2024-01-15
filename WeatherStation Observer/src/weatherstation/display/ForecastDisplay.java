package weatherstation.display;

import weatherstation.observer.Observer;
import weatherstation.observer.ObservableSubject;

public class ForecastDisplay implements Observer, DisplayElement
{
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(ObservableSubject subject)
    {
        subject.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure)
    {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        display();
    }

    public void display()
    {
        System.out.print("Forecast: ");
        if (this.currentPressure > this.lastPressure)
        {
            System.out.println("Improving weather on the way!");
        }
        else if (this.currentPressure == this.lastPressure)
        {
            System.out.println("More of the same");
        }
        else if (this.currentPressure < this.lastPressure)
        {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
