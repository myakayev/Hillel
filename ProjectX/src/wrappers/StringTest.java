package wrappers;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // 2
        String l1 = "a";
        String l2 = new String("aa");
        char ch[] = {'a', 'b', 'c'};
        String l3 = new String(ch);
        String l4 = "abb";
        String l5 = new String(l4.getBytes());
        StringBuilder stringBuilder = new StringBuilder("aaff");
        String l6 = stringBuilder.toString();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        // 3.1
        String s = "Апельсин,Яблоко,Гранат,Груша";
        // 3.2
        String arr[] = s.split(",");
        // 3.3
        String str = "";
        for (String d: arr) {
            if (d.length() > str.length()) {
                str = d;
            }
        }
        System.out.println(str.toLowerCase());
        // 3.4
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0,3);
        }
        String substr = Arrays.toString(arr);
        System.out.println(substr);
        // 3.5
        String str1 = "   Я_новая_строка      ";
        // 3.6 - 3.8
        str1 = str1.trim().replace("_", " ");
        System.out.println(str1);
        // 3.9 - 3.12
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Вы ввели: " + word);

        if (word.startsWith("Запуск")){
            System.out.println("Запускаем процесс");
        }
        if (word.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (word.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }
        // 4
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(l1).append(l2).append(l3 + "\n").append(l4).append(l5).append(l6 + "\n").append(s).append(str).
                append(str1 + "\n");
        stringBuilder1.reverse();
        String test = stringBuilder1.toString();
        System.out.println(test);














    }
}
