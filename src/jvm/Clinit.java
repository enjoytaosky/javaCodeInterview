package jvm;

/**
 * @author taotao
 * @date 2018/3/18
 */
public class Clinit {
    static class Parent {


        static {
            A = 2;
        }
        public static int A = 1;
    }

    static class Sub extends Parent {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}
