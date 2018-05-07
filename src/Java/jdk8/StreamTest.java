package Java.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * FileName: StreamTest
 * Author:   YuanLongtao
 * Date:     2018/5/7 17:21
 * Description:
 * Version: 1.0
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6);
        /*list =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);*/
        // list = list.stream().filter(a-> a != 1).collect(Collectors.toList());

        //list = list.stream().map(a -> a - 1).collect(Collectors.toList());

       /* list = list.stream().peek(a -> {
            System.out.println(a + 1);
        }).collect(Collectors.toList());*/
        long count = list.stream().count();
        System.out.println(count);
        System.out.println(list);
    }

    static void f(int a) {
        a = a + 1;
        System.out.println(a);
    }

}
