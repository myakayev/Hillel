package com.lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        String[] fruits = {"Peach", "Orange", "Apple", "Peach", "Banana"};
        //System.out.println(Arrays.toString(fruits));

        // Task 2
        String[] food = Arrays.copyOf(fruits, fruits.length);

        // Task 3
        for (String a : food) {
            System.out.println(a);
        }

        // Task 4
        int[][] score = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                score[i][j] = 10 * (i + 1) + j;
            }
        }
        for (int[] firstLevel : score) {
            for (int item : firstLevel) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        // Task 5
        long[] result = new long[score.length];
        for (int i = 0; i < score.length; i++) {
            long q = 0;
            for (int val : score[i]) {
                q += val;
            }
            result[i] = q;
            System.out.print(result[i] + " ");
        }
    }
}
