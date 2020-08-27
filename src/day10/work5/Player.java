package day10.work5;

public class Player {
    public  FightAble select(String str){
        if (str=="武力角色"){
            Warrior w=new Warrior();
            return w;
        }else if (str=="法力角色"){
            Mage m=new Mage();
            return m;
        }
      return null;
    }
}
