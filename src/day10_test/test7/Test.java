package day10_test.test7;

public class Test {
    public static void main(String[] args) {
        invoke((food)->{
            System.out.println("eat"+food);
            return food;
        },"egg");
    }
    public static void invoke(MakeFood makeFood,String food){
        makeFood.eat(food);
    }
}
