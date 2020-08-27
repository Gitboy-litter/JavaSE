package day17.work19;

import day10.work3.Filte;
import day10.work3.User;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Filter;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("java",0);
        hashMap.put("exe",0);
        hashMap.put("doc",0);
        hashMap.put("txt",0);
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        File file=new File(next);
        clacu(file,hashMap);
        for (String s : hashMap.keySet()) {
            System.out.println("文件类型为"+s+" 有"+hashMap.get(s)+"个");
        }
    }
    public static void clacu(File file,HashMap<String,Integer> hashMap){
        for (File listFile : file.listFiles()) {
            if (listFile.isFile()){
                new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        if (pathname.isFile()){
                            String[] split = pathname.getName().split("\\.");
                            if (hashMap.containsKey(split[1])){
                                hashMap.put(split[1],hashMap.get(split[1])+1);
                            }
                        }
                        return true;
                    }
                }.accept(listFile);
            }
            if (listFile.isDirectory()){
                clacu(listFile,hashMap);
            }
        }
    }
}
