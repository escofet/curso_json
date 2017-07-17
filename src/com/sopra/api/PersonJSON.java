package com.sopra.api;

import java.util.ArrayList;

public class PersonJSON {
    public String name;
    public String lastname;
    public int age;
    public String email;
    public ArrayList<String> hobbies;

    public PersonJSON() {
        this.hobbies = new ArrayList<>();
    }
}
