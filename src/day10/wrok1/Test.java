package day10.wrok1;

public class Test  {
    public static void main(String[] args) {
        String num="23.2655373";
      HandleAble handleAble= ((number)->{
            System.out.println("原数字为："+num);
                double y=Double.parseDouble(num);
                long a=Math.round(y);
                System.out.println("取整后："+a);
                System.out.println("保留4为小数后："+String.format("%.4f",y));
        });
      handleAble.HandleString(num);
    }
}
