package pattern.Decorator;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/3 10:45
 * @Description:
 * @Version: 1.0
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new
                    FileInputStream("/Users/andy/myapp/code/self/javacode/test"));
            while ((c = in.read()) >0){
                System.out.println((char)c);
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
