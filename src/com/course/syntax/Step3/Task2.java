package com.course.syntax.Step3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введіть ціле число від 1 до 100 ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextInt();
        double remainder = number % 2;
        if (number == 0) {
            System.out.println("Число має бути більше або менше 0");
        } else if (number > 100) {
            System.out.println("Число має бути менше 100");
        } else if (remainder == 0) {
            System.out.println(number + " це парне число");
        } else {
            System.out.println(number + " це НЕ парне число");
        }
    }
}
