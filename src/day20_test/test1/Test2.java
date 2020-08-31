package day20_test.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        Socket socket=new Socket("localhost",9090);
        while (true){
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner=new Scanner(System.in);
            String next = scanner.next();
            outputStream.write(next.getBytes());
            if ("end".equals(next)){
                outputStream.close();
                socket.close();
                return;
            }
            InputStream inputStream = socket.getInputStream();
            byte[] b=new byte[1024];
            int len;
            len=inputStream.read(b);
            String string = new String(b, 0, len);
            if ("end".equals(string)){
                System.out.println("接收到end，结束");
                inputStream.close();
                socket.close();
                return;
            }
            System.out.println(new String(b,0,len));

        }
    }
}
