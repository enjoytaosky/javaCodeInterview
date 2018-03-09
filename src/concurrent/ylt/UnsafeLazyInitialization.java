package concurrent.ylt;

/**
 *
 * @author taotao
 * @date 2018/3/3
 */
public class UnsafeLazyInitialization {
    private static A instance;

    private static A getInstance(){
        if (instance == null){
            instance = new A();
        }
        return instance;
    }

    public static void main(String[] args) {

    }

    private static class A {

    }

}
