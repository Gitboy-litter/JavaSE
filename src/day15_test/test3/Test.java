package day15_test.test3;

public class Test {
    static int count = 1;

    public static void main(String[] args)  {
        Object object = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        while (count != 1) {
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("1");
                        System.out.print("2");
                        System.out.print("3");
                        System.out.print("4");
                        System.out.print("5");
                        System.out.println();
                        count=2;
                        object.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        while (count != 2) {
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("6");
                        System.out.print("7");
                        System.out.print("8");
                        System.out.print("9");
                        System.out.print("10");
                        count=3;
                        System.out.println();
                        object.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        while (count != 3) {
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("11");
                        System.out.print("12");
                        System.out.print("13");
                        System.out.print("14");
                        System.out.print("15");
                        System.out.println();
                        count=1;
                        object.notifyAll();
                    }
                }

            }
        }).start();
    }
}
