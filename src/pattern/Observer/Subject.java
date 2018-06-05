package pattern.Observer;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/2 22:53
 * @Description:
 * @Version: 1.0
 */
public interface Subject {


    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();

}
