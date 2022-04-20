package Task2;

import java.util.Arrays;

public class Score {
    String category;
    double[] statistic;

    {
        statistic = new double[10];
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = Math.ceil(Math.random() * 10000) / 100;
        }
    }
}
