package day17.work9;

public class Test {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    public static int  sum(int n){
        if (n<=0){
            return n;
        }
        return n+sum(n-1);
    }
}
