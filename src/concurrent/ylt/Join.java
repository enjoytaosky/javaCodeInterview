package concurrent.ylt;

import java.util.concurrent.TimeUnit;

/**
 * @author taotao
 * @date 2018/3/4
 */
public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(currentThread), String.valueOf(i));
            thread.start();
            currentThread = thread;
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName() + " terminate.");
    }

    private static class Domino implements Runnable {
        private Thread thread;

        public Domino(Thread currentThread) {
            this.thread = currentThread;
        }

        @Override
        public void run() {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " terminate.");}
    }
}
