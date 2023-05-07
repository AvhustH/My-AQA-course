package com.course.syntax.Step4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int old;
        for (old = 5; old > 3; old++) {
            System.out.print("Введіть ваш вік: ");
            Scanner scanOld = new Scanner(System.in);
            int old2 = scanOld.nextInt();
            if (old2 >= 140) {
                System.out.println("Вік не вірний.");
            } else if (old2 <= 0) {
                System.out.println("Вік не вірний.");
            } else {
                System.out.println("Ваш вік правильний");
                break;
            }
        }
    }
}

