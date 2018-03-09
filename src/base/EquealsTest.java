package base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taotao
 * @date 2018/2/26
 */
public class EquealsTest {
    public static void main(String[] args) {
        User user1 = new User("mkyong", 35, "111222333");
        User user2 = new User("mkyong", 35, "111222333");

        System.out.println(user1.equals(user2)); // false
        int a=3;
        int b=4;
        int c=3;
        System.out.println(a==b);   //false
        System.out.println(a==c);   //true
        List<Long> test1 = new ArrayList<Long>();
        test1.add(1L);
        test1.add(2L);
        System.out.println(test1.hashCode());  //994
        test1.set(0,2L);
        System.out.println(test1.hashCode());  //1025


    }
}
