package day17_test.test1;

import java.io.*;
import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws IOException {
//        String dirpath="d:\\java测试文件";
//        String path="d:\\java创建的文件.txt";
//        File file=new File(path);
//        File file1=new File(dirpath);
////        System.out.println(file.getAbsoluteFile());
////        System.out.println(file.getAbsolutePath());
////        System.out.println(file.length());
////        System.out.println(file.getName());
////        System.out.println(file.getPath());
//        file.createNewFile();
//        System.out.println(file.exists());
//        //file1.createNewFile();
//        file.delete();
//        file1.mkdirs();
//        System.out.println(file1.delete());
//        CountDownLatch countDownLatch=new CountDownLatch(1);
//        countDownLatch.await();
//        countDownLatch.countDown();
        File file=new File("d:\\book\\ez.txt");
     //   String[] list = file.list();
//        for (String s : list) {
//            System.out.println(s);
//        }
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            System.out.println(file1.getName());
//        }
System.out.println("hello");
        FileWriter fileWriter=new FileWriter(file);
        char[] a={'齐','天','大','圣'};
        fileWriter.write(a);
        fileWriter.close();
        FileReader fileReader=new FileReader(file);
        int b;
        while ((b=fileReader.read())!=-1){
            System.out.println((char)b);
        }
        fileReader.close();
    }
}
