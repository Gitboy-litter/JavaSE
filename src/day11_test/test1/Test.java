package day11_test.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张无忌");
        list.add("张三丰");
        list.add("周芷若");
        list.add("刘欢");
        list.add("张强");
//        list.stream().limit(2).filter(n->{return n.startsWith("张");}).forEach(n->
//                System.out.println(n)
//        );
        list.stream().limit(3).collect(Collectors.toSet()).forEach(n-> System.out.println(n));
        System.out.println(list.stream().count());
//        list.stream().skip(2).forEach(System.out::println);
//        Stream.concat(list.stream().limit(2),list.stream().skip(3)).forEach(n->{
//            System.out.println(n);
//        });
    }
}
