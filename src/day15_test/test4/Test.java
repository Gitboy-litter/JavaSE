package day15_test.test4;

public class Test implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Test());
        t.start();
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
