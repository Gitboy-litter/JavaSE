package day17.work20;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        File file=new File(scanner.next());
        clacu(file);
    }
    public static void clacu(File file){
        System.out.println(file.getName()+"文件夹");
        for (File listFile : file.listFiles()) {
            if (listFile.isFile()){
                System.out.println(file.getName()+"文件夹里的"+listFile.getName());
            }
            if (listFile.isDirectory()){
                clacu(listFile);
            }
        }
    }
}
