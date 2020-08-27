package day17.work10;

public class Test {
    public static void main(String[] args) {
        System.out.println(sum(8));
    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
       return n*sum(n-1);
    }
}
