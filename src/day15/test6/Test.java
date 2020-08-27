package day15.test6;

public class Test  {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket, "窗口一");
        Thread thread2 = new Thread(ticket, "窗口二");
        Thread thread3 = new Thread(ticket, "窗口三");
        Thread thread4 = new Thread(ticket, "窗口四");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
