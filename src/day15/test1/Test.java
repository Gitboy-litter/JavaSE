package day15.test1;

public class Test  {
    public static void main(String[] args) {
        Thread thread=new Thread("一线程");
        System.out.println(thread.getName());
        thread.start();
        Threadclass threadclass=new Threadclass();
        threadclass.start();
        ThreadImp threadImp=new ThreadImp();
        Thread thread1=new Thread(threadImp);
        thread1.start();
    }
}
