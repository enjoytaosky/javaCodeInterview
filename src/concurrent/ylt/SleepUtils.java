package concurrent.ylt;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author taotao
 * @date 2018/4/1
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
