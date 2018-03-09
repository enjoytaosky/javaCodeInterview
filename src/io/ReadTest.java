package io;

import java.io.*;

/**
 *
 * @author taotao
 * @date 2018/2/27
 */
public class ReadTest {
    public static void main(String[] args) throws IOException {
        //writeByteToFile();
        //readByteFromFile();
        //writeCharToFile();
        //readCharFromFile();
        //randomAccessFileRead();
        randomAccessFileWrite();
    }

    /**
     * 写字节流到文件中
     * @throws IOException
     */
    public static void writeByteToFile() throws IOException {
        String hello= new String( "hello word!");
        byte[] byteArray= hello.getBytes();
        File file= new File( "/Users/taotao/javaCode/src/base/test1.txt");
        //因为是用字节流来写媒介，所以对应的是OutputStream
        //又因为媒介对象是文件，所以用到子类是FileOutputStream
        OutputStream os= new FileOutputStream( file);
        os.write( byteArray);
        os.close();
    }

    /**
     * 文件中读取字节流
     * @throws IOException
     */
    public static void readByteFromFile() throws IOException{
        File file= new File( "/Users/taotao/javaCode/src/base/test1.txt");
        byte[] byteArray= new byte[( int) file.length()];
        //因为是用字节流来读媒介，所以对应的是InputStream
        //又因为媒介对象是文件，所以用到子类是FileInputStream
        InputStream is= new FileInputStream( file);
        int size= is.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        is.close();
    }

    /**
     * 字符流写入到文件
     * @throws IOException
     */
    public static void writeCharToFile() throws IOException{
        String hello= new String( "hello word!");
        File file= new File( "/Users/taotao/javaCode/src/base/test1.txt");
        //因为是用字符流来读媒介，所以对应的是Writer，又因为媒介对象是文件，所以用到子类是FileWriter
        Writer os= new FileWriter( file);
        os.write( hello);
        os.close();
    }
    /**
     * 字符流读文件
     *
     */
    public static void readCharFromFile() throws IOException{
        File file= new File( "/Users/taotao/javaCode/src/base/test1.txt");
        //因为是用字符流来读媒介，所以对应的是Reader
        //又因为媒介对象是文件，所以用到子类是FileReader
        Reader reader= new FileReader( file);
        char [] byteArray= new char[( int) file.length()];
        int size= reader.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        reader.close();
    }

    /**
     * 字节流转换为字符流
     * @throws IOException
     */
    public static void convertByteToChar() throws IOException{
        File file= new File( "/Users/taotao/javaCode/src/base/test1.txt");
        //获得一个字节流
        InputStream is= new FileInputStream( file);
        //把字节流转换为字符流，其实就是把字符流和字节流组合的结果。
        Reader reader= new InputStreamReader( is);
        char [] byteArray= new char[( int) file.length()];
        int size= reader.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        is.close();
        reader.close();
    }

    /**
     * 随机读取文件
     * @throws IOException
     */
    public static void randomAccessFileRead() throws IOException {
        // 创建一个RandomAccessFile对象
        RandomAccessFile file = new RandomAccessFile( "/Users/taotao/javaCode/src/base/test1.txt", "rw");
        // 通过seek方法来移动读写位置的指针
        file.seek(10);
        // 获取当前指针
        long pointerBegin = file.getFilePointer();
        // 从当前指针开始读
        byte[] contents = new byte[1024];
        file.read( contents);
        long pointerEnd = file.getFilePointer();
        System. out.println( "pointerBegin:" + pointerBegin + "\n" + "pointerEnd:" + pointerEnd + "\n" + new String(contents));
        file.close();
    }

    /**
     *  随机写入文件
     * @throws IOException
     */
    public static void randomAccessFileWrite() throws IOException {
        // 创建一个RandomAccessFile对象
        RandomAccessFile file = new RandomAccessFile( "/Users/taotao/javaCode/src/base/test1.txt", "rw");
        // 通过seek方法来移动读写位置的指针
        file.seek(10);
        // 获取当前指针
        long pointerBegin = file.getFilePointer();
        // 从当前指针位置开始写
        file.write( "HELLO WORD".getBytes());
        long pointerEnd = file.getFilePointer();
        System. out.println( "pointerBegin:" + pointerBegin + "\n" + "pointerEnd:" + pointerEnd + "\n" );
        file.close();
    }

}
