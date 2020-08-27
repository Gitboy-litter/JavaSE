package day15_test.test1;

import day15.test4.MyThread;

public class Test {
    public static void main(String[] args) {
        MyThread m = new MyThread("自定义线程");
        m.start();
        new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println("打印线程");
            }
        }).start();
    }
}
