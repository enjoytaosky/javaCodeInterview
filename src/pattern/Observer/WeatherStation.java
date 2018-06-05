package pattern.Observer;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/2 23:29
 * @Description:
 * @Version: 1.0
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,23,23);
    }
}
