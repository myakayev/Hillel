package com.lesson2;

public class Car {
    String brand;
    String color;
    int power;
    Car (String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }
    void carInfo() {
        System.out.println("Brand - " + brand + "\n" + "Color - " + color + "\n" + "Power - " +
                power + "\n");
    }
}
