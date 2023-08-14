package com.course.syntax.Step6;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть речення");
        String inputString = sc.nextLine();
        char[] testArray = inputString.toCharArray();
        System.out.println("Введіте символ для пошуку");
        String inputSymbol = sc.nextLine();
        char[] testArraySymbol = inputSymbol.toCharArray();
        int countSumbol = 0;

        for (char k : testArray) {
            if (Objects.equals(k, testArraySymbol[0])) {
                countSumbol++;
            }

        }
        System.out.println("У реченні символ " + inputSymbol + " згадується " + countSumbol + " рази");

    }
}


