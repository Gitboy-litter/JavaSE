package day15_test.test5;

public class Test {
    public static void main(String[] args) {
        Shower s = new Shower();
        new Thread() {
            @Override
            public void run() {
                try {
                    s.show1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    s.show2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    s.show3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
