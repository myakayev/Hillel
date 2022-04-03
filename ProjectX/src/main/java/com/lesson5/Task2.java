package com.lesson5;

public class Task2 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < 100; i++) {
            n *= i + 1;
            if (n > 1000) {
                System.out.println(n);
                break;
            }
        }
    }
}
