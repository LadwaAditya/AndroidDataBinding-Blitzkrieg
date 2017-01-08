package com.ladwa.aditya.databinding_blitzkrieg;

import android.databinding.BaseObservable;

/**
 * Created by Aditya on 07-Jan-17.
 */

public class User extends BaseObservable {
    private final String firstName;
    private final String lastName;
    private final int age;
    private boolean clicked;

    public User(String firstName, String lastName, int age, boolean clicked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.clicked = clicked;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = !clicked;
//        notifyPropertyChanged(BR.clicked);
    }

    @Override public String toString() {
        return firstName + lastName + "Age is " + age;
    }
}
