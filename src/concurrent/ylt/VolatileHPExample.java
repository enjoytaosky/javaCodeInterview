package concurrent.ylt;

/**
 * @author taotao
 * @date 2018/3/3
 */
public class VolatileHPExample {
    int a = 0;
    volatile boolean flag = false;

    public void writer() {
        a = 1;
        flag = true;
    }

    public void reader() {
        if (flag) {
            int i = a;

        }
    }

}
