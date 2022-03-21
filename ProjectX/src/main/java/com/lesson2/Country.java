package com.lesson2;

public class Country {
    String name;
    int area;
    String capital;
    String president;
    Country (String name, int area, String capital, String president) {
        this.name = name;
        this.area = area;
        this.capital = capital;
        this.president = president;
    }
    void countryInfo () {
        System.out.println("Name - " + name + "\n" + "Capital - " + capital + "\n" + "President - " +
                president + "\n");
    }
}
