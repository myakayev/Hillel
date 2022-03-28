package com.lesson4;

public class Test {
    public static void main(String[] args) {
        // Task1
        Square square1 = new Square(2);
        Square square2 = new Square(4);
        square1.checkAreaAndPerimeter();
        square2.checkAreaAndPerimeter();

        // Task2
        byte a = 1;
        short b = a;
        int c = b;
        long d = c;
        System.out.println(a + " " + b + " " + c + " " + d); // byte -> short -> int -> long
        int e = -2;
        double f = e;
        System.out.println(e + " " + f); // int -> double
        float g = b;
        double h = b;
        System.out.println(b + " " + g + " " + h); // short -> float -> double
        char ch = '8';
        int j = ch;
        System.out.println(j); // char -> int

        //Task 3
        int n = 2147483647;
        float t = (float) n;
        System.out.println(n + " " + t);

        // Task 4
        byte l = 127;
        l++;
        System.out.println(l);


    }
}
