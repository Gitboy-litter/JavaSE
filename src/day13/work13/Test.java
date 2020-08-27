package day13.work13;

import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
       while (hashSet.size()!=10){
            Random random=new Random();
            hashSet.add(random.nextInt(20)+1);
        }
        System.out.println(hashSet);
    }
}
