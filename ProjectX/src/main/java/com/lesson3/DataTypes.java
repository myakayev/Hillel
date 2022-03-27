package com.lesson3;

public class DataTypes {
    public static void main(String[] args) {
        // Task 1
        byte a = -125;
        short b = 32761;
        int c = 2_147_483_647;
        long d = 2 ^ 64;
        float e = 1000.68523f;
        double f = 1000000.68523;
        char g = 'A';
        boolean h = true;

        System.out.println("Значение типа byte = " + a);
        System.out.println("Значение типа short = " + b);
        System.out.println("Значение типа int = " + c);
        System.out.println("Значение типа long = " + d);
        System.out.println("Значение типа float = " + e);
        System.out.println("Значение типа double = " + f);
        System.out.println("Значение типа char = " + g);
        System.out.println("Значение типа boolean = " + h);

        //Task 2
        int one = 10_000_000;
        double two = 100.066_123_455;
        double three = 15_500_088.4_433_112_201;
        System.out.println(one + "\n" + two + "\n" + three);

        //Task3
        char char1 = '\u00A9';
        char char2 = '\u00b5';
        char char3 = '\u00ae';

        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
    }
}
