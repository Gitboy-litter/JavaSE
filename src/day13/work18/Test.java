package day13.work18;

import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
            for (int i = 0; i < 6; i++) {
                Random random1=new Random();
                int red = random1.nextInt(33)+1;
                hashSet.add("红"+red);
            }
            Random random2=new Random();
            int bule = random2.nextInt(16)+1;
            hashSet.add("蓝"+bule);
        System.out.println(hashSet);
    }
}
