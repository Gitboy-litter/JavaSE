package day18.work9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Info.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入学生信息，输入格式为：学号-学生名字：");
            String next = sc.next();
            if ("end".equals(next)){
                break;
            }
            if (next.matches("[0-9]*+[-]+[\\s\\S]")){
                fileOutputStream.write(next.getBytes());
                fileOutputStream.write("\r\n".getBytes());
            }else {
                System.out.println("格式不对");
            }
        }
        fileOutputStream.close();
    }
}
