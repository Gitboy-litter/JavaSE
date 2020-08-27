package day15_test.test2;

public class Test {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("一线程");
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    System.out.println("二线程"+i);
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    System.out.println("守护线程"+i);
                }
            }
        });
        t3.setDaemon(true);
        t1.setPriority(10);
        t2.setPriority(8);
        t1.start();
        t2.start();
        t3.start();
    }
}
