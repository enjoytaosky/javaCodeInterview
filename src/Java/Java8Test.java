package Java;

import java.util.ArrayList;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Java8Test {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Google");
        list.add("Runoob");
        list.add("Taobao");
        list.add("Baidu");
        list.forEach(System.out::println);
    }
}
