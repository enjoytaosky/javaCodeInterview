package jvm;

/**
 *  测试Java栈，Stack deep的大小不是固定的，
 *  每次都可能得到不同的结果，但是一般都是有1w以上的
 * @author taotao
 * @date 2018/4/1
 */
public class StackErrorTest {
    private static int index = 1;

    public void call(){
        index++;
        call();
    }

    public static void main(String[] args) {
        StackErrorTest mock = new StackErrorTest();
        try {
            mock.call();
        }catch (Throwable e){
            System.out.println("Stack deep : "+index);
            e.printStackTrace();
        }
    }
}
