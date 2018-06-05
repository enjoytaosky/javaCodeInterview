package pattern.Observer02;

import java.util.Observable;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/2 23:40
 * @Description:
 * @Version: 1.0
 */
public class WeatherData extends Observable {

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData (){}

    /**
     * 改变了
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMesasurements(float temperature ,float humidity,
                                 float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
