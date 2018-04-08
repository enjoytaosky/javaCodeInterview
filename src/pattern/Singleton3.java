package pattern;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Singleton3 {
    private volatile  static Singleton3 singleton3;

    private Singleton3(){}

    public static Singleton3  getSingleton3(){
        if (singleton3 == null){
            synchronized (Singleton3.class){
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }
}
