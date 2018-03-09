package base;

/**
 *
 * @author taotao
 * @date 2018/2/25
 */
public class tryTest {
    public static void main(String[] args) {
        System.out.println(testFunc2());
    }
    private static int testFunc2() {
        int x = 1;
        try {
            return x;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ++x;
        }
        return x;
    }

}
