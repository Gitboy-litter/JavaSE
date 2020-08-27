package day17.work2;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\a.txt");
        if (!file.exists()){
            file.createNewFile();
        }else {
            System.out.println("存在");
        }
    }
}
