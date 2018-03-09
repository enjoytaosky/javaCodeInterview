package concurrent.ylt;

/**
 * @author taotao
 * @date 2018/3/3
 */
public class VolatileExample {
    long a = 0;
    volatile boolean flag = false;

    public void writer(long l) {
        a = l;
    }

    public void getAndIncrement() {
        a++;
    }

    public long get() {
        return a;
    }
}
