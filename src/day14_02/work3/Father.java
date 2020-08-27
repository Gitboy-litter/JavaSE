package day14_02.work3;

public class Father {
    public static void main(String[] args) {

    }
    public void eat(String s) throws ToothPainException {
        if (s.equals("石头")){
            throw new ToothPainException("牙疼的异常");
        }
    }
    public void drink(){
        System.out.println("喝什么都没有问题");
    }
}
