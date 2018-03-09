package concurrent.ylt;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author taotao
 * @date 2018/3/4
 */
public class Piped {
    public static void main(String[] args) throws IOException {
        PipedReader pipedReader = new PipedReader();
        PipedWriter pipedWriter = new PipedWriter();
        pipedWriter.connect(pipedReader);
        Thread printThread = new Thread(new Print(pipedReader), "PrintThread");
        printThread.start();
        int receive = 0;
        while ((receive = System.in.read()) != -1){
            pipedWriter.write(receive);
        }

    }



 static class Print implements Runnable {
     private PipedReader in;

     public Print(PipedReader pipedReader) {
         this.in = pipedReader;
     }

     @Override
     public void run() {
         int reveive = 0;
         try {
             while ((reveive = in.read()) != -1){
                 System.out.print((char) reveive);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
}
