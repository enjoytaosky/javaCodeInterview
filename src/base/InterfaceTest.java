package base;

/**
 *
 * @author taotao
 * @date 2018/2/26
 */
public interface InterfaceTest {

        // static 和 final 是针对接口中的成员变量来说的.
        // abstract是针对接口中的方法来说的.
        static final String str = null;

        public String strr = null;// 接口中的变量默认是public static final类型的

        public int i = 0;// 可以不显示的用static 和 final 来修饰这个变量.默认就是了!!!

        public abstract void fireContextsChangedEvent();// 方法默认是 public abstract类型的.

        public boolean checkValidParameterName(String oldParameterName, String newParameterName);

}
