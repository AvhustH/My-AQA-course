package com.course.syntax.Step6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть речення: ");
        String input = sc.nextLine();
        String newText = "";

        if (input.contains("java")) {
            char[] arrayWithJava = input.toCharArray();
            int i;
            for (i = input.length() - 1; i > -1; i--) {
                System.out.print(arrayWithJava[i]);
            }
        } else {
            String[] arrayWithoutJava;
            arrayWithoutJava = input.split(" ");
            int i;
            for (i = 0; i < arrayWithoutJava.length; i++) {
                if (arrayWithoutJava[i].length() % 2 == 0) {
                    newText = newText + arrayWithoutJava[i].toUpperCase() + " ";
                } else {
                    newText = newText + arrayWithoutJava[i].toLowerCase() + " ";
                }

            }
        }
        System.out.println(newText);
    }
}


