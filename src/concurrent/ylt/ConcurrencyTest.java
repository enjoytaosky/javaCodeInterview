package concurrent.ylt;

/**
 * @author taotao
 * @date 2018/3/3
 */
public class ConcurrencyTest {
    private static final long count = 1000000L;

    public static void main(String[] args) throws InterruptedException {

        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException {

        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        thread.join();
        long end = System.currentTimeMillis() - start;
        System.out.println("concurrency : time :" + end + "b :" + b);

    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("serial: time :" + end + "b :" + b);
    }
}
