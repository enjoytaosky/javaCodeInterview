package concurrent.ylt;

/**
 *
 * @author taotao
 * @date 2018/3/3
 */
public class SafeDoubleCheckedLocking {
    private volatile static A instance;

    public static A getInstance(){
        if (instance == null){
            synchronized (SafeDoubleCheckedLocking.class){
                if (instance == null){
                    instance = new A();
                }
            }
        }
        return instance;
    }
    private static class A {
    }
}
