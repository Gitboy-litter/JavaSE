package day10.work5;

public interface FightAble {
    void specialFight();
    default void commonFight(){
        System.out.println("普通攻击");
    }
}
