package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Java8 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Google");
        list1.add("Runoob");
        list1.add("Baidu");
        list1.add("Taobao");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Google");
        list2.add("Runoob");
        list2.add("Baidu");
        list2.add("Taobao");

        Java8 java8 = new Java8();

        System.out.println("java 7 语法： ");
        java8.sortUsingJava7(list1);
        System.out.println(list1);
        System.out.println("java 8 语法： ");
        java8.sortUsingJava8(list2);
        System.out.println(list2);

    }

    private void sortUsingJava7(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortUsingJava8(List<String> list){
        Collections.sort(list,(o1,o2)->o1.compareTo(o2));
    }
}
