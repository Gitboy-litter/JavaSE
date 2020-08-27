package day12.work12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poke {
    public static void main(String[] args) {
        ArrayList<String> poke=new ArrayList<>();
        String[] color={"♣","♠","♦","♥"};
        String[] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                poke.add(color[i]+number[j]);
            }
        }
        poke.add("大☠");
        poke.add("小☺");
        Collections.shuffle(poke);
//        ArrayList<String> poke1 = new ArrayList<>();
//        ArrayList<String> poke2 = new ArrayList<>();
//        ArrayList<String> poke3 = new ArrayList<>();
//        ArrayList<String> dipai = new ArrayList<>();
//        for (int i = 0; i < poke.size(); i++) {
//            if (i>=51){
//                dipai.add(poke.get(i));
//            }else {
//                if (i%3==1){
//                    poke1.add(poke.get(i));
//                }else  if (i%3==2){
//                    poke2.add(poke.get(i));
//                }else if (i%3==0){
//                    poke3.add(poke.get(i));
//                }
//            }
//        }
        row(poke);
    }
    public static ArrayList Licensing(ArrayList play,ArrayList dipai){
        if (play.contains("大☠")){
            play.addAll(dipai);
        }
        return play;
    }
    public static void row(ArrayList<String> poke){
        ArrayList<String> poke1 = new ArrayList<>();
        ArrayList<String> poke2 = new ArrayList<>();
        ArrayList<String> poke3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poke.size(); i++) {
            if (i>=51){
                dipai.add(poke.get(i));
            }else {
                if (i%3==1){
                    poke1.add(poke.get(i));
                }else  if (i%3==2){
                    poke2.add(poke.get(i));
                }else if (i%3==0){
                    poke3.add(poke.get(i));
                }
            }
        }
        Collections.sort(poke1);
        Collections.sort(poke2);
        Collections.sort(poke3);
       if (dipai.contains("大☠")){
           row(poke);
       }else {
           System.out.println("小明"+Licensing(poke1,dipai));
           System.out.println("小张"+Licensing(poke2,dipai));
           System.out.println("小王"+Licensing(poke3,dipai));
       }
    }
}
