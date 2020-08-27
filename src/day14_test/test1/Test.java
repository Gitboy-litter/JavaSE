package day14_test.test1;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> ma=new HashMap();
        eat("aaa");
    }
    public static  <T> void eat(T e){
        System.out.println(e);
    }
}
