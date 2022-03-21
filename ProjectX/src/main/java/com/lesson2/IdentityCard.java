package com.lesson2;

public class IdentityCard {
    int code;
    String firstName;
    String lastName;
    IdentityCard (int code, String firstName, String lastName){
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void cardInfo() {
        System.out.println("Code - " + code + "\n" + "First Name - " + firstName + "\n" + "Last Name - " +
                lastName + "\n");
    }
}
