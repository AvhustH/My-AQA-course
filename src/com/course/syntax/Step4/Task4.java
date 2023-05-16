package com.course.syntax.Step4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введіть ваш вік: ");
            Scanner scanOld = new Scanner(System.in);
            int old = scanOld.nextInt();
            if (old >= 140) {
                System.out.println("Вік не вірний.");
            } else if (old <= 0) {
                System.out.println("Вік не вірний.");
            } else {
                System.out.println("Ваш вік правильний");
                break;
            }
        }
    }
}

