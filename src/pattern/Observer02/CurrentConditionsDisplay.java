package pattern.Observer02;

import pattern.Observer.CurrentConditionDisplay;
import pattern.Observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/2 23:49
 * @Description:
 * @Version: 1.0
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
    }
}
