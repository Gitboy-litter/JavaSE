package day17.work11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        File file=new File(next);
        if (file.exists()){
            System.out.println("文件大小为"+file.length());
        }else {
            file.createNewFile();
            System.out.println("文件不存在，创建文件");
        }
    }
}
