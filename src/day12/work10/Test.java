package day12.work10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "c", "a", "b", "b", "b", "a"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(frequency(list, "a"));
    }

    public static int frequency(ArrayList list, String key) {
        int sum=0;
        for (Object o : list) {
            if (o==key){
                sum++;
            }
        }
        return sum;
    }
}
