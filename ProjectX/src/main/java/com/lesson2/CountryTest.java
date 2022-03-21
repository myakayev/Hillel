package com.lesson2;

public class CountryTest {
    public static void main(String[] args) {
        Country country1 = new Country("Ukraine", 603,"Kyiv","Volodymyr Zelenskii");
        Country country2 = new Country("Poland", 312,"Warsaw","Andrzej Duda");
        Country country3 = new Country("USA", 3796,"Washington, D.C","Joe Biden");
        country1.countryInfo();
        country2.countryInfo();
        country3.countryInfo();
    }
}
