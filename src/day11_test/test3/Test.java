package day11_test.test3;

public class Test {
    public static void main(String[] args) {
     StringBuilder stringBuilder=new StringBuilder();
     StringBuffer stringBuffer=new StringBuffer();
     long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("a");
        }
     long end=System.currentTimeMillis();
        long start1=System.currentTimeMillis();
        for (int j = 0; j < 1000000; j++) {
            stringBuilder.append("a");
        }
        long end1=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(end1-start1);
    }
}
