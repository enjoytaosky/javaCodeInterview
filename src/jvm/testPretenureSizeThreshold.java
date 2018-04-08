package jvm;

/**
 *
 * @author taotao
 * @date 2018/4/1
 */
public class testPretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;
    public static void main(String[] args) {

    }
    private void F(){
        byte [] allocation;
        allocation = new byte[4 * _1MB];
    }
}
