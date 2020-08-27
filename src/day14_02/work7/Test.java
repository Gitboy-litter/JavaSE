package day14_02.work7;

public class Test {
    public static void main(String[] args) {
//        MyThread myThread=new MyThread();
//        myThread.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("小强");
//        }
        digui(5);
    }
    public static void digui(int i){
        if (i==0){
            return;
        }
        i--;
        System.out.println(2);
        digui(i);
        System.out.println(1);
//        digui(i);
//        System.out.println(2);
    }
}
