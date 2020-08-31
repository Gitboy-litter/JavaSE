package day14_test.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

public class JDBC {
    static String URL = "jdbc:mysql://localhost:3306/chen?characterEncoding=utf-8";
    static String USER = "root";
    static String PASSWORD = "root";

    public static void login(HashMap<String, String> map, String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "select * from user ";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
                    System.out.println("登陆成功");
                    System.out.println(rs.getString("username") + ",欢迎光临");
                    return;
                }
            }
            System.out.println("账号密码不准确");
            mode(map);
            conn.close();
            rs.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void register(HashMap<String, String> map, String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql2 = "select * from user ";
            Statement statement1 = conn.createStatement();
            ResultSet rs1 = statement1.executeQuery(sql2);
            while (rs1.next()) {
                if (rs1.getString("username").equals(username)) {
                    System.out.println("用户已经存在");
                    mode(map);
                } else {
                    String sql = "insert into user(username,password) values('" + username + "','" + password + "')";
                    Statement statement = conn.createStatement();
                    boolean rs = statement.execute(sql);
                    System.out.println("创建成功");
                    mode(map);
                    conn.close();
                    statement.close();
                    break;
                }
                conn.close();
                rs1.close();
                statement1.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        mode(hashMap);
    }

    public static void mode(HashMap<String, String> hashMap) {
        System.out.println("1.登陆        2.注册");
        System.out.println("请选择模式");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        boolean flag = true;
        while (flag) {
            switch (i) {
                case 1:
                    while (true) {
                        System.out.println("登陆界面");
                        System.out.println("请输入账号:");
                        String username = scanner.next();
                        System.out.println("请输入密码:");
                        String password = scanner.next();
                        hashMap.put(username, password);
                        login(hashMap, username, password);
                        flag = false;
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("注册界面");
                        System.out.println("请输入账号:");
                        String username = scanner.next();
                        System.out.println("请输入密码:");
                        String password = scanner.next();
                        hashMap.put(username, password);
                        register(hashMap, username, password);
                        flag = false;
                        break;
                    }
                    break;
            }
        }
    }
}
