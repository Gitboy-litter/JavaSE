package day18.work8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriterwriter=new FileWriter("D:\\Info.txt");
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入信息：");
            String next = sc.next();
            if ("886".equals(next)){
                break;
            }
          fileWriterwriter.write(next);
          fileWriterwriter.write("\r\n");
        }
        fileWriterwriter.close();
    }
}
