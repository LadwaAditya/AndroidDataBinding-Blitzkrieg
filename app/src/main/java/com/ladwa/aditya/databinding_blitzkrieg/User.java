package com.ladwa.aditya.databinding_blitzkrieg;

/**
 * Created by Aditya on 07-Jan-17.
 */

public class User {
    private final String firstName;
    private final String lastName;
    private final String age;

    public User(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }
}
