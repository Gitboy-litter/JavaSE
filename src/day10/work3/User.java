package day10.work3;

import java.util.ArrayList;

public class User  {
    private String type;
    private int id;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
