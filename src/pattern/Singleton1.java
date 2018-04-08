package pattern;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){}

    public static synchronized Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
