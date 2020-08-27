package day10.work3;

import java.util.ArrayList;

public class Receptionist {
    private Filte filte;

    public Receptionist() {
    }


    public Receptionist(Filte filte) {
        this.filte = filte;
    }

    public Filte getFilte() {
        return filte;
    }

    public void setFilte(Filte filte) {
        this.filte = filte;
    }
    public void Reception(User user){
        if (user.getType()!=null){
            return;
        }else if (filte!=null){
            filte.filterUser(user);
            return;
        }else {
            user.setType("A");
        }
    }
}
