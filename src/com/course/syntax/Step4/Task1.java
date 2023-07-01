package com.course.syntax.Step4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введіть число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) {
            System.out.println("Ви ввели відємне число");
        } else if (number % 3 == 0) {
            System.out.println("Число кратне трьом");
        } else if (number % 2 == 0) {
            for (int x = 0; x <= number; x++) {
                System.out.println(x);
            }
            System.out.println("Число парне");
        } else {
            for (int x = 0; x <= number; x++) {
                System.out.println(x);
            }
        }

    }
}
