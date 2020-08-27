package day16.work4;

public class Test {
    public static void main(String[] args) {
        invokeCalc(130,120,(int a,int b)->{
            return a-b;
        });
        invokeCalc(130,120,(a,b)->{return a-b;});
    }
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
