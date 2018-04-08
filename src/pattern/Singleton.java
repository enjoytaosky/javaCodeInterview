package pattern;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
