package day14_02.work5;

public class Test {
    public static void main(String[] args) {
        try {
//            login("aaa","bbb");
//            login("admin","555");
            login("admin","123456");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    public static void login(String name,String pwd) throws LoginException {
        if (name!="admin"){
            throw new LoginException("用户不存在");
        }else if (pwd!="123456"){
            throw new LoginException("密码错误");
        }else {
            System.out.println("欢迎name");
        }

    }
}
