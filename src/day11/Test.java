package day11;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String a=new String("abc");
        String b=new String("abc");
        System.out.println(Objects.equals(a,b));
    }
}
