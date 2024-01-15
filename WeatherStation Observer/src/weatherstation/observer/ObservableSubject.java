package weatherstation.observer;

public interface ObservableSubject
{

    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();

}
