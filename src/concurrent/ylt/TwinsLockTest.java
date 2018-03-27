package concurrent.ylt;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @author taotao
 * @date 2018/3/18
 */
public class TwinsLockTest {
    @Test
    public void test() throws InterruptedException {
        final Lock twinsLock = new TwinsLock();
        class Worker extends Thread {
            @Override
            public void run() {
                while (true) {
                    twinsLock.lock();
                    try {
                        Thread.sleep(1);
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        twinsLock.unlock();
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker();
            worker.setDaemon(true);
            worker.start();
        }
        for (int i = 0; i < 10; i++){
            Thread.sleep(1);
            System.out.println();
        }
    }
}
