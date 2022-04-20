package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        for (Score d : GlobalRating.data) {
            System.out.print(d.category + ": ");
            System.out.println(Arrays.toString(d.statistic));
        }

        // Второй способ. Пусть он лежит здесь для меня, чтоб я понимал,
        // как там под капотом все :)
//        for (int i = 0; i < GlobalRating.data.length; i++) {
//            System.out.print(GlobalRating.data[i].category + " ");
//            for (int j = 0; j < GlobalRating.data[i].statistic.length; j++) {
//                System.out.print(GlobalRating.data[i].statistic[j] + " ");
//            }
//            System.out.println();
//        }
    }
}
