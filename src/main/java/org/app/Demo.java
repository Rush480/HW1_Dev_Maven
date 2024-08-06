package org.app;

import com.google.gson.Gson;
import org.app.person.Person;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new Person("Denys", "Rashevskyy")));
    }
}