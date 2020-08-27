package day10_test.test4;

public class Test {
    public static void main(String[] args) {
//    new Start(new Task() {
//        @Override
//        public void task() {
//            System.out.println("开启");
//        }
//    }).run();
       // new Start(() -> System.out.println("开启")).run();
       invokeCalc(120,130,(int a,int b)->{return a+b;});
    }

    private static void invokeCalc(int a, int b, Task task) {
        int result = task.add(a, b);
        System.out.println("结果是：" + result);
    }
}
