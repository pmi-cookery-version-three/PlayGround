package emotive912.pmiplayground;

import java.io.Serializable;

public class User implements Serializable {

    String name;
    String surname;


    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
}
