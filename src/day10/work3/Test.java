package day10.work3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            User user=new User(i);
            list.add(user);
        }
        System.out.println("未分组");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getId()+"-"+list.get(i).getType()+" ");
            if ((i+1)%9==0){
                System.out.println();
            }
        }
        Receptionist r1=new Receptionist();
        Receptionist r2=new Receptionist();
        Receptionist r3=new Receptionist();
        r1.setFilte(new Filte() {
            @Override
            public void filterUser(User user) {
                if (user.getId()>=10&&user.getId()<=20){
                    user.setType("v1");
                }
            }
        });
        r2.setFilte(new Filte() {
            @Override
            public void filterUser(User user) {
                if (user.getId()>20&&user.getId()<30){
                    user.setType("v1");
                }
            }
        });
        for (int i = 0; i < list.size(); i++) {
            r1.Reception(list.get(i));
            r2.Reception(list.get(i));
            r3.Reception(list.get(i));
        }
        System.out.println("已经分组");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j).getId()+"-"+list.get(j).getType()+" ");
            if ((j+1)%9==0){
                System.out.println();
            }
        }
        }
    }
