package day10.work5;

public class Test {
    public static void main(String[] args) {
        Player player1=new Player();
        FightAble fightAble= player1.select("武力角色");
        System.out.println("选择：武力角色");
        fightAble.commonFight();
        fightAble.specialFight();
        Player player2=new Player();
        FightAble fightAble2= player1.select("法力角色");
        System.out.println("选择：法力角色");
        fightAble2.commonFight();
        fightAble2.specialFight();
    }
}
