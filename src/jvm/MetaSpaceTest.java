package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taotao
 * @date 2018/4/1
 */
public class MetaSpaceTest {
    static String  base = "string";
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i=0;i< Integer.MAX_VALUE;i++){
            String str = base + base;
            base = str;
            list.add(str.intern());
        }
    }
}
