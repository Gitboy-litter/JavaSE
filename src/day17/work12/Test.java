package day17.work12;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        File file=new File(next);
        if (!file.exists()){
            System.out.println("文件不存在");
        }else {
            if (file.isFile()){
                System.out.println(file.length());
            }
            if (file.isDirectory()){
                for (File listFile : file.listFiles()) {
                    sum+=listFile.length();
                }
                System.out.println(sum);
            }
        }
    }
}
