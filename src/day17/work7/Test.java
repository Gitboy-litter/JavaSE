package day17.work7;

import java.io.File;

public class Test {
    public static void main(String[] args) {
       File file= new File("D:\\a.txt");
      File file1=  new File("D:\\aaa");
      if (file.isFile()){
          System.out.println("是一个文件");
      }else {
          System.out.println("不是一个文件");
      }
        if (file1.isDirectory()){
            System.out.println("是一个文件夹");
        }else {
            System.out.println("不是一个文件夹");
        }
    }
}
