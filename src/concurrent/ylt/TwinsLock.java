package concurrent.ylt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 *
 * @author taotao
 * @date 2018/3/18
 */
public class TwinsLock implements Lock{
    @Override
    public void lock() {
        sync.acquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquireShared(1)>0;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireSharedNanos(1,unit.toNanos(time));
    }

    @Override
    public void unlock() {
        sync.releaseShared(1);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
    private final Sync sync = new Sync(2);


    private static final class Sync extends AbstractQueuedSynchronizer{
        Sync(int count){
            if(count < 0){
                throw new IllegalArgumentException("count must large than zero");
            }
            setState(count);
        }

        @Override
        protected int tryAcquireShared(int arg) {
            for (;;) {
               int current = getState();
               int newCount = current - arg;
               if (newCount < 0 || compareAndSetState(current,newCount)){
                   return newCount;
               }

            }
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            for (;;){
                int current = getState();
                int newCount = current - arg;
                if (compareAndSetState(current,newCount)){
                    return true;
                }
            }
        }

        @Override
        protected boolean isHeldExclusively() {
            return false;
        }
        final ConditionObject newCondition() {
            return new ConditionObject();
        }
    }


}
