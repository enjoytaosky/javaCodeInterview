package io;

import java.io.*;

/**
 *
 * @author taotao
 * @date 2018/2/27
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        readByBufferedInputStream();
    }
    public static void readByBufferedInputStream() throws IOException {
        File file = new File( "/Users/taotao/javaCode/src/base/test1.txt");
        byte[] byteArray = new byte[( int) file.length()];
        //可以在构造参数中传入buffer大小
        InputStream is = new BufferedInputStream( new FileInputStream(file),2*4);
        int size = is.read( byteArray);
        System. out.println( "大小:" + size + ";内容:" + new String(byteArray));
        is.close();
    }
}
