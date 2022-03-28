package com.lesson4;

public class Square {
    int x;
    Square(int x){
        this.x = x;
    }
    void checkAreaAndPerimeter() {
        int s = x*x;
        int p = x*4;
        boolean a = (s == p);
        String string = "Периметр равен площади:";
        System.out.println(string + a);
    }
}
