package pattern.Observer;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/2 22:55
 * @Description:
 * @Version: 1.0
 */
public interface Observer {
    /**
     * 更新
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);
}
