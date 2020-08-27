package day14_02.work1;

public class Test {
    public static void main(String[] args) throws Exception { ;
        testThrows();
        testTryCatch();
    }
    public static char charAt(String str, int index){
            char[] chars = str.toCharArray();
            if (str==null){
                throw new NullPointerException("字符串不能为null");
            }else if (str==""){
                throw new NullPointerException("字符串不能为空");
            }
        if (index>chars.length){
            throw new ArrayIndexOutOfBoundsException("该索引在数组中不存在，已超出范围");
        }
            return chars[index];
    }
    public static void testThrows() throws Exception{
        String string=null;
        charAt(string,5);
    }
    public static void testTryCatch(){
        try {
            String string = null;
            charAt(string,5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
