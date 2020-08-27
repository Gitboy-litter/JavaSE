package day15_test.test5;

public class Shower {

    int count = 1;

    public void show1() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (Object.class) {
                while (count != 1) {
                    Object.class.wait();
                }
                Thread.sleep(10);
                System.out.print("我");
                System.out.print("是");
                System.out.print("中");
                System.out.print("国");
                System.out.print("人");
                System.out.println();
                count = 2;
                Object.class.notifyAll();
            }
        }
    }

    public void show2() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (Object.class) {
                while (count != 2) {
                    Object.class.wait();
                }
                Thread.sleep(10);
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                count = 3;
                Object.class.notifyAll();
            }
        }
    }

    public void show3() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            synchronized (Object.class) {
                while (count != 3) {
                    Object.class.wait();
                }
                Thread.sleep(10);
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                count = 1;
                Object.class.notifyAll();
            }
        }
    }
}
