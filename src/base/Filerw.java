package base;

import java.io.*;

/**
 *
 * @author taotao
 * @date 2018/2/26
 */
public class Filerw {
        public static void main (String args[]){
            Filerw filerw=new Filerw();
            filerw.readAndWrite();
            //filerw.bufferReader();
            //filerw.readAndWriteStream();
        }
        /**
         *   1.使用输入输出流操作文件
         */
        public void readAndWriteStream(){
            FileInputStream inStream=null;
            FileOutputStream outStream=null;
            try{
                //生成一个输入流的对象
                inStream=new FileInputStream("/Users/taotao/javaCode/src/base/test");
                //生成一个输入流的对象
                outStream=new FileOutputStream("/Users/taotao/javaCode/src/base/test1.txt");
                byte[] buffer=new byte[1024];
                int len=0;
                //读取文件
                len=inStream.read(buffer,0,buffer.length);
                for(int i=0; i<len; i++){
                    System.out.print(buffer[i]);
                }
                //写入到文件
                outStream.write(buffer,0,len);
            }catch (Exception  e){
                System.out.print(e);
            }finally{
                try{
                    inStream.close();
                    outStream.close();
                }catch (Exception e){
                    System.out.print(e);
                }
            }
        }
        /**
         *   2.使用字节流操作文件
         */
        public void readAndWrite(){
            FileReader reader=null;
            FileWriter writer=null;
            try{
                //生成一个字符输入流的对象
                reader=new FileReader("/Users/taotao/javaCode/src/base/test");
                //生成一个字符输入流的对象
                writer=new FileWriter("/Users/taotao/javaCode/src/base/test1.txt");
                char[] buffer=new char[1024];
                int len=0;
                //读取文件
                len=reader.read(buffer,0,buffer.length);
                for(int i=0; i<len; i++){
                    System.out.print(buffer[i]);
                }
                //写入到文件
                writer.write(buffer,0,len);
            }catch (Exception  e){
                System.out.print(e);
            }finally{
                try{
                    reader.close();
                    writer.close();
                }catch (Exception e){
                    System.out.print(e);
                }
            }
        }
        /**
         *   3.使用节点流和处理流操作文件
         */
        public void bufferReader(){
            FileReader reader=null;
            BufferedReader bufferedReader=null;
            try{
                reader=new FileReader("e:/javapro/FileDemo/fromlinetext.txt");
                bufferedReader=new BufferedReader(reader);
                String line=null;
                while((line=bufferedReader.readLine())!=null){
                    line=bufferedReader.readLine();
                    System.out.println(line);
                }
            }catch (Exception e){
                System.out.print(e);
            }finally{
                try{
                    reader.close();
                    bufferedReader.close();
                }catch (Exception e){
                    System.out.print(e);
                }
            }
        }
}
