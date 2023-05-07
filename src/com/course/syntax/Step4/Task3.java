package com.course.syntax.Step4;

import java.util.Scanner;

public class Task3 {
    public static int calculateDivisor() {
        System.out.print("Введіть число від 1 до 100 : ");
        Scanner scan = new Scanner(System.in);
        float number = scan.nextInt();
        if (number > 100) {
            System.out.println("Число більше ");
            return 100;
        } else {
            float resalt;
            float test;
            for (test = number - 1; 1 <= test; test--) {
                resalt = number / test;
                if (resalt % 1 == 0) {
                    break;
                }
            }
            return (int) test;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateDivisor());
    }
}

