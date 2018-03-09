package io;

import java.io.File;

/**
 *
 * @author taotao
 * @date 2018/2/27
 */
public class FileTest {
        public static void main(String[] args) {
            //检查文件是否存在
            File file = new File("/Users/taotao/javaCode/src/io/test.txt");
            boolean fileExists = file.exists();
            System.out.println(fileExists);
            //创建文件目录,若父目录不存在则返回false
            File file2 = new File("/Users/taotao/javaCode/src/io/dir");
            boolean dirCreated = file2.mkdir();
            System.out.println(dirCreated);
            //创建文件目录,若父目录不存则连同父目录一起创建
            File file3 = new File("/Users/taotao/javaCode/src/io/dir2/subDir2");
            boolean dirCreated2 = file3.mkdirs();
            System.out.println(dirCreated2);
            File file4 = new File("/Users/taotao/javaCode/src/io/test.txt");
            //判断长度
            long length = file4.length();
            //重命名文件
            boolean isRenamed = file4.renameTo(new File("/Users/taotao/javaCode/src/io/test2.txt"));
            //删除文件
            boolean isDeleted = file4.delete();
            File file5 = new File("/Users/taotao/javaCode/src/io");
            //是否是目录
            boolean isDirectory = file5.isDirectory();
            //列出文件名
            String[] fileNames = file5.list();
            //列出目录
            File[] files = file4.listFiles();
        }
}
