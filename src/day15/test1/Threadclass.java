package day15.test1;

public class Threadclass extends Thread {
    public Threadclass() {
    }

    @Override
    public void run() {
        System.out.println("子线程");
    }
}
