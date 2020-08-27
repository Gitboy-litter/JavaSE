package day11.work5;

public class Test {
    public static void main(String[] args) {
        String str="a";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str+="a";
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        StringBuilder stringBuilder=new StringBuilder("a");
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("a");
        }
        long bend=System.currentTimeMillis();
        System.out.println(bend-end);
    }
}
