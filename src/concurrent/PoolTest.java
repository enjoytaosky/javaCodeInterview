package concurrent;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author taotao
 * @date 2018/3/1
 */
public class PoolTest {
    public static void main(String[] args) throws Exception {
        //newCachedThreadPoolF();
        //newFixedThreadPoolF();
        // newScheduledThreadPoolF();
        //newWorkStealingPoolF();
        //创建一个支持分解任务的线程池ForkJoinPool
        ForkJoinPool pool=new ForkJoinPool();
        myTask task=new myTask(178);

        pool.submit(task);
        pool.awaitTermination(20, TimeUnit.SECONDS);//等待20s，观察结果
        pool.shutdown();

    }

    public static void newCachedThreadPoolF() throws Exception {

        ExecutorService m = Executors.newCachedThreadPool();

        for (int i = 1; i <= 10; i++) {
            final int count = i;

            m.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程：" + Thread.currentThread() + "负责了" + count + "次任务");
                }

            });
            //下面这行代码注释的话，线程池会新建10个线程，不注释的话，因为会复用老线程，不会产生10个线程
            Thread.sleep(1);
        }

    }

    public static void newFixedThreadPoolF() throws InterruptedException {
        ExecutorService m = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 10; i++) {
            final int count = i;

            m.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程：" + Thread.currentThread() + "负责了" + count + "次任务");
                }

            });
            Thread.sleep(1000);

        }
    }

    public static void newScheduledThreadPoolF() {
        // 指定大小为4
        ScheduledExecutorService m = Executors.newScheduledThreadPool(4);

        m.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Date now = new Date();
                System.out.println("线程" + Thread.currentThread() + "报时：" + now);
            }

        }, 1, 1, TimeUnit.SECONDS); // 延迟1s秒执行，每隔1s执行一次
    }

    public static void newWorkStealingPoolF() {
        // 设置并行级别为2，即默认每时每刻只有2个线程同时执行
        ExecutorService m = Executors.newWorkStealingPool(2);

        for (int i = 1; i <= 10; i++) {
            final int count = i;
            m.submit(new Runnable() {
                @Override
                public void run() {
                    Date now = new Date();
                    System.out.println("线程" + Thread.currentThread() + "完成任务："
                            + count + "   时间为：" + now.getSeconds());
                    try {
                        Thread.sleep(1000);//此任务耗时1s
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            });

        }
        while (true) {
            //主线程陷入死循环，来观察结果，否则是看不到结果的
        }
    }

    /**
     * 定义一个可分解的的任务类，继承了RecursiveAction抽象类
     * 必须实现它的compute方法
     */
    public static class myTask extends RecursiveAction {

        private static final long serialVersionUID = 1L;
        //定义一个分解任务的阈值——50,即一个任务最多承担50个工作量
        int THRESHOLD = 50;
        //任务量
        int task_Num = 0;

        myTask(int Num) {
            this.task_Num = Num;
        }

        @Override
        protected void compute() {
            if (task_Num <= THRESHOLD) {
                System.out.println(Thread.currentThread().getName() + "承担了" + task_Num + "份工作");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                //随机解成两个任务
                Random m = new Random();
                int x = m.nextInt(50);

                myTask left = new myTask(x);
                myTask right = new myTask(task_Num - x);

                left.fork();
                right.fork();
            }
        }
    }
}
