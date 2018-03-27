package jvm;

/**
 * @author taotao
 * @date 2018/3/18
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init !");
    }
    public static final String HELLOWORLD = "hello world";
}
