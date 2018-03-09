package base;

/**
 *
 * @author taotao
 * @date 2018/2/26
 */
public class DataTypeTest {
    public static void main(String[] args) {
        System.out.println("Integer: " + Integer.SIZE/8);           // 4
        System.out.println("Short: " + Short.SIZE/8);               // 2
        System.out.println("Long: " + Long.SIZE/8);                 // 8
        System.out.println("Byte: " + Byte.SIZE/8);                 // 1
        System.out.println("Character: " + Character.SIZE/8);       // 2
        System.out.println("Float: " + Float.SIZE/8);               // 4
        System.out.println("Double: " + Double.SIZE/8);             // 8
        System.out.println("Boolean: " + Boolean.toString(false));
    }
}
