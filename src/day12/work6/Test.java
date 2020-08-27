package day12.work6;

public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        test.function(2);
        test.function("aaa");
    }
    public  <T> void function(T t){
        System.out.println(t);
    }
}
