package pattern.Observer02;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/2 23:59
 * @Description:
 * @Version: 1.0
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMesasurements(23,23,12);
    }
}
