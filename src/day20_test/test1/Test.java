package day20_test.test1;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端发送数据");
        ServerSocket serverSocket=new ServerSocket(9090);
        Socket accept = serverSocket.accept();
        while (true){
            OutputStream outputStream = accept.getOutputStream();
            Scanner scanner=new Scanner(System.in);
            String next = scanner.next();
            outputStream.write(next.getBytes());
            if ("end".equals(next)){
                System.out.println("结束");
                outputStream.close();
                accept.close();
                return;
            }
            InputStream inputStream = accept.getInputStream();
            byte[] b=new byte[1024];
            int len;
            len=inputStream.read(b);
            String string = new String(b, 0, len);
            if ("end".equals(string)){
                    System.out.println("收到end结束");
                    inputStream.close();
                    accept.close();
                    return;
                }
                System.out.println(new String(b,0,len));

        }
    }
}
