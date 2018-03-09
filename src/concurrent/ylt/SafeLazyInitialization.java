package concurrent.ylt;

/**
 *
 * @author taotao
 * @date 2018/3/3
 */
public class SafeLazyInitialization {
    private static A a;

    public synchronized static A getIntance(){
        if ( a == null){
            a = new A();
        }
        return a;
    }
    private static class A {
    }
}
