package day14_01.work8;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String[] split = scanner.next().split(",");
            map.put(split[0],split[1]);
        }
        System.out.println(map);
    }
}
