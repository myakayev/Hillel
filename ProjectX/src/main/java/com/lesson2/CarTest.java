package com.lesson2;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Lexus", "green", 150);
        Car car2 = new Car("Audi", "red", 200);
        Car car3 = new Car("Zaporozhets'", "gold", 45);
        car1.carInfo();
        car2.carInfo();
        car3.carInfo();
    }
}
