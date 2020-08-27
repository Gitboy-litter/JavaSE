package day17.work7;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
       File file= new File("D:\\a.txt");
      File file1=  new File("D:\\aaa");
      file.createNewFile();
      file1.createNewFile();
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
