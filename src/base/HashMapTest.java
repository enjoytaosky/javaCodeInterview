package base;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author taotao
 * @date 2018/2/26
 */
public class HashMapTest {
    private int a;

    public HashMapTest(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Map<HashMapTest, Integer> map = new HashMap<HashMapTest, Integer>();
        HashMapTest instance = new HashMapTest(1);
        map.put(instance, 1);
        Integer value = map.get(new HashMapTest(1));
        if (value != null) {
            System.out.println(value);
        } else {
            System.out.println("value is null");
        }
    }
}
