package concurrent.ylt;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author taotao
 * @date 2018/3/3
 */
public class Multithread {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo t : threadInfos
                ) {
            System.out.println("[" + t.getThreadId() + "]" + t.getThreadName());
        }
    }
}
