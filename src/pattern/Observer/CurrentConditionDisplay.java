package pattern.Observer;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/2 23:15
 * @Description:
 * @Version: 1.0
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.weatherData = weatherData;
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "degrees" +
                humidity + "% humidity");
    }
}
