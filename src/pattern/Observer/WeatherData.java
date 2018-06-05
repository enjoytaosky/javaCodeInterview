package pattern.Observer;

import java.util.ArrayList;

/**
 * @author andy
 */
public class WeatherData implements Subject {


    private ArrayList<Observer> observerList;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i > 0) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer item : observerList) {
            item.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanges() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
    }
}
