package concurrent.ylt;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author taotao
 * @date 2018/3/3
 */
public class Counter {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;

    public static void main(String[] args) {
        final Counter counter = new Counter();
        ArrayList<Thread> ts = new ArrayList<>(600);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.count();
                        counter.safeCount();
                    }
                }
            });
        }
        for (Thread t : ts
                ) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(counter.i);
        System.out.println(counter.atomicInteger.get());
        System.out.println(System.currentTimeMillis() - start);
    }

    private void safeCount() {
        for (; ; ) {
            int i = atomicInteger.get();
            boolean suc = atomicInteger.compareAndSet(i, i++);
            if (suc){
                break;
            }
        }
    }
    private void count(){
        i++;
    }
}
