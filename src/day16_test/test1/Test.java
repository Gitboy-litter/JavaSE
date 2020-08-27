package day16_test.test1;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        MyRun1 myRun1=new MyRun1(user);
        MyRun2 myRun2=new MyRun2(user);
        Thread thread=new Thread(myRun1);
        Thread thread1=new Thread(myRun2);
        thread1.setPriority(10);
        thread.setPriority(3);
        thread.start();
        thread1.start();
    }
}
