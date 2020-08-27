package day15.test5;

import java.util.Random;

public class Test {
    static int carnumber = 80;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                    for (int i = 0; carnumber >= 1; i++) {
                        synchronized (this) {
                        if (carnumber==1){
                            System.out.println(Thread.currentThread().getName() + "上车，没座位了");
                            System.exit(1);
//                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "上车，还剩" + (--carnumber) + "个座位");
                    }
                }
            }
        };
        Thread thread1 = new Thread(runnable, "前门");
        Thread thread2 = new Thread(runnable, "后门");
        Thread thread3 = new Thread(runnable, "中门");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
