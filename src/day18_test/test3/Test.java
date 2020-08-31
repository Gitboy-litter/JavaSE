package day18_test.test3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws IOException {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        File file=new File("d:\\a.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        int a;
        while ((a=fileInputStream.read())!=-1){
            statistics((char) a,hashMap);
        }
        fileInputStream.close();
        for (Character character : hashMap.keySet()) {
            System.out.println(character+"出现了"+hashMap.get(character)+"次");
        }
    }
    public static void statistics(char c,HashMap<Character,Integer> hashMap){
        if (hashMap.containsKey(c)){
            hashMap.put(c,hashMap.get(c)+1);
        }else {
            hashMap.put(c,1);
        }
    }
}
