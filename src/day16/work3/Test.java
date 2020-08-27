package day16.work3;

public class Test {
    public static void main(String[] args) {
        invokeDirect(()->{
            System.out.println("拍电影");
        });
        invokeDirect(()-> System.out.println("拍电影"));
    }
    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
