package com.course.syntax.Step6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть речення");
        String inputString = sc.nextLine();
        char[] testArray = inputString.toCharArray();
        System.out.println("Введите символ для пошуку");
        String inputSymbol = sc.nextLine();
        char[] testArraySymbol = inputSymbol.toCharArray();
        int countSumbol = 0;

        int i;
        for (i = 0; i < testArray.length; i++) {
            if (testArray[i] == testArraySymbol[0]) {
                countSumbol++;
            }
        }
        System.out.println("У реченні символ " + inputSymbol + " згадується " + countSumbol + " рази");

    }
}


