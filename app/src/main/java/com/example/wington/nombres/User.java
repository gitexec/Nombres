package com.example.wington.nombres;

/**
 * Created by wington on 10/30/16.
 */
import java.util.*;

public class User {

    private String name;
    private String hometown;

    public User(String name, String hometown){
        this.name = name;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public static List<User> fakeUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User("Rafi", "Neyba"));
        users.add(new User("Pete","Villa"));
        return users;
    }
}
