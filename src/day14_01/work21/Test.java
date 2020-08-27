package day14_01.work21;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> poke = new HashMap<>();
        String[] color = {"♦","♣","♥", "♠",};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int count = 0;
        for (int j = 0; j < number.length; j++) {
            for (int i = 0; i < color.length; i++) {
                poke.put(count++, color[i] + number[j]);
            }
        }
        poke.put(count++, "大☠");
        poke.put(count++, "小☠");
        ArrayList<String> pokelist = new ArrayList<>();
        for (String card : poke.values()) {
            pokelist.add(card);
        }
        Collections.shuffle(pokelist);
        HashMap<Integer, String> play1 = new HashMap<>();
        HashMap<Integer, String> play2 = new HashMap<>();
        HashMap<Integer, String> play3 = new HashMap<>();
        HashMap<Integer, String> dipai = new HashMap<>();
        for (int i = 0; i < pokelist.size(); i++) {
            if (i >= 51) {
                for (Integer integer : poke.keySet()) {
                    if (poke.get(integer) == pokelist.get(i)) {
                        dipai.put(integer, pokelist.get(i));
                    }
                }
            } else {
                if (i % 3 == 0) {
                    for (Integer integer : poke.keySet()) {
                        if (poke.get(integer) == pokelist.get(i)) {
                            play1.put(integer, pokelist.get(i));
                        }
                    }
                } else if (i % 2 == 0) {
                    for (Integer integer : poke.keySet()) {
                        if (poke.get(integer) == pokelist.get(i)) {
                            play2.put(integer, pokelist.get(i));
                        }
                    }
                } else {
                    for (Integer integer : poke.keySet()) {
                        if (poke.get(integer) == pokelist.get(i)) {
                            play3.put(integer, pokelist.get(i));
                        }
                    }
                }
            }
        }
        carrypoke(play1, dipai);
        carrypoke(play2, dipai);
        carrypoke(play3, dipai);
    }

    public static void carrypoke(HashMap<Integer, String> map, HashMap<Integer, String> dipai) {
        if (map.values().contains("大☠")) {
            for (Integer integer : dipai.keySet()) {
                map.put(integer, dipai.get(integer));
            }
        }
            ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>();
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                list.add(entry);
            }
            Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
                @Override
                public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                    return o1.getKey()-o2.getKey();
                }
            });
        for (Map.Entry<Integer, String> entry : list) {
            System.out.print(entry.getValue()+" ");
        }
            System.out.println();
    }
}
