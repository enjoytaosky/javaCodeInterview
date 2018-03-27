package jvm;

/**
 *
 * @author taotao
 * @date 2018/3/18
 */
public class NotInitialization {
    public static void main(String[] args) {
       // System.out.println(SuperClass.value);

       SuperClass[] superClasses =  new SuperClass[10];
        System.out.println(ConstClass.HELLOWORLD);
    }

}
