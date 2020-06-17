package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str, substring, helpStr;
        System.out.println("Введите строку:");
        str = in.next();
        int index, n, echo;
        long start, end;
        do {
            System.out.println("Введите n: \n" + "1.ввести другю строку\n" + "2.дополнить строку\n"
                    + "3.поиск подстроки\n" + "4.выход\n");
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Введите строку:");
                    str = in.next();
                    break;
                case 2:
                    System.out.println("Введите строку:");
                    str += in.next();
                    System.out.println("Новая полученная строка:\n" + str);
                    break;
                case 3:
                    System.out.println("Введите подстроку:");
                    substring = in.next();
                    System.out.println("Чувствительность к регистору? (0 - нет, 1- да)");
                    echo = in.nextInt();
                    if (echo == 0) {
                        helpStr = str.toLowerCase();
                        substring = substring.toLowerCase();
                    }
                    start = System.currentTimeMillis();
                    index = StringSearch.getFirstEntry(str, substring);
                    end = System.currentTimeMillis();
                    System.out.println("MyStringSearch: firstIndex: " + (index + 1) + " time: " + (end - start));
                    start = System.currentTimeMillis();
                    index = str.indexOf(substring);
                    end = System.currentTimeMillis();
                    System.out.println("Default search: firstIndex: " + (index + 1) + " time: " + (end - start));
                    break;
                default:
                    break;
            }
        }
        while (n!=4);
    }
}
