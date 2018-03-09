package concurrent.ylt;

/**
 *
 * @author taotao
 * @date 2018/3/3
 */
public class SynchronizedExample {
    int a =  0;
    boolean flag = false;

    public synchronized void writer(){
        a = 1;
        flag = true;
    }

    public synchronized void read(){
        if (flag){
            int i = a;
            flag = false;
        }
    }
}
