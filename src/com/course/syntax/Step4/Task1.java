package com.course.syntax.Step4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введіть число від 0 до 100: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int remainder2 = number % 2;
        int remainder3 = number % 3;
        if (number > 100) {
            System.out.println("Число більше 100");
        } else if (number < 0) {
            System.out.println("Ви ввели відємне число");
        } else if (remainder2 == 0) {
            for (int x = 0; x <= number; x++) {
                System.out.println(x);
            }
            System.out.println("Число парне");
        } else if (remainder3 == 0) {
            System.out.println("Число кратне трьом");
        }
    }
}
