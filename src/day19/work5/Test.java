package day19.work5;

import sun.nio.cs.ext.GBK;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("src/a.txt"), "gbk");
        outputStreamWriter.write("我爱java");
        outputStreamWriter.close();
    }
}
