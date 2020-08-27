package day13.work14;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add('a');
        Scanner scanner=new Scanner(System.in);
        for (char c : scanner.nextLine().toCharArray()) {
            linkedHashSet.add(c);
        }
        for (Character character : linkedHashSet) {
            System.out.println(character);
        }
    }
}
