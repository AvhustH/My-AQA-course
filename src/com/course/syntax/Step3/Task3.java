package com.course.syntax.Step3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введіть число із двома знаками після коми ");
        Scanner scan = new Scanner(System.in);
        float number = scan.nextFloat();
        float remainder = number % 2;
        if (remainder == 0 && number > 10 || number == 15) {
                System.out.println(number + " це група 1");
        } else {
            System.out.println(number + " це група 2");
        }
    }
}
