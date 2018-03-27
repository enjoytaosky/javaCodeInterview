package Java;

/**
 * @author taotao
 * @date 2018/3/26
 */
public class equals {
    public static void main(String[] args) {
        String a = new String("aaa");
        String b = new String("aaa");
        String aa = "aaa";
        String bb = "aaa";
        System.out.println(a == b);
        System.out.println(aa == bb);
        System.out.println(aa.equals(a));
        System.out.println(aa.equals(bb));
    }
}
