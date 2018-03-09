package concurrent.ylt;

/**
 *
 * @author taotao
 * @date 2018/3/4
 */
public class Synchronized {
    public static void main(String[] args) {
        synchronized (Synchronized.class){
            m();
        }
    }

    private static synchronized void m() {
    }
}
