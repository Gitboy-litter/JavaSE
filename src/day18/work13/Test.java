package day18.work13;
import java.io.*;
import java.util.Properties;
public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("d:\\score.txt"));
        for (String s : properties.stringPropertyNames()) {
            if ("lisi".equals(s)) {
                properties.setProperty("lisi", "100");
                FileOutputStream fileOutputStream = new FileOutputStream("d:\\a.txt");
                properties.store(fileOutputStream, null);
                //  fileOutputStream.close();
            }
            System.out.println(s + " ‐‐ " + properties.getProperty(s));
        }
    }
}
