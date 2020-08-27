package day15.test2;

public class Test {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        });
        thread.start();
      Thread thread1=new Thread(new Runnable() {
          @Override
          public void run() {
              for (int i = 0; i < 1000; i++) {
                  System.out.println("显示画面");
              }
          }
      });
      thread1.start();
    }
}
