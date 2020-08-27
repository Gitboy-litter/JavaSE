package day10_test.test9;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;


public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,8,6,9,8,7,8};
        IntStream stream =  Arrays.stream(arr);
        stream.distinct().forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });
    }
}
