package base;

/**
 * @author taotao
 * @date 2018/2/24
 */
public class StringTest {

    /**
     * String a= “abc” String b = “abc” String c = new String(“abc”) String d = “ab” + “c” .他们之间用 == 比较的结果
     */

    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";
        String e = a;
        System.out.println("------------");
        System.out.println("e == a");
        System.out.println("a==b :" + a == b);
        System.out.println("a==c :" + a == c);
        System.out.println("a==d :" + a == d);
        System.out.println("b==c :" + b == c);
        System.out.println("b==d :" + b == d);
        System.out.println("c==d :" + c == d);

        System.out.println("a equals b :" + a.equals(b));
        System.out.println("a equals c :" + a.equals(c));
        System.out.println("a equals d :" + a.equals(d));
        System.out.println("b equals c :" + b.equals(c));
        System.out.println("b equals d :" + b.equals(d));
        System.out.println("c equals d :" + c.equals(d));
    }


}
