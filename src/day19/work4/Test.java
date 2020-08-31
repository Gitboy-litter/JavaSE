package day19.work4;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("d:\\ccc.txt"));
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入验证码");
        String next = scanner.next();
        String len="";
        while ((len=bufferedReader.readLine())!=null){
            if (next.equals(len)){
                System.out.println("验证码存在");
            }
        }
        bufferedReader.close();
    }
}
